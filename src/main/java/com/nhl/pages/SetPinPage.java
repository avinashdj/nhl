package com.nhl.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import io.cucumber.java.lv.Un;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

public class SetPinPage {

    private static final By NEXT = By.xpath("//*[@content-desc='Next']");

    public SetPinPage(){
    }

    public SetPinPage setPin(final String value){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        return this;
    }

    public void clickNext(){
        click(NEXT, "Next Button");
    }

}
