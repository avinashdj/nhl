package com.nhl.pages.sourceofincome;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class AdditionalIncomePage {

    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    private static final By SCREEN_NAME = By.xpath("//android.view.View[@content-desc='Source of income']");
    private static final By TITLE= By.xpath("//android.view.View[@content-desc='Additional income']");
    private static final By DESCRIPTION = By.xpath("//android.view.View[contains(@content-desc, 'source of income')]");

    private static final By TOTAL_MONTHLY_INCOME = By.xpath("//android.widget.EditText");
    private static final By PENSION_CERTIFICATE = By.xpath("//android.widget.ImageView[contains(@content-desc,'Pension certificate')]");
    private static final By BANK_STATEMENT = By.xpath("//android.widget.ImageView[@content-desc='Bank statement']");

    private static final By ADD = By.xpath("//android.widget.Button[@content-desc='Add']");

    //Remove icon
    private static final By PENSION_CERTIFICATE_REMOVE_ICON = By.xpath("android.widget.ImageView[2]");
    private static final By BANK_STATEMENT_REMOVE_ICON = By.xpath("android.widget.ImageView[4]");

    private static final By BANK_STATEMENT_REMOVE_ICON_AFTER= By.xpath("android.widget.ImageView[3]");

    //Document Removal Popup
    private static final By DOCUMENT_REMOVAL_POPUP_HEADING = By.xpath("//android.view.View[@content-desc='Document removal']");
    private static final By DOCUMENT_REMOVAL_POPUP_CANCEL = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    private static final By DOCUMENT_REMOVAL_POPUP_REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");

    private static final By REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");
    private static final By ALL_DOCUMENT_POPUP_HEADING = By.xpath("//android.view.View[@content-desc='Income details']");
    private static final By ALL_DOCUMENT_REMOVAL_POPUP_CANCEL = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    private static final By ALL_DOCUMENT_REMOVAL_POPUP_REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");

    public AdditionalIncomePage(){
    }

    public String getScreenName(){
        return getContentDesc(SCREEN_NAME);
    }

    public String getTitle(){
        return getContentDesc(TITLE);
    }

    public String getDescription(){
        return getContentDesc(DESCRIPTION);
    }

    public void clickPensionCertificate(){
        click(PENSION_CERTIFICATE, "Pension certificate");
    }

    public void clickBankStatement(){
        click(BANK_STATEMENT, "Bank Statement");
    }

    public void enterTotalMonthlySalary(final String salary){
        click(TOTAL_MONTHLY_INCOME, "Total Monthly salary text field");
        sendKeys(TOTAL_MONTHLY_INCOME, salary, "Total Monthly Salary");
    }

    public void uploadPensionCertificate(){
        uploadDocument("file1", PENSION_CERTIFICATE, "Pension Certificate");
    }

    public void uploadBankStatement(){
        uploadDocument("file1", BANK_STATEMENT, "Bank Statement");
    }

    public void removeSalaryCertificate(){
        click(PENSION_CERTIFICATE_REMOVE_ICON, "Salary Certificate remove icon");
        click(DOCUMENT_REMOVAL_POPUP_REMOVE, "Remove option on Document Removal");
    }

    public void removeBankStatement(){
        click(BANK_STATEMENT_REMOVE_ICON_AFTER, "Bank Statement remove icon");
        click(DOCUMENT_REMOVAL_POPUP_REMOVE, "Remove option on Document Removal");
    }

    public void clickAdd(){
        click(ADD, "Add Button");
    }

    public boolean isAddEnabled(){
        return isEnabled(ADD, "Add Button");
    }

    public void clickRemove(){
        click(REMOVE, "Remove Link");
    }

    public void clickRemoveInDocumentRemovePopup(){
        click(DOCUMENT_REMOVAL_POPUP_REMOVE,  "Remove in Income Details popup");
    }

    public void clickCancelInDocumentRemovePopup(){
        click(DOCUMENT_REMOVAL_POPUP_CANCEL,  "Remove in Income Details popup");
    }

    public void clickCancelInIncomeDetailsPopup(){
        click(ALL_DOCUMENT_REMOVAL_POPUP_CANCEL,  "Remove in Income Details popup");
    }

    public void clickRemoveInIncomeDetailsPopup(){
        click(ALL_DOCUMENT_REMOVAL_POPUP_REMOVE,  "Remove in Income Details popup");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }



}
