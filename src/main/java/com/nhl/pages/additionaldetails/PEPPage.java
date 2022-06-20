package com.nhl.pages.additionaldetails;

import org.openqa.selenium.By;

import java.io.InputStream;

import static com.nhl.utils.SeleniumUtils.*;

public class PEPPage {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Additional details'])[1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Additional details'])[2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'position?')]");

    //Consent Content
    private static String content = "(//android.view.View[contains(@content-desc,'position?')]/following-sibling::android.view.View)[%s]";
    private static final By CONSENT_CONTENT_1 = By.xpath(String.format(content, "1"));
    //What counts as politically exposed?

    //Radio Button - PEP - Yes or No
    private static final By PEP_YES = By.xpath("//android.widget.RadioButton[@content-desc='Yes']");
    private static final By PEP_NO = By.xpath("//android.widget.RadioButton[@content-desc='No']");

    //Radio Button
    private static final By POSITION_HELD = By.xpath("//android.view.View[@content-desc='Where is the position held?']");
    private static final By INSIDE_UAE= By.xpath("//android.widget.RadioButton[@content-desc='Inside UAE']");
    private static final By OUTSIDE_UAE = By.xpath("//android.widget.RadioButton[@content-desc='Outside UAE']");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");


    public PEPPage(){
    }

    public void setPoliticallyExposed(final boolean isPEP){
        if(isPEP) {
            click(PEP_YES, "PEP Yes");
        } else {
            click(PEP_NO, "PEP No");
        }
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
        return getContentDesc(SCREEN_TITLE);
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

}
