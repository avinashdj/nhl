package com.nhl.pages.accountcreation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class YourBankAccountPage {

    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Your bank account'][1]");
    //Your bank account
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Your bank account'][2]");
    //Your bank account
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@Enter the IBAN')]");
    //Enter the IBAN of your income account.

    //Radio buttons
    private static final By FAB = By.xpath("//android.widget.RadioButton[1]");
    private static final By OTHER_UAE_BANK = By.xpath("//android.widget.RadioButton[2]");
    private static final By FAB_LABEL = By.xpath("//android.widget.RadioButton[1]/following-sibling::android.view.View[1]");
    //First Abu Dhabi Bank (FAB)
    private static final By OTHER_UAE_LABEL = By.xpath("//android.widget.RadioButton[2]/following-sibling::android.view.View[1]");
    //Other UAE bank

    //Bank Account details Heading
    private static final By BANK_ACCOUNT_DETAILS_HEADING = By.xpath("//android.view.View[@content-desc='BANK ACCOUNT DETAILS']");
    //BANK ACCOUNT DETAILS - value to be used

    



    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

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
