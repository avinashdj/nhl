package com.nhl.pages;

import org.openqa.selenium.By;
import static com.nhl.utils.SeleniumUtils.*;

public class CongratsPageAccountOpening {

    private static final By DONE = By.xpath("//android.widget.Button[@content-desc='Done']");

    private static final By CONFIRMATION_TEXT = By.xpath("//android.view.View[@content-desc='You\'ve opened your FAB NHL Account!']");
    private static final By ACTIVATION_COMMENT = By.xpath("//android.view.View[@content-desc='To activate your account, please visit a FAB NHL branch with these documents.']");
    private static String LIST_PARENT = "//android.view.View[@content-desc='To activate your account, please visit a FAB NHL branch with these documents.']/following-sibling::android.view.View[%s]";
    //private static final By LIST_ELEMENT1 = By.xpath(String.format(LIST_PARENT,"1"));
    //private static final By LIST_ELEMENT1 = By.xpath("//android.view.View[@content-desc='To activate your account, please visit a FAB NHL branch with these documents.']/following-sibling::android.view.View[1]");
    //private static final By LIST_ELEMENT1 = By.xpath("//android.view.View[@content-desc='Emirates ID']");

    public By getXpathforListItems(final String index){
        return By.xpath(String.format(LIST_PARENT, index));
    }

    public CongratsPageAccountOpening(){
    }

    public String getCongratulationsMessage(){ return getContentDesc(CONFIRMATION_TEXT);}

    public String getListOfDocuments(final String index){
        return getContentDesc(getXpathforListItems(index));
    }

    public void clickDone(){
        click(DONE, "Continue Button");
    }

    public String getTitle(){ return getTitle();}
}
