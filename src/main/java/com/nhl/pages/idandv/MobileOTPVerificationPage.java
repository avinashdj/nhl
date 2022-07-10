package com.nhl.pages.idandv;

import org.openqa.selenium.By;

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
