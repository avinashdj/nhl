package com.nhl.pages.menunavigations;

import com.nhl.driver.DriverManager;
import com.nhl.pages.SetPinPage;
import com.nhl.pages.StayUpdatedPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Capture personal setting screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 5/7/2022
 */
public class PersonalInfoPage {

    public PersonalInfoPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//*[@contentDescription='Personal details, Settings']");
    private static final By NAME_INFO = By.xpath("//*[@contentDescription='Name']/following-sibling::android.view.View[position()=1]");
    private static final By EMAIL_INFO = By.xpath("//*[@contentDescription='Email']/following-sibling::android.view.View[position()=1]");
    private static final By EMAIL_ADD = By.xpath("//*[@contentDescription='Add']");
    private static final By MOBILE_INFO = By.xpath("//*[@contentDescription='Mobile no.']/following-sibling::android.view.View[position()=1]");
    private static final By CHANGE_PIN = By.xpath("//*[@contentDescription='SECURITY SETTINGS']/following-sibling::android.view.View[position()=1]");
    private static final By SIGN_BIO = By.xpath("//*[@class='android.widget.Switch']");
    private static final By CHANGE_LANG = By.xpath("//*[@contentDescription='MORE OPTIONS']/following-sibling::android.view.View[position()=1]");
    private static final By ABOUT_NHL = By.xpath("//*[@contentDescription='MORE OPTIONS']/following-sibling::android.view.View[position()=2]");


    /**
     * Step : User check and validate registered customer name
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public PersonalInfoPage check_and_validate_customerName(String name) {
        String actualName = DriverManager.getDriver().findElement(NAME_INFO).getText();
        Assert.assertEquals(actualName, name, "Oops.. Customer Info name not valid !");
        return this;
    }

    /**
     * Step : User check and validate registered customer email
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public PersonalInfoPage check_and_validate_customerEmail(String email) {
        String actualEmail = DriverManager.getDriver().findElement(EMAIL_INFO).getText();
        Assert.assertEquals(actualEmail, email, "Oops.. Customer Info email not valid !");
        return this;
    }

    /**
     * Step : User try to add or update existing registered email
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public StayUpdatedPage step_addEmail() {
        SeleniumUtils.click(EMAIL_ADD, "Add New Email");
        return new StayUpdatedPage();
    }

    /**
     * Step : User check and validate registered customer mobile
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public PersonalInfoPage check_and_validate_customerMobile(String mobile) {
        String actualEmail = DriverManager.getDriver().findElement(MOBILE_INFO).getText();
        Assert.assertEquals(actualEmail, mobile, "Oops.. Customer Info mobile not valid !");
        return this;
    }

    /**
     * Step : User going to change login pin by switch to pin change mode
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public SetPinPage step_switchToChangeLoginPin() {
        SeleniumUtils.click(CHANGE_PIN, "Switch to login pin change mode");
        return new SetPinPage();
    }

    /**
     * Step : User going to enable biometrics feature via profile settings
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public PersonalInfoPage step_switchToEnableBiometrics() {
        SeleniumUtils.click(SIGN_BIO, "Switch enable biometrics");
        //TODO mange overlay message popup
        //*[@contentDescription='No biometrics enrolled on this device.']      (no bio msg)
        //*[@contentDescription='Ok'] (confirm and move)
        return this;
    }

    /**
     * Step : User going to switch language via profile settings
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public PersonalInfoPage step_switchToLanguageChange(String mode) {
        SeleniumUtils.click(CHANGE_LANG, "Switch language change mode");
        //TODO choose given language
        return this;
    }

    /**
     * Step : User going to verify about application via profile setting
     *
     * @author shiwantha
     * @update 5/7/2022
     */
    public PersonalInfoPage step_switchToAboutNHL() {
        SeleniumUtils.click(ABOUT_NHL, "About Application");
        boolean result = SeleniumUtils.isDisplayed(By.xpath("//*[@class='android.widget.ImageView'][1]"),"Fab logo");
        Assert.assertTrue(result,"Oops.. Fab logo not visible !");
        return this;
    }
}