package com.nhl.pages;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;
import static com.nhl.utils.SeleniumUtils.getContentDesc;

public class WelcomeScreenAccountActivation {

    private static final By ACCOUNT_ACTIVATION_TXT = By.xpath("//android.view.View[@content-desc='Account activation']");
    private static final By PREP_REQ_DOCS = By.xpath("//android.widget.Button[@content-desc='Prepare required documents']");

    public WelcomeScreenAccountActivation(){
    }

    public String getAccActivationtxt(){ return getContentDesc(ACCOUNT_ACTIVATION_TXT);}

    public String getPrepButtontxt(){
        return getContentDesc(PREP_REQ_DOCS);
    }

}
