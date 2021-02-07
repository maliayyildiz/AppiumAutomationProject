package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class UiSelector {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\YSMNI\\IdeaProjects\\AppiumAutomationProject\\Gesture Tool_v1.3_apkpure.com.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);
//resourceid i ll use
      //  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();
        //now class name " yerine ' koyunca calismiyor
       // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")").click();

        //lets clisk 2nd element
       List<AndroidElement> buttons = driver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")");
        //there are 3 buttons lets check it
      //  System.out.println("There are " +buttons.size() +" buttons"); //3

        for (AndroidElement button : buttons) {
            if (button.getText().equals("Test")){
              //  button.click();
                System.out.println("clicked Test button");
            }
        }
        //find element by index
     //   driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(2)").click();
        //checkable when i give value it will check it
       //  driver.findElementByAndroidUIAutomator("UiSelector().checkable(false)");
        //if it not exist or visible size dhoud be 0  kullanma
       // System.out.println( driver.findElementsByAndroidUIAutomator("UiSelector().checkable(true)").size());

        //lets find element wth text using UiSelector
       // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"Test\")").click();
//text contains
     //   driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textContains(\"dd\")").click();

        //test startwith
        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textStartsWith(\"Te\")").click();



          }
}

