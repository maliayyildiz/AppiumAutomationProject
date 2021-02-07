package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FindElementInsideElements {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.android.settings");
        desiredCapabilities.setCapability("appActivity", "com.android.settings.Settings");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

//        List<AndroidElement> elements =  driver.findElementsById("android:id/title");
//        System.out.print("List elements which is dislplayed : ");
//        System.out.println(elements.size());
//
//        for (AndroidElement element : elements) {
//            System.out.println(element.getText());
//
//        }

        //how to go down menus should use text
        driver.findElementsById("com.android.settings:id/main_content");


    }
}
