package com.nhl.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

public class LoginPage {

    private static final By NEXT = By.xpath("//*[@content-desc='Next']");

    public LoginPage(){
    }

    public LoginPage login(final String value){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        swapRightToLeftMortgage();
        return this;
    }

    public void clickNext(){
        click(NEXT, "Next Button");
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
