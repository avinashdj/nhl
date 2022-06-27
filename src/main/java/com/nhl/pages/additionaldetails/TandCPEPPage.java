package com.nhl.pages.additionaldetails;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class TandCPEPPage {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'][1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'][2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'terms and conditions')]");

    //T and C Content
    private static By T_AND_C_CONTENT_HEADING = By.xpath("//android.view.View[@content-desc='ACCOUNT OPENING TERMS AND CONDITIONS']");
    private static final By T_AND_C_CONTENT = By.xpath("//android.view.View[contains(@content-desc,'First Abu Dhabi Bank')]");


    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    //Checkbox
    private static final By AGREE = By.xpath("//android.widget.CheckBox");
    private static final By I_AGREE = By.xpath("//android.view.View[contains(@content-desc,'I agree to all the terms')]");



    public TandCPEPPage(){
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


    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }


    public void agreeTandC(){
        click(AGREE, "Agree checkbox");
    }

    public boolean isAgreeTAndCEnabled(){
        return isEnabled(AGREE, "Agree T and C");
    }

    public String getIAgreeText(){
        return getContentDesc(I_AGREE);
        //I agree to all the terms and conditions
    }

    public String getTAndCHeading(){
        return getContentDesc(T_AND_C_CONTENT_HEADING);
        //ACCOUNT OPENING TERMS AND CONDITIONS
    }

    public String getTAndCContent(){
        return getContentDesc(T_AND_C_CONTENT);
        //TBD
    }

    public void clickContinueButton(){
        click(CONTINUE, "Continue button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {return isClickable(CONTINUE,"Continue Button");}

}
