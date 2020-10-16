package com.josuerangel.appiumdemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PrimeraPrueba {
    AndroidDriver<AndroidElement> driver;
    @Before
    public void SetUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"NXPDU17622001077");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity",".Calculator");

        driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("7");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("0");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("más");
        el6.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("5");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("igual a");
        el9.click();

    }

    @Test
    public void testGooglePage(){
        //Assert.assertEquals(Integer.parseInt(driver.findElementById("com.android.calculator2:id/resultado").getText()),75);
        Assert.assertEquals(Integer.parseInt(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.EditText").getText()),75);
    }

    @After
    public void afterTestGooglePage(){

    }
}
