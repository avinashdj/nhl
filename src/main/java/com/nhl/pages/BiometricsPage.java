package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;

public class BiometricsPage {

    private static final By LATER = By.xpath("//*[@content-desc='Later']");

    public BiometricsPage(){
    }

    public void clickLater(){
        click(LATER, "Later link clicked");
    }
}
