package com.nhl.pages.idandv;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Capture initial loading view get-started page
 *
 * @author shiwanthalakmal
 * @since 6/7/2022
 */
public class GetStaterPage {

    public GetStaterPage() {
    }

    private static final By PAGE_TITLE = By.xpath("(//android.widget.Button[(@content-desc,'Let')])[2]");
    private static final By LETS_GET_STARTED = By.xpath("//android.widget.Button[@content-desc=\"Let’s get started\"]");
    private static final By not = By.xpath("//android.widget.Button[@content-desc=\"Not you?\"]");
//By.xpath("//android.widget.Button[@content-desc=\"Let’s get started\"]");
    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public GetStaterPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User start customer journey
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public RegisterYourMobilePage step_getStarted() {
        SeleniumUtils.waitFor(5000);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(LETS_GET_STARTED)));
        SeleniumUtils.click(LETS_GET_STARTED,"LETS STARTED");
        return new RegisterYourMobilePage();
    }
}
