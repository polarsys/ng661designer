/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "text.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
extern "C" {
#include "GL/gl.h"
#include "GL/glext.h"
#include <ft2build.h>
#include FT_FREETYPE_H
#include FT_GLYPH_H
}
#include <stdarg.h>
#include "transformcapacities.h"
#include <QDebug>
#include <QString>
#include "alignementtype.h"



namespace AP2I
{
const char *Text::CLASS_NAME = "Text";


Text::Text(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
    if(FT_Init_FreeType(&mFtlibrary))
    {
      qDebug() << "ERROR: Could not init freetype library\n";
    }
    else
    {
        /* Nothing to do */
    }

    mFontLoaded.setValue("");
}

void Text::initDefaultFields(){
    BasicItem::initDefaultFields();

    if(!mFontSize.isDefined())
    {
        mFontSize = 12;
    }

    if(!mFontName.isDefined())
    {
        mFontName.setValue("Arial");
    }

    if(!mAlignment.isDefined())
    {
        mAlignment.setValue("leftOnly");
    }
}

bool Text::renderIn(RenderingContext &pContext)
{

    BasicItem::renderIn(pContext);

    initDefaultFields();
    runTransformCapacities();
    drawStringInOpenGL(pContext.currentX()+getX(), pContext.currentY()+getY(), value().getValue().c_str());

    return true;
}


void Text::drawStringInOpenGL(float x, float y, const char *format)
{
  FT_GlyphSlot slot;
  int pen_x, pen_y, n, xmax, ymax;
  QString texte(format);
  int num_chars = texte.count();
  pen_x = x;
  pen_y = y;
  xmax = 0;
  ymax = 0;

  if(mFtlibrary == NULL)
  {
      /*Nothing to do*/
  }
  else
  {
      if(!(mFontLoaded == fontName()))
      {
          std::string lFont = getFontName();
          lFont.append(".ttf");
          if(FT_New_Face(mFtlibrary, lFont.c_str(), 0, &mFtface))
          {
            qDebug() << "ERROR: Could not open font" << lFont.c_str() << "\n";
            mFtface = NULL;
            mFontLoaded.setValue("");
          }
          else
          {
            mFontLoaded = fontName();
          }
      }
      else
      {
          /* Nothing to do */
      }

      if (mFtface == NULL)
      {
          /* Nothing to do */
      }
      else
      {
          FT_Set_Pixel_Sizes(mFtface, 0, getFontSize());
          slot = mFtface->glyph;

           /* Calcul de la taille totale pour alignement */
           for ( n = 0; n<num_chars; n++ )
           {
             if(texte[n] == ' ')
             {
                xmax += getFontSize()/2;
             }
             else
             {
                 /* load glyph image into the slot (erase previous one) */
                int error = FT_Load_Char(mFtface, texte[n].unicode(), FT_LOAD_RENDER);
                if(error == 0)
                {
                   xmax += slot->advance.x >> 6;
                   if (ymax < slot->bitmap_top)
                   {
                        ymax = slot->bitmap_top;
                   }
                   else
                   {
                       /* Nothing to do */
                   }

                }
                else
                {
                    qDebug() << "ERROR: Character " << texte[n]  <<  " not loaded\n";
                }
              }
           }

            /* Calcul des positions de départ pour l'alignement */
            /* Calcul du y */
            if (alignment().value() == AlignementType::bottomLeft ||
                    alignment().value() == AlignementType::bottomCenter ||
                    alignment().value() == AlignementType::bottomRight ||
                    alignment().value() == AlignementType::leftOnly ||
                    alignment().value() == AlignementType::rightOnly  ||
                    alignment().value() == AlignementType::centerOnly)
            {
                pen_y = y;
            }
            else if (alignment().value() == AlignementType::topLeft ||
                     alignment().value() == AlignementType::topCenter ||
                     alignment().value() == AlignementType::topRight)
            {
                pen_y = y + getHeight() - ymax;
            }
            else
            {
                pen_y = y + ((getHeight() - ymax)/2);
            }

            /* Calcul du x */
            pen_x = x;
            if (alignment().value() == AlignementType::topLeft ||
                    alignment().value() == AlignementType::centerLeft ||
                    alignment().value() == AlignementType::bottomLeft ||
                    alignment().value() == AlignementType::leftOnly)
            {
                pen_x = x;
            }
            else if (alignment().value() == AlignementType::topRight ||
                     alignment().value() == AlignementType::centerRight ||
                     alignment().value() == AlignementType::bottomRight)
            {
                pen_x = x + getWidth() - xmax;
            }
            else
            {
                pen_x = x + ((getWidth() - xmax)/2);
            }


           /* Boucle pour dessiner */
           for ( n = 0; n<num_chars; n++ )
           {
             if(texte[n] == ' ')
             {
                pen_x += getFontSize()/2;
             }
             else
             {
                 /* load glyph image into the slot (erase previous one) */
                 int error = FT_Load_Char(mFtface, texte[n].unicode(), FT_LOAD_RENDER);
                 if(error == 0)
                 {
                     GLuint texture;

                     glPixelStorei(GL_UNPACK_ALIGNMENT, 1);
                     glGenTextures(1, &texture);
                     glBindTexture(GL_TEXTURE_2D, texture);
                     glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
                     glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
                     glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
                     glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);

                     glTexImage2D( GL_TEXTURE_2D,
                           0,
                           GL_ALPHA,
                           slot->bitmap.width,
                           slot->bitmap.rows,
                           0,
                           GL_ALPHA,
                           GL_UNSIGNED_BYTE,
                           slot->bitmap.buffer
                           );


                   glEnable(GL_BLEND);
                   glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

                   glEnable(GL_TEXTURE_2D);
                   glBindTexture(GL_TEXTURE_2D, texture);

                   int y2 = slot->bitmap.rows - slot->bitmap_top;

                   glColor3f(stroke().redf(), stroke().greenf(), stroke().bluef());

                   glBegin(GL_QUADS);
                   glTexCoord2i(0, 0); glVertex2i(pen_x, pen_y - y2 + slot->bitmap.rows);
                   glTexCoord2i(0, 1); glVertex2i(pen_x, pen_y - y2);
                   glTexCoord2i(1, 1); glVertex2i(pen_x + slot->bitmap.width, pen_y - y2);
                   glTexCoord2i(1, 0); glVertex2i(pen_x + slot->bitmap.width, pen_y - y2 + slot->bitmap.rows);
                   glEnd();

                   glDeleteTextures(1, &texture);

                   pen_x += slot->advance.x >> 6;
                  }
                else
                {
                    qDebug() << "ERROR: Character " << texte[n]  <<  " not loaded\n";
                }

            }
           }
      }

  }

}

bool Text::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    //pContext.setCurrentX(pContext.currentX() - getX());
    //pContext.setCurrentY(pContext.currentY() - getY());

    undoTransformCapacities();
    return true;
}


void Text::runTransformCapacities(){
    TransformCapacities::runOpenGLTransformCapacities( transform());
}
void Text::undoTransformCapacities(){
    TransformCapacities::undoOpenGLTransformCapacities( transform());
}
} /* namespace AP2I */

