package com.nhl.pages.idandv;


import com.nhl.pages.menunavigations.MenuMainPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.click;

public class WelcomePage {

    private static final By LETS_GET_STARTED = By.xpath("(//android.widget.Button[(@content-desc,'Let')])[2]");
    private static final By WELCOME_TITLE = By.xpath("//android.view.View[@content-desc='Welcome!']");
    //private TopMenuComponent topMenuComponent;

    public WelcomePage(){
		//this.topMenuComponent = new TopMenuComponent();
    }

    /**
     * action
     */
    public void clickLetsGetStartedButton(){
        click(LETS_GET_STARTED, "Let's Get Started Button");
    }



    /**
     * Step : User check and validate already loaded menu main page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public WelcomePage check_and_validate_menuTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(WELCOME_TITLE),"Welcome!","Oops.. Welcome page does not load !");
        return this;
    }

	/**
     * Step : perform top right-corner menu icon
     * @author shiwantha
     * @update 5/7/2022
     * @return
     */
    public MenuMainPage switchTOMenu(){
        //this.topMenuComponent.clickOnTopMenu();
        return new MenuMainPage();
    }
}
