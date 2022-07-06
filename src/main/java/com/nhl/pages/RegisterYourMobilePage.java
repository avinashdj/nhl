package com.nhl.pages;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.*;

/**
 * Capture customer mobile registration screen and sign-in
 *
 * @author avinash
 * @since 6/7/2022
 */
public class RegisterYourMobilePage {

    public static final By PAGE_TITLE = By.xpath("//android.view.View[contains(@content-desc,'contact number')]");
    private static final By PHONE_NUMBER = By.xpath("//android.widget.EditText");
    private static final By SUBMIT_REGISTER = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    public static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Register your mobile']");


    // Error messages
    public static final By ERROR_MESSAGE = By.xpath("//android.widget.EditText/following-sibling::android.view.View[1]");

    public RegisterYourMobilePage() {
    }

    public RegisterYourMobilePage enterPhoneNumber(final String value) {
        sendKeys(PHONE_NUMBER, value, "Phone number ");
        return this;
    }

    public String getScreenTitle() {
        return getTextFromLabel(SCREEN_TITLE);
    }

    public void clickRegisterButton() {
        click(SUBMIT_REGISTER, "Register Button");
    }

    public String getErrorMessage() {
        return getContentDesc(ERROR_MESSAGE);
    }

    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public RegisterYourMobilePage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User provide system registered mobile no to access fab application
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public RegisterYourMobilePage step_registeredMobileNumber(String mobile) {
        sendKeys(PHONE_NUMBER, mobile, "Registered Mobile Info");
        return this;
    }

    /**
     * Step : User register with app using mobile number
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public EmailOTPVerificationPage step_registrationSubmit(){
        click(SUBMIT_REGISTER,"Register");
        return new EmailOTPVerificationPage();
    }
}
