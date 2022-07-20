package com.nhl.pages.idandv;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.pages.NewPinPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.*;

/**
 * Capture customer's secret pin and continue
 *
 * @author avinash
 * @since 6/7/2022
 */
public class SetPinPage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='Set PIN']");
    public static final By PIN_TEXT = By.xpath("//android.widget.EditText");
    private static final By NEXT = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");

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
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Set PIN","Oops.. Set PIN page does not load !");
        return this;
    }

    /**
     * Step : User given secret pin number for quick sign-in
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public SetPinPage step_setPin(String pin) {
        /**WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 100);
        wait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(PIN_TEXT)));
        driver.findElement(PIN_TEXT).sendKeys("1234");**/
        sendKeys(PIN_TEXT,pin,"Pin Code");
        return this;
    }

    /**
     * Step : User given secret pin number for quick sign-in
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public NewPinPage step_setCurrentPin(String pin) {
        sendKeys(PIN_TEXT,pin,"Pin Code");
        return new NewPinPage();
    }

    /**
     * Step : User move into next phase by clicking next button
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public ConfirmPinPage step_nextToConfirm(){
        SeleniumUtils.click(NEXT,"Move Next to Confirm");
        return new ConfirmPinPage();
    }

    /**
     * Step : User move into next phase by clicking next button
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public NewPinPage step_nextToNew(){
        SeleniumUtils.click(NEXT,"Move Next To New");
        return new NewPinPage();
    }

    /**
     * Step : User move into next phase by clicking next button
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public DashboardPage step_SignIn(){
        SeleniumUtils.click(NEXT,"Move Next");
        return new DashboardPage();
    }
}
