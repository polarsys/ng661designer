/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.parts;

/**
 * 
 * 
 */
public class ScxmlViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * ScxmlOnexecuteType view descriptor
	 * 
	 */
	public static class ScxmlOnexecuteType {
		public static class Properties {
	
			
			public static String send = "scxml::ScxmlOnexecuteType::properties::send";
			
			
			public static String script = "scxml::ScxmlOnexecuteType::properties::script";
			
	
		}
	
	}

	/**
	 * ScxmlParamType view descriptor
	 * 
	 */
	public static class ScxmlParamType {
		public static class Properties {
	
			
			public static String name = "scxml::ScxmlParamType::properties::name";
			
			
			public static String expr = "scxml::ScxmlParamType::properties::expr";
			
	
		}
	
	}

	/**
	 * ScxmlScriptType view descriptor
	 * 
	 */
	public static class ScxmlScriptType {
		public static class Properties {
	
			
			public static String src = "scxml::ScxmlScriptType::properties::src";
			
			
			public static String content = "scxml::ScxmlScriptType::properties::content";
			
	
		}
	
	}

	/**
	 * ScxmlScxmlType view descriptor
	 * 
	 */
	public static class ScxmlScxmlType {
		public static class Properties {
	
			
			public static String id = "scxml::ScxmlScxmlType::properties::id";
			
			
			public static String version = "scxml::ScxmlScxmlType::properties::version";
			
			
			public static String initial = "scxml::ScxmlScxmlType::properties::initial";
			
	
		}
	
	}

	/**
	 * ScxmlSendType view descriptor
	 * 
	 */
	public static class ScxmlSendType {
		public static class Properties {
	
			
			public static String event = "scxml::ScxmlSendType::properties::event";
			
			
			public static String param = "scxml::ScxmlSendType::properties::param";
			
	
		}
	
	}

	/**
	 * ScxmlStateType view descriptor
	 * 
	 */
	public static class ScxmlStateType {
		public static class Properties {
	
			
			public static String id = "scxml::ScxmlStateType::properties::id";
			
			
			public static String initial = "scxml::ScxmlStateType::properties::initial";
			
	
		}
	
	}

	/**
	 * ScxmlTransitionType view descriptor
	 * 
	 */
	public static class ScxmlTransitionType {
		public static class Properties {
	
			
			public static String send = "scxml::ScxmlTransitionType::properties::send";
			
			
			public static String script = "scxml::ScxmlTransitionType::properties::script";
			
			
			public static String cond = "scxml::ScxmlTransitionType::properties::cond";
			
			
			public static String event = "scxml::ScxmlTransitionType::properties::event";
			
			
			public static String target = "scxml::ScxmlTransitionType::properties::target";
			
	
		}
	
	}

	/**
	 * DocumentRoot view descriptor
	 * 
	 */
	public static class DocumentRoot {
		public static class Properties {
	
	
		}
	
	}

}
