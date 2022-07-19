package com.nhl.pages.idandv;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

/**
 * Capture verification code send to user's mobile ot email
 *
 * @author avinash
 * @since 6/7/2022
 */
public class EmailOTPVerificationPage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'OTP')]");
    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    public EmailOTPVerificationPage() {
    }

    public EmailOTPVerificationPage enterOTP(final String value) {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
        return this;
    }

    public void clickContinue() {
        click(CONTINUE, "Continue Button");
    }

    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public EmailOTPVerificationPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User capture the otp message via mobile or email and continue
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public StayUpdatedPage step_setContinueWithOTP(String code) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        //new Actions(DriverManager.getDriver()).sendKeys(code).perform();
        SeleniumUtils.click(CONTINUE,"Continue");
        return new StayUpdatedPage();
    }

}
