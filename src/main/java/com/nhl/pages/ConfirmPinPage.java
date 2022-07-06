package com.nhl.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

/**
 * Capture customer's secret pin confirm and continue
 *
 * @author avinash
 * @since 6/7/2022
 */
public class ConfirmPinPage {
    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'Confirm PIN code')]");
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

    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public ConfirmPinPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User given confirmed pin number for quick sign-in
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public ConfirmPinPage step_setConfirmPin(String pin) {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(pin).perform();
        return this;
    }

    /**
     * Step : User move into next phase by clicking confirm button
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public LocationPage step_makeConfirmed(){
        SeleniumUtils.click(NEXT,"Confirmed");
        return new LocationPage();
    }

}
