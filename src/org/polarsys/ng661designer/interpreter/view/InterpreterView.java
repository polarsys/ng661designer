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

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.RepaintManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.jogamp.opengl.util.FPSAnimator;

import interpreteurJNIDLL.InterfaceInterpreteur;

/**
 * Interpreter view.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class InterpreterView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "ng661designer.design.view.InterpreterView";
	private static String TITLE = "Interpreteur";
	private static int mCanvasWidth = 640;
	private static int mCanvasHeight = 480;
	private static final int FPS = 60;
	private Composite embed;
	private InterfaceInterpreteur mInterpreteur;
	
	public InterfaceInterpreteur getInterpreteur() {
		return mInterpreteur;
	}

	private InterpreteurGLCanvas mCanvas;

	/**
	 * The constructor.
	 */
	public InterpreterView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		embed = new Composite(parent, SWT.EMBEDDED);
		embed.setLayout(new FillLayout());
	}
	
	protected void updateInterpreter(String fileString) {
		if (mCanvas != null) {
		// On appelle le constructeur de la dll en donnant en param�tre le
				// fichier xml, le handle de la fen�tre et la taille de la fen�tre
				mInterpreteur.createScene(fileString, mCanvas.getHandle(), mCanvasWidth,
						mCanvasHeight);
		}
	}

	protected void initInterpreter(String fileString) {
		// Create the OpenGL rendering canvas
		mInterpreteur = new InterfaceInterpreteur();
		mCanvas = new InterpreteurGLCanvas(mInterpreteur);

		// d�sactive le double buffering
		RepaintManager.currentManager(mCanvas).setDoubleBufferingEnabled(false);

		Frame lFrame = SWT_AWT.new_Frame(embed);
		RepaintManager.currentManager(mCanvas).setDoubleBufferingEnabled(true);
		lFrame.add(mCanvas);

//		 final JFrame lFrame = new JFrame();
//		 lFrame.getContentPane().add(mCanvas);
//		 lFrame.setVisible(true);

		// On indique qu'on a initialis� la fen�tre et on la bloque afin de
		// pouvoir
		// r�cup�rer le handle et dessiner dedans
		mCanvas.setRealized(true);
		mCanvas.getNativeSurface().lockSurface();

		// On r�cup�re le handle du canvas
		long lHandle = mCanvas.getHandle();

		// On appelle le constructeur de la dll en donnant en param�tre le
		// fichier xml, le handle de la fen�tre et la taille de la fen�tre
		mInterpreteur.createScene(fileString, lHandle, mCanvasWidth,
				mCanvasHeight);

		// On unlock la fen�tre
		mCanvas.getNativeSurface().unlockSurface();

		mCanvas.setPreferredSize(new Dimension(mCanvasWidth, mCanvasHeight));
		final FPSAnimator lAnimator = new FPSAnimator(mCanvas, FPS, true);

		// On lance la boucle d'affichage
		lFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new Thread() {
					@Override
					public void run() {
						if (lAnimator.isStarted()) {
							lAnimator.stop();
						} else {
							/* NOTHING TO DO */
						}
//						System.exit(0);
					}
				}.start();
			}
		});
		lFrame.setTitle(TITLE);
		lFrame.pack();
		lAnimator.start();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
	}
}
