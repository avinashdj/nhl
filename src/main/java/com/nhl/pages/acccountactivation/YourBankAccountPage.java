package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class YourBankAccountPage {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Your bank account'][1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Your bank account'][2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'Enter the IBAN')]");

    //Banks
    private static final By FAB = By.xpath("//android.widget.RadioButton[1]");
    private static final By OTHER_UAE_BANK = By.xpath("//android.widget.RadioButton[2]");

    //Bank Account details
    private static final By IBAN = By.xpath("//android.widget.EditText[contains(@text,'IBAN')]");
    private static final By ACCOUNT_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Account number')]");
    private static final By BANK_NAME = By.xpath("//android.widget.EditText[contains(@text,'Bank name')]");
    private static final By BRANCH_NAME = By.xpath("//android.widget.EditText[contains(@text,'Branch name')]");

    //Loading
    private static final By LOADING = By.xpath("//android.view.View[@content-desc='Loading']");


    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    public YourBankAccountPage(){
    }

    public void enterIBAN(final String iban){
        waitUntilElementToBeInvisible(LOADING);
        click(IBAN,"IBAN");
        sendKeys(IBAN, iban, "IBAN");
        hideKeyboard();
    }

    public void enterAccountNumber(final String accountNumber){
        click(ACCOUNT_NUMBER, "Account Number");
        sendKeys(ACCOUNT_NUMBER, accountNumber, "Account Number");
        hideKeyboard();
    }

    public void enterBankName(final String bankName){
        click(BANK_NAME, "Bank Name");
        sendKeys(BANK_NAME, bankName, "Bank Name");
        hideKeyboard();
    }

    public void enterBranchName(final String branchName){
        click(BRANCH_NAME, "Branch Name");
        sendKeys(BRANCH_NAME, branchName, "Branch Name");
        hideKeyboard();
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

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {
        return isClickable(CONTINUE,"Continue Button");
    }

    public boolean isBankNameFieldPresent(){
        return isElementPresent(BANK_NAME, "Bank Name");
    }

    public void selectOtherUAEBankOption(){
        click(OTHER_UAE_BANK, "Other UAE Bank");
    }

    public boolean isFABChecked(){
        return isChecked(FAB, "FAB");
    }

    public boolean isOtherUAEBankChecked(){
        return isChecked(OTHER_UAE_BANK, "Other UAE Bank");
    }

    public boolean isFABEnabled(){
        return isEnabled(FAB, "FAB");
    }

    public boolean isOtherUAEBankEnabled(){
        return isEnabled(OTHER_UAE_BANK, "FAB");
    }

    public boolean isIBANEnabled(){
        return isEnabled(IBAN, "IBAN");
    }

    public boolean isAccountNumberEnabled(){
        return isEnabled(ACCOUNT_NUMBER, "Account number");
    }

    public boolean isBankNameEnabled(){
        return isEnabled(BANK_NAME, "Bank Name");
    }

    public boolean isBranchNameEnabled(){
        return isEnabled(BRANCH_NAME, "Branch Name");
    }
}
