package com.nhl.pages.accountcreation.sourceofincome;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class OwnBusinessPage {

    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    private static final By SCREEN_NAME = By.xpath("//android.view.View[@content-desc='Source of income']");
    private static final By TITLE= By.xpath("//android.view.View[@content-desc='Own business']");
    private static final By DESCRIPTION = By.xpath("//android.view.View[contains(@content-desc, 'source of income')]");

    private static final By TOTAL_MONTHLY_INCOME = By.xpath("//android.widget.EditText");
    private static final By TRADE_LICENSE = By.xpath("//android.widget.ImageView[@content-desc='Trade License']");
    private static final By BANK_STATEMENT = By.xpath("//android.widget.ImageView[@content-desc='Bank statement']");

    private static final By ADD = By.xpath("//android.widget.Button[@content-desc='Add']");

    //Remove icon
    private static final By TRADE_LICENSE_REMOVE_ICON = By.xpath("//android.view.View[@content-desc='Trade License']/following-sibling::android.widget.ImageView[1]");
    private static final By BANK_STATEMENT_REMOVE_ICON = By.xpath("//android.view.View[@content-desc='Bank statement']/following-sibling::android.widget.ImageView[1]");

    private static final By BANK_STATEMENT_REMOVE_ICON_AFTER= By.xpath("//android.view.View[@content-desc='Bank statement']/following-sibling::android.widget.ImageView[1]");

    //Document Removal Popup
    private static final By DOCUMENT_REMOVAL_POPUP_HEADING = By.xpath("//android.view.View[@content-desc='Document removal']");
    private static final By DOCUMENT_REMOVAL_POPUP_CANCEL = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    private static final By DOCUMENT_REMOVAL_POPUP_REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");

    private static final By REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");
    private static final By ALL_DOCUMENT_POPUP_HEADING = By.xpath("//android.view.View[@content-desc='Income details']");
    private static final By ALL_DOCUMENT_REMOVAL_POPUP_CANCEL = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    private static final By ALL_DOCUMENT_REMOVAL_POPUP_REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");

    public static final By INDUSTRY = By.xpath("(//android.widget.ImageView)[1]");

    public OwnBusinessPage(){
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

    public void clickTradeLicense(){
        click(TRADE_LICENSE, "Salary certificate");
    }

    public void clickBankStatement(){
        click(BANK_STATEMENT, "Bank Statement");
    }

    public void enterTotalMonthlyIncome(final String income){
        click(TOTAL_MONTHLY_INCOME, "Total Monthly Income text field");
        sendKeys(TOTAL_MONTHLY_INCOME, income, "Total Monthly Income");
    }

    public void selectIndustry(final String value){
        click(INDUSTRY, "Industry Dropdown");
        String industryValue = String.format("//android.view.View[@content-desc='%s']", value);
        click(By.xpath(industryValue), value);
    }

    public void uploadTradeLicense(){
        uploadDocument("file1.pdf", TRADE_LICENSE, "Trade License");
    }

    public void uploadTradeLicenseGreaterThan4MB(){
        uploadDocument("file10MB.pdf", TRADE_LICENSE, "Trade License");
    }

    public void uploadBankStatement(){
        uploadDocument("file1.pdf", BANK_STATEMENT, "Bank Statement");
    }

    public void uploadBankStatementGreaterThan4MB(){
        uploadDocument("file10MB.pdf", BANK_STATEMENT, "Trade License");
    }

    public void removeTradeLicense(){
        click(TRADE_LICENSE_REMOVE_ICON, "Trade License remove icon");
        click(DOCUMENT_REMOVAL_POPUP_REMOVE, "Remove option on Document Removal");
    }

    public void removeBankStatement(){
        click(BANK_STATEMENT_REMOVE_ICON, "Bank Statement remove icon");
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
