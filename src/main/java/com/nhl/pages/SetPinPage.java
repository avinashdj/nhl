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
 * Capture customer's secret pin and continue
 *
 * @author avinash
 * @since 6/7/2022
 */
public class SetPinPage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'PIN code')]");
    private static final By NEXT = By.xpath("//*[@content-desc='Next']");

    public SetPinPage() {
    }

    public SetPinPage setPin(final String value) {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        return this;
    }

    public void clickNext() {
        click(NEXT, "Next Button");
    }

    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public SetPinPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User given secret pin number for quick sign-in
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public SetPinPage step_setPin(String pin) {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(pin).perform();
        return this;
    }

    /**
     * Step : User move into next phase by clicking next button
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public ConfirmPinPage step_moveNext(){
        SeleniumUtils.click(NEXT,"Move Next");
        return new ConfirmPinPage();
    }
}
