package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GestureApp {
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

       // WebElement addGustureButton = driver.findElementById("com.davemac327.gesture.tool:id/addButton");
        //same function  driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton"));

        //get text from element
      //  System.out.println(addGustureButton.getAttribute("text"));
        //addGustureButton.click();
        //how to write xpath
       // driver.findElement(By.xpath("//android.widget.Button[@id='com.davemac327.gesture.tool:id/addButton'")).click();
        //driver.findElement(By.xpath("//class[@id='com.davemac327.gesture.tool:id/addButton'")).click();
        //xpath is not work sometimes mostly use id  but web application it is working??? old versin boyleydi
        //driver.findElement(By.className("android.widget.Button")).click();
    }

}
