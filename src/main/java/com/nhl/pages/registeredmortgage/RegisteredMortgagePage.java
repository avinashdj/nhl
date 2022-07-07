package com.nhl.pages.registeredmortgage;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class RegisteredMortgagePage {

    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Registered Mortgage']");
    private static final By HEADING = By.xpath("//android.view.View[contains(@content-desc,'Your registered mortgage')]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'Enter your 12-digit registration number')]");

    //Mortgage Registration number
    private static final By MRN = By.xpath("(//android.widget.EditText)[1]");
    private static final By CONFIRM_MRN = By.xpath("(//android.widget.EditText)[2]");

    //MRN Help
    private static final By MRN_HELP_LINK = By.xpath("//android.widget.Button[@content-desc='What is the mortgage registration number?']");
    private static final By MRN_HELP_TEXT = By.xpath("//android.widget.ImageView[contains(@content-desc,'Mortgage Registration Number')]");


    //Error Message
    //(//android.widget.EditText)[1]/following-sibling::android.view.View
    private static final By MRN_DIGITS_MISMATCH = By.xpath("(//android.widget.EditText)[1]/following-sibling::android.view.View");
    private static final By CONFIRM_MRN_DIGITS_MISMATCH = By.xpath("(//android.widget.EditText)[1]/following-sibling::android.view.View");

    private static final By MRN_MISMATCH = By.xpath("(//android.widget.EditText)[2]/following-sibling::android.view.View");


    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    public void enterMRN(final String value){
        sendKeys(MRN, value, "Mortgage Registration number");
        hideKeyboard();
    }

    public void enterConfirmMRN(final String value){
        sendKeys(CONFIRM_MRN, value, "Confirm Mortgage Registration number");
        hideKeyboard();
    }

    public String getErrorMessageForMRNDigitsNotEqualTo12(){
        return getContentDesc(MRN_DIGITS_MISMATCH);
        //Please enter 12 digit mortgage registration number
    }

    public String getErrorMessageForConfirmMRNDigitsNotEqualTo12(){
        return getContentDesc(MRN_DIGITS_MISMATCH);
        //Please enter 12 digit mortgage registration number
    }

    public String getErrorMessageForMRNConfirmMRNMismatch(){
        return getContentDesc(MRN_DIGITS_MISMATCH);
        //Please share the same mortgage registration number as before.
    }

    public boolean isMRNHelpEnabled(){
        return isClickable(MRN_HELP_LINK,"MRN Help link");}

    public void clickMRNHelpLink(){
        click(MRN_HELP_LINK, "What is MRN?");
    }

    public String getMRNHelpText(){
        return getContentDesc(MRN_HELP_TEXT);
        //Mortgage Registration Number This is a short description of the Mortgage Registration Number.
    }

    public void closeMRNHelp(){
        //TODO - Close MRN Help
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

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {return isClickable(CONTINUE,"Continue Button");}

}
