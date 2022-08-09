package com.nhl.pages.accountcreation.additionaldetails;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class MCPage2 {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'][1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'][2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'I confirm that all the information provided')]");

    //Read T and C
    private static By READ_OUR_T_And_C = By.xpath("//android.widget.Button[@content-desc='Read our Terms and Conditions']");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    //Checkbox
    private static final By AGREE = By.xpath("//android.widget.CheckBox");
    private static final By I_GRANT = By.xpath("//android.view.View[contains(@content-desc,'I grant FAB')]");

    public MCPage2(){
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

    public void clickReadOurTandC(){
        click(READ_OUR_T_And_C,"Read out Terms and Conditions");
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void agreeTandC(){
        click(AGREE, "Agree checkbox");
    }

    public boolean isConsentPrivoded(){
        return isChecked(AGREE, "Agree T and C");
    }

    public boolean isAgreeTAndCEnabled(){
        return isEnabled(AGREE, "Agree T and C");
    }

    public String getIAgreeText(){
        return getContentDesc(I_GRANT);
        //I grant FAB the right to assess my credit score and report from Al Etihad Credit Bureau (AECB).
    }

    public void clickContinueButton(){
        click(CONTINUE, "Continue button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {return isClickable(CONTINUE,"Continue Button");}

}
