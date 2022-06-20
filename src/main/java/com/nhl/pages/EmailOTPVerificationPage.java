package com.nhl.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

public class EmailOTPVerificationPage {

    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    public EmailOTPVerificationPage(){
    }

    public EmailOTPVerificationPage enterOTP(final String value){
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        return this;
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

}
