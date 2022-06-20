package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class RegisterYourMobilePage {

    private static final By PHONE_NUMBER  = By.xpath("//android.widget.EditText");
    private static final By REGISTER = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    public static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Register your mobile']");
    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'contact number')]");
    public static final By PAGE_DESCRIPTION = By.xpath("//android.view.View[contains(@content-desc,'ADHA')]");

    public static final String PLACE_HOLDER_TEXT = "+971 | Phone Number 5x xxx xxxx";

    // Error messages
    public static final By ERROR_MESSAGE = By.xpath("//android.widget.EditText/following-sibling::android.view.View[1]");

    public RegisterYourMobilePage(){
    }

    public RegisterYourMobilePage enterPhoneNumber(final String value){
        sendKeys(PHONE_NUMBER, value, "Phone number ");
        return this;
    }

    public String getScreenTitle(){
        return getTextFromLabel(SCREEN_TITLE);
    }

    public void clickRegisterButton(){
        click(REGISTER, "Register Button");
    }

    public String getErrorMessage(){
        return getContentDesc(ERROR_MESSAGE);
    }
}
