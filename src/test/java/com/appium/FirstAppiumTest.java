package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\YSMNI\\IdeaProjects\\AppiumAutomationProject\\etsy.apk");

        AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);

        WebElement getStartedButton =  driver.findElement(By.id("com.modanisa:id/startShopping"));
        getStartedButton.click();
        WebElement search = driver.findElement(By.id("com.modanisa:id/placeholder"));



    }
}
