/*******************************************************************************
 * Copyright (c) 2015, 2017 THALES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.interpreter;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "ng661designer.interpreter";

	// The shared instance
	private static Activator plugin;


	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		System.loadLibrary("ICUDT52");
		System.loadLibrary("ICUUC52");
		System.loadLibrary("ICUIN52");

		System.loadLibrary("libwinpthread-1");

		// Mode Release
		System.loadLibrary("QT5CORE");
		System.loadLibrary("QT5GUI");
		System.loadLibrary("QT5WIDGETS");
		System.loadLibrary("QT5OPENGL");
		System.loadLibrary("QT5SCRIPT");
		System.loadLibrary("Qt5Concurrent");
		System.loadLibrary("QT5XML");
		System.loadLibrary("QWINDOWS");
		
		System.loadLibrary("InterpreteurDLL");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
