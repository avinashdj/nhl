package com.nhl.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;
import static com.nhl.utils.SeleniumUtils.sendKeys;

/**
 * Capture customer's new updated pin and continue
 *
 * @author shiwanthalakmal
 * @since 12/7/2022
 */
public class NewPinPage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='New PIN']");
    public static final By PIN_TEXT = By.xpath("//android.view.View[@content-desc='Enter your new PIN']/following-sibling::android.widget.EditText");
    private static final By NEXT = By.xpath("//android.widget.Button[@content-desc='Next']");

    public NewPinPage() {
    }

    public NewPinPage setPin(final String value) {
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
     * @update 12/7/2022
     */
    public NewPinPage check_and_validate_pageTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Set PIN","Oops.. Set PIN page does not load !");
        return this;
    }

    /**
     * Step : User given new secret pin number for profile sign-in
     *
     * @author shiwantha
     * @update 12/7/2022
     */
    public NewPinPage step_setPin(String pin) {
        sendKeys(PIN_TEXT,pin,"Pin Code");
        return this;
    }

    /**
     * Step : User move into next phase by clicking next button
     *
     * @author shiwantha
     * @update 12/7/2022
     */
    public ConfirmPinPage step_nextToConfirm(){
        SeleniumUtils.click(NEXT,"Move Next to Confirm");
        return new ConfirmPinPage();
    }

}
