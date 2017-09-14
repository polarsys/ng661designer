/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import org.polarsys.ng661designer.dsl.part2.handler.NG661DesignerXmlHelper;
import org.polarsys.ng661designer.dsl.part2.handler.NGDesignerXMLLoad;
import org.polarsys.ng661designer.dsl.part2.handler.NGDesignerXMLSave;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.example.ng661.part2.util.Part2ResourceFactoryImpl
 * @generated
 */
public class Part2ResourceImpl extends XMLResourceImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public Part2ResourceImpl(URI uri) {
		super(uri);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#save(java.util.Map)
	 */
	@Override
	public void save(Map<?, ?> options) throws IOException {
		Map<Object, Object> map = new HashMap<>();
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		map.putAll(options);
		super.save(map);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#createXMLLoad()
	 */
	@Override
	protected XMLLoad createXMLLoad() {
		return new NGDesignerXMLLoad(createXMLHelper());
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#createXMLSave()
	 */
	@Override
	protected XMLSave createXMLSave() {
		return new NGDesignerXMLSave(createXMLHelper());
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#createXMLHelper()
	 */
	@Override
	protected XMLHelper createXMLHelper() {
		return new NG661DesignerXmlHelper(this);
	}

} // Part2ResourceImpl
