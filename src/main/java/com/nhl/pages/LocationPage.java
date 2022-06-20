package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;

public class LocationPage {

    private static final By LATER = By.xpath("//*[@content-desc='Later']");

    public LocationPage(){
    }

    public void clickLater(){
        click(LATER, "Later link clicked");
    }
}
