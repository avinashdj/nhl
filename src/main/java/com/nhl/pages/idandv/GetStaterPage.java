package com.nhl.pages.idandv;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

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
    private static final By LETS_GET_STARTED = By.className("android.widget.Button");
    private static final By not = By.xpath("//android.widget.Button[@content-desc=\"Not you?\"]");
    private static final By ENGLISH = By.xpath("//android.view.View[@content-desc='English']");
    private static final By ARABIC = By.xpath("//android.view.View[@content-desc='العربية']");

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
//        SeleniumUtils.waitFor(5000);
//        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
//        wait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(LETS_GET_STARTED)));
        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
//        click(ENGLISH,"Clicked on Language change - English");
        click(LETS_GET_STARTED,"LETS STARTED");
        return new RegisterYourMobilePage();
    }
}
