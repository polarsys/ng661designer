/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.services;

import static com.google.common.base.Throwables.propagate;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/**
 * Reflexive methods.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class ReflexiveServices {

	/**
	 * @param fieldName
	 * @param object
	 * @return field value.
	 */
	public static Object get(String fieldName, Object object) {
		Object ret = null;
		try {
			Field field = getField(object.getClass(), fieldName);
			ret = field.get(object);
		} catch (Exception e) {
			handleException(e);
		}
		return ret;
	}

	/**
	 * @param cause
	 *            Throwable
	 */
	protected static void handleException(Throwable cause) {
		propagate(cause);
	}

	private static Field getField(Class<?> clazz, String fieldName) {
		try {
			Field declaredField = clazz.getDeclaredField(fieldName);
			makeAccessible(declaredField);
			return declaredField;
		} catch (NoSuchFieldException e) {
			Class<?> superClass = clazz.getSuperclass();
			if (superClass == null) {
				propagate(e);
			} else {
				return getField(superClass, fieldName);
			}
		}
		return null;
	}

	private static void makeAccessible(Member member) {
		final boolean instanceOfAccesibleAndNotAccessible = member instanceof AccessibleObject
				&& !((AccessibleObject) member).isAccessible();
		if (instanceOfAccesibleAndNotAccessible || !Modifier.isPublic(member.getModifiers())
				|| !Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
			if (member instanceof AccessibleObject) {
				((AccessibleObject) member).setAccessible(true);
			} else {
				throw new RuntimeException("Can not set accessible " + member); //$NON-NLS-1$
			}
		}
	}

}
