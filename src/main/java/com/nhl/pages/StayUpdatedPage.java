package com.nhl.pages;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.click;
import static com.nhl.utils.SeleniumUtils.sendKeys;

/**
 * Capture customer's email tracking for registration
 *
 * @author avinash
 * @since 6/7/2022
 */
public class StayUpdatedPage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'Stay updated')]");
    private static final By SKIP_FLOW = By.xpath("");
    private static final By EMAIL = By.xpath("//*[@class='android.widget.EditText']");
    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    public StayUpdatedPage() {
    }

    public StayUpdatedPage enterEmail(final String value) {
        sendKeys(EMAIL, value, "Email");
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
    public StayUpdatedPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User enter registered email address and continue
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public SetPinPage step_ContinueWithEmail(String email) {
        SeleniumUtils.sendKeys(EMAIL, email, "Email Address");
        return new SetPinPage();
    }

    /**
     * Step : User not provide registered email address and make skipping the optional flow
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public EmailOTPVerificationPage step_SkipWithoutEmail() {
        SeleniumUtils.click(SKIP_FLOW, "Skip");
        return new EmailOTPVerificationPage();
    }

}
