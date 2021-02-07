package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FindElement1 {
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

        List<AndroidElement> buttons = driver.findElements(By.className("android.widget.Button"));
        System.out.println("Number of buttons are available : " + buttons.size());
        //  if do not hve resource id loop
        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i).getText());
            System.out.println(buttons.get(i).getAttribute("text"));
            if (buttons.get(i).getText().equals("Test")) {
                //buttons. click is not working bcz 3 buttons whoch on i should click
                //i have to specify wih index
                buttons.get(i).click();
            }
        }
        //foreach
        for (AndroidElement button : buttons) {
            //lets see buttons
            //  System.out.println(button.getText());
            if (button.getText().equals("Test")) {
                button.click();
            }
        }

    }
}


