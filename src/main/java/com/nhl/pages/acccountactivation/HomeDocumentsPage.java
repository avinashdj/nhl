package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class HomeDocumentsPage {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Documents']");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Share your home documents']");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc," +
            "'Please upload valid copies of the documents below.')]");

    private static final By SITE_PLAN = By.xpath("//android.widget.ImageView[@content-desc='Site plan']");
    private static final By SEARCH_CERTIFICATE = By.xpath("//android.widget.ImageView[@content-desc='Search certificate']");

    //Remove icon
    private static final By SITE_PLAN_REMOVE_ICON = By.xpath("//android.view.View[@content-desc='Site plan']" +
            "/following-sibling::android.widget.ImageView[1]");
    private static final By SEARCH_CERTIFICATE_REMOVE_ICON = By.xpath("//android.view.View[@content-desc='Search certificate']" +
            "/following-sibling::android.widget.ImageView[1]");

    //Document Removal Popup
    private static final By DOCUMENT_REMOVAL_POPUP_HEADING = By.xpath("//android.view.View[@content-desc='Document removal']");
    private static final By DOCUMENT_REMOVAL_POPUP_CANCEL = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    private static final By DOCUMENT_REMOVAL_POPUP_REMOVE = By.xpath("//android.widget.Button[@content-desc='Remove']");


    private static final By FILE_SIZE_AND_TYPE_TEXT = By.xpath("//android.view.View[@content-desc='File must not exceed " +
            "4 MB (JPG, PNG, PDF formats only)']");

    private static final By FILE_EXCEEDS_4MB = By.xpath("//android.view.View[contains(@content-desc,'Your file exceeds the maximum limit')]");

    public void uploadSitePlan(){
        uploadDocument("file1.pdf", SITE_PLAN, "Site Plan");
    }

    public void uploadSitePlanGreaterThan4MB(){
        uploadDocument("file10MB.pdf", SITE_PLAN, "Site Plan greater than 4mb");
    }

    public void uploadSearchCertificate(){
        uploadDocument("file1.pdf", SEARCH_CERTIFICATE, "Search Certificate");
    }

    public void uploadSearchCertificateGreaterThan4MB(){
        uploadDocument("file10MB.pdf", SEARCH_CERTIFICATE, "Search Certificate greater than 4mb");
    }

    public void remoteSitePlan(){
        click(SITE_PLAN_REMOVE_ICON, "Site Plan remove icon");
        click(DOCUMENT_REMOVAL_POPUP_REMOVE, "Remove option on Document Removal");
    }

    public void removeBankStatement(){
        click(SEARCH_CERTIFICATE_REMOVE_ICON, "Search Certificate remove icon");
        click(DOCUMENT_REMOVAL_POPUP_REMOVE, "Remove option on Document Removal");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

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

    public String getFileSizeAndTypeText(){
        return getContentDesc(FILE_SIZE_AND_TYPE_TEXT);
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public boolean iSFileExceedsMaxLimitErrorShown(){
        waitUntilElementPresent(FILE_EXCEEDS_4MB);
        return isDisplayed(FILE_EXCEEDS_4MB, "File Exceeds 4MB error message");
    }
}
