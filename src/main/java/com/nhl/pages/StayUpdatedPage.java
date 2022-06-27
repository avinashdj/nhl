package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class StayUpdatedPage {

    private static final By EMAIL = By.xpath("//*[@class='android.widget.EditText']");
    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");
    public static final By ERROR_MESSAGE = By.xpath("//android.widget.EditText/following-sibling::android.view.View[1]");
    public static final By SKIP = By.xpath("//android.widget.Button[@content-desc='Skip']");

    public StayUpdatedPage(){
    }

    public StayUpdatedPage enterEmail(final String value){
        sendKeys(EMAIL, value, "Email");
        return this;
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public boolean checkIfContinueButtonIsEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickSkip(){
        click(SKIP, "Skip link");
    }

    public String getErrorMessage(){
        return getContentDesc(ERROR_MESSAGE);
    }

}
