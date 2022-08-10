package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;
import static com.nhl.utils.SeleniumUtils.click;

public class MortgageContractTandCPage {
    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Mortgage contract']");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Terms and Conditions']");
    private static final By SUB_HEADING = By.xpath("//android.view.View[@content-desc='Please read your mortgage contract terms and conditions.']");

    //Content Heading and text
    private static final By T_AND_C_CONTENT_HEADING = By.xpath("//android.view.View[@content-desc='MORTGAGE CONTRACT TERMS AND CONDITIONS']");
    private static final By T_AND_C_CONTENT = By.xpath("//android.view.View[@content-desc='MORTGAGE CONTRACT TERMS AND CONDITIONS']" +
            "/following::android.view.View");

    //I agree
    private static final By I_AGREE_TEXT = By.xpath("//android.view.View[@content-desc='I agree to all the terms and conditions']");
    private static final By I_AGREE = By.xpath("//android.view.View[@content-desc='I agree to all the terms and conditions']/android.widget.CheckBox");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    //Actions
    public void clickBackButton(){
        click(BACK, "BACK Button");
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

    public String getTAndCHeading(){
        return getContentDesc(T_AND_C_CONTENT_HEADING);
    }

    public String getTAndCContent(){
        return getContentDesc(T_AND_C_CONTENT);
    }

    public String getIAgreeText(){
        return getContentDesc(I_AGREE_TEXT);
    }

    public void clickIAgree(){
        click(I_AGREE, "I Agree Checkbox");
    }

    public boolean isIAgreeCheckBoxEnabled() {
        return isEnabled(I_AGREE, "I Agree Checkbox");
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

}

//T and C content
/*
To be populated
 */