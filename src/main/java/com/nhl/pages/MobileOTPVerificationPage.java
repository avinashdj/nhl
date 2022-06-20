package com.nhl.pages;

import com.nhl.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.nhl.utils.SeleniumUtils.*;

public class MobileOTPVerificationPage {

    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    public MobileOTPVerificationPage(){
    }

    public MobileOTPVerificationPage enterOTP(final String value){
        enterPin(value);
        return this;
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

}
