package com.nhl.pages;

import com.nhl.driver.DriverManager;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static com.nhl.utils.SeleniumUtils.click;

public class DashboardPage {

    private static final By LETS_GET_STARTED = By.xpath("//*[@content-desc=\"Let’s get started\"]");

    public DashboardPage(){
    }

    public void clickLetsGetStartedButton(){
        click(LETS_GET_STARTED, "Lets Get Started Button");
    }

    public void swapRightToLeftMortgage(){
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int anchor = (int) (size.height * 0.5);
        int startPoint = (int) (size.width * 0.70);
        int endPoint = (int) (size.width * 0.30);
        new TouchAction((PerformsTouchActions) DriverManager.getDriver())
                .press(PointOption.point(startPoint, anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, anchor))
                .release().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

