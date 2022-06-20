package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;
import static com.nhl.utils.SeleniumUtils.sendKeys;

public class StayUpdatedPage {

    private static final By EMAIL = By.xpath("//*[@class='android.widget.EditText']");
    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    public StayUpdatedPage(){
    }

    public StayUpdatedPage enterEmail(final String value){
        sendKeys(EMAIL, value, "Email");
        return this;
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

}
