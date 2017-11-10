/*******************************************************************************
 * Copyright (c) 2015, 2017 THALES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.interpreter.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;

import interpreteurJNIDLL.InterfaceInterpreteur;

public class InterpreteurGLCanvas extends GLCanvas implements GLEventListener,
		MouseListener, MouseMotionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	private static int mCanvasWidth = 640;
	private static int mCanvasHeight = 480;
	private static int mX = 640;
	private static int mY = 480;
	private InterfaceInterpreteur mInterpreteur;
	private boolean mMode = true;


	public InterpreteurGLCanvas(InterfaceInterpreteur interpreteur) {
		this.mInterpreteur = interpreteur;
		this.addGLEventListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
	}

	@Override
	public void init(GLAutoDrawable pDrawable) {
		/* NOTHING TO DO */
	}

	@Override
	public void dispose(GLAutoDrawable pDrawable) {
		/* NOTHING TO DO */
	}

	@Override
	public void display(GLAutoDrawable pDrawable) {
		getNativeSurface().lockSurface();
		long lHandle = getHandle();
		mInterpreteur.drawScene(lHandle);
		this.getContext().makeCurrent();
		getNativeSurface().unlockSurface();
		repaint();
		swapBuffers();
	}

	@Override
	public void reshape(GLAutoDrawable pDrawable, int pX, int pY, int pWidth,
			int pHeight) {
		mCanvasWidth = pWidth;
		mCanvasHeight = pHeight;
		mX = pX;
		mY = pY;
		mInterpreteur.setSceneSize(pWidth, pHeight);
	}

	@Override
	public void mouseDragged(MouseEvent pE) {
		mInterpreteur.pointerMovedEvent(pE.getX(), pE.getY());

	}

	@Override
	public void mouseMoved(MouseEvent pE) {
		mInterpreteur.pointerMovedEvent(pE.getX(), pE.getY());

	}

	@Override
	public void mouseClicked(MouseEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void mousePressed(MouseEvent pE) {
		if ( (pE.getX() < mX + mCanvasWidth) && (pE.getY() < mY + mCanvasHeight)){ 
			mInterpreteur.pointerPressedEvent(pE.getButton());
		}
		else{
			/* NOTHING TO DO */
		}
	}

	@Override
	public void mouseReleased(MouseEvent pE) {
		mInterpreteur.pointerReleasedEvent(pE.getButton());
	}

	@Override
	public void mouseEntered(MouseEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void mouseExited(MouseEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void keyTyped(KeyEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void keyPressed(KeyEvent pE) {
		// TODO 
		if (pE.getKeyChar() == '+') {
			mInterpreteur.zoom(0.1);
		} else if (pE.getKeyChar() == '-') {
			mInterpreteur.zoom(-0.1);
		} else if (pE.getKeyChar() == '*') {
			mMode = !mMode;
			mInterpreteur.setResizeMode(mMode);
		}else{
			/* NOTHING TO DO */
		}

	}

	@Override
	public void keyReleased(KeyEvent pE) {
		// TODO
	}

}
