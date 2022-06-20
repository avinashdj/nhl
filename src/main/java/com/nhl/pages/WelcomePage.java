package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;

public class WelcomePage {

    private static final By LETS_GET_STARTED = By.xpath("//*[@content-desc=\"Let’s get started\"]");

    public WelcomePage(){
    }

    public void clickLetsGetStartedButton(){
        click(LETS_GET_STARTED, "Lets Get Started Button");
    }
}
