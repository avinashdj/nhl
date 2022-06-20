package com.nhl.pages;

import com.nhl.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.nhl.utils.SeleniumUtils.click;

public class ConfirmPinPage {

    private static final By NEXT = By.xpath("//*[@content-desc='Confirm']");

    public ConfirmPinPage(){
    }

    public ConfirmPinPage confirmPin(final String value){
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        return this;
    }

    public void clickConfirm(){
        click(NEXT, "Confirm Button");
    }

}
