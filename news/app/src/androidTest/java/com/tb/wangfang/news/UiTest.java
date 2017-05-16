package com.tb.wangfang.news;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by tangbin on 2017/5/16.
 */

public class UiTest {
    public void testDemo() throws UiObjectNotFoundException {
        UiDevice.getInstance(getInstrumentation()).pressHome();
        UiObject Calculator = new UiObject(new UiSelector().description("计算器"));

        Calculator.clickAndWaitForNewWindow();
        UiObject seven = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit7"));
        seven.click();
        UiObject plus = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/plus"));
        plus.click();
        UiObject one = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit1"));
        one.click();
        UiObject result = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/equal"));
        result.click();
        UiDevice.getInstance(getInstrumentation()).pressBack();
    }
}
