package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;

public class LocationPage {

    private static final By LATER = By.xpath("//*[@content-desc='Later']");
    //location access
    public static final By ALLOW_ACCESS_LOCATION = By.xpath("//android.widget.Button[@content-desc=\"Allow access\"]");
    public static final By WHILE_USING_THE_APP = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static final By ONLY_THIS_TIME = By.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    public static final By DONT_ALLOW = By.id("com.android.permissioncontroller:id/permission_deny_button");

    public LocationPage(){
    }

    public void clickLater(){
        click(LATER, "Later link clicked");
    }

    public void allowLocation() {
        click(ALLOW_ACCESS_LOCATION, "Allow Location");
        click(ONLY_THIS_TIME, "Allow Location Only This Time");
    }
}
