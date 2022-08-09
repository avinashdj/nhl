package com.nhl.pages.idandv;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

/**
 * Capture customer's current location permission request screen
 *
 * @author avinash
 * @since 6/7/2022
 */
public class LocationPage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'Location permission')]");
    private static final By LATER = By.xpath("//*[@content-desc='Later']");

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

    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public LocationPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User allow own mobile location access only for this time
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public BiometricsPage step_allowLocationOnlyOneTime(){
        click(ALLOW_ACCESS_LOCATION, "Allow access");
        click(ONLY_THIS_TIME, "Allow Location Only This Time");
        return new BiometricsPage();
    }

    /**
     * Step : User not allow and location permission section skipping for later
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public BiometricsPage step_locationPermissionLater(){
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        click(LATER, "Later link");
        return new BiometricsPage();
    }
}
