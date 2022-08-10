package com.nhl.pages.accountcreation.additionaldetails;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class PEPPage {

    public PEPPage(){

    }

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='Additional details'][1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Additional details'][2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'position?')]");

    //Consent Content
    private static String content = "(//android.view.View[contains(@content-desc,'position?')]/following-sibling::android.view.View)[%s]";
    private static final By CONSENT_CONTENT_1 = By.xpath(String.format(content, "1"));
    //What counts as politically exposed?
    private static final By CONSENT_CONTENT_BULLET_1 = By.xpath(String.format(content, "2"));
    private static final By CONSENT_CONTENT_BULLET_2 = By.xpath(String.format(content, "3"));
    private static final By CONSENT_CONTENT_BULLET_3 = By.xpath(String.format(content, "4"));
    private static final By CONSENT_CONTENT_BULLET_4 = By.xpath(String.format(content, "5"));
    private static final By CONSENT_CONTENT_BULLET_5 = By.xpath(String.format(content, "6"));
    private static final By CONSENT_CONTENT_BULLET_6 = By.xpath(String.format(content, "7"));
    private static final By CONSENT_CONTENT_BULLET_7 = By.xpath(String.format(content, "8"));
    private static final By CONSENT_CONTENT_BULLET_8 = By.xpath(String.format(content, "9"));

    //Radio Button - PEP - Yes or No
    private static final By PEP_YES = By.xpath("//android.widget.RadioButton[@content-desc='Yes']");
    private static final By PEP_NO = By.xpath("//android.widget.RadioButton[@content-desc='No']");

    //Radio Button
    private static final By POSITION_HELD = By.xpath("//android.view.View[@content-desc='Where is the position held?']");
    private static final By INSIDE_UAE= By.xpath("//android.widget.RadioButton[@content-desc='Inside UAE']");
    private static final By OUTSIDE_UAE = By.xpath("//android.widget.RadioButton[@content-desc='Outside UAE']");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    public boolean isPePYesEnabled(){
        return isEnabled(PEP_YES, "PEP yes");
    }

    public boolean isPePNoEnabled(){
        return isEnabled(PEP_NO, "PEP No");
    }

    public boolean isInsideUAEEnabled(){
        return isEnabled(INSIDE_UAE, "Inside UAE");
    }

    public boolean isOutsideUAEEnabled(){
        return isEnabled(OUTSIDE_UAE, "Outside UAE");
    }

    /**
     * Step :  User choose political expose status
     *
     * @author avinash
     * @update 20/7/2022 - shiwantha (reason : cleanup code)
     * @return PEPPage
     */
    public PEPPage setPoliticallyExposed(final boolean isPEP){
        if(isPEP) {
            click(PEP_YES, "PEP Yes");
        } else {
            click(PEP_NO, "PEP No");
        }
        return this;
    }

    public boolean isPostionHeldDisplayed(){
       return isDisplayed(POSITION_HELD, "Position held");
    }

    public boolean isPEPOptionDisplayed(){
        return isDisplayed(INSIDE_UAE, "Inside UAE") && isDisplayed(OUTSIDE_UAE, "Outside UAE");
    }

    public void setPositionHeld(final boolean isInsideUAE){
        if(isInsideUAE) {
            click(INSIDE_UAE, "Inside UAE");
        } else {
            click(OUTSIDE_UAE, "Outside UAE");
        }
    }

    public String getScreenTitle(){
        return getContentDesc(PAGE_TITLE);
    }

    public String getHeading(){
        return getContentDesc(HEADING);
    }

    public String getSubHeading(){
        return getContentDesc(SUB_HEADING);
    }

    public String getConsentContentHeading(){
        return getContentDesc(CONSENT_CONTENT_1);
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public String getConsentContent(final String bullet){
        return getContentDesc(By.xpath(String.format(content, (Integer.parseInt(bullet) + 1 + ""))));
    }

    /**
     * Step : User completed PEP status and continue
     *
     * @author shiwantha
     * @update 19/7/2022
     * @return CPRConditionsPage
     */
    public CPRConditionsPage step_clickContinue(){
        click(CONTINUE, "Continue");
        return new CPRConditionsPage();
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {return isClickable(CONTINUE,"Continue Button");}

}
