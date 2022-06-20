package com.nhl.pages.pagecomponent;

import com.nhl.driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    private static final By labelFooterMessage = By.id("footer");

    public String getFooterLabel(){
       return DriverManager.getDriver().findElement(labelFooterMessage).getText();
    }
}
