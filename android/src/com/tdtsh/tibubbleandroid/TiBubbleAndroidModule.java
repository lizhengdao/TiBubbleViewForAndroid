/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.tdtsh.tibubbleandroid;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;

@Kroll.module(name = "TiBubbleAndroid", id = "com.tdtsh.tibubbleandroid")
public class TiBubbleAndroidModule extends KrollModule {
	public static final int BUBBLE_BEAK_LEFT = 0;
	public static final int BUBBLE_BEAK_RIGHT = 1;
	public static final int BUBBLE_BEAK_NONE = 2;
	public static final int BUBBLE_BEAK_LOWER = 0;
	public static final int BUBBLE_BEAK_UPPER = 1;

	public TiBubbleAndroidModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		// put module init code that needs to run when the application is
		// created
	}

	@Kroll.getProperty
	public int getBubbleBeakLeft() {
		return BUBBLE_BEAK_LEFT;
	}

	@Kroll.getProperty
	public int getBubbleBeakRight() {
		return BUBBLE_BEAK_RIGHT;
	}
	
	@Kroll.getProperty
	public int getBubbleBeakNone() {
		return BUBBLE_BEAK_NONE;
	}

	@Kroll.getProperty
	public int getBubbleBeakLower() {
		return BUBBLE_BEAK_LOWER;
	}

	@Kroll.getProperty
	public int getBubbleBeakUpper() {
		return BUBBLE_BEAK_UPPER;
	}

}
