package com.nhl.pages.idandv;

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
import static com.nhl.utils.SeleniumUtils.waitUntilElementToBeClickable;

public class LoginPage {
    //Title, Screen title and Subtitle
    private static final By SCREEN_NAME = By.xpath("//android.view.View[@content-desc='Login']");
    private static final By TITLE= By.xpath("//android.view.View[@content-desc='Welcome back']");
    private static final By SUB_TITLE = By.xpath("//android.view.View[contains(@content-desc, 'Enter your PIN')]");

    private static final By FORGOT_PIN = By.xpath("//android.widget.Button[@content-desc='Forgot PIN?']");
    private static final By NOT_YOU = By.xpath("//android.widget.Button[@content-desc='Not you?']");

    private static final By NEXT = By.xpath("//*[@content-desc='Next']");

    public LoginPage(){
    }

    public LoginPage login(final String value){
        waitUntilElementToBeClickable(FORGOT_PIN);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        swapRightToLeftMortgage();
        return this;
    }



    public void swapRightToLeftMortgage(){
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int anchor = (int) (size.height * 0.3);
        int startPoint = (int) (size.width * 0.70);
        int endPoint = (int) (size.width * 0.30);
        new TouchAction((PerformsTouchActions) DriverManager.getDriver())
                .press(PointOption.point(startPoint, anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, anchor))
                .release().perform();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

}
