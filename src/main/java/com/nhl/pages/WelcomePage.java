package com.nhl.pages;

import com.nhl.pages.menunavigations.MenuMainPage;
import com.nhl.pages.pagecomponent.TopMenuComponent;
import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;

public class WelcomePage {

    private static final By LETS_GET_STARTED = By.xpath("(//android.widget.Button[(@content-desc,'Let')])[2]");
    private TopMenuComponent topMenuComponent;

    public WelcomePage(){
		this.topMenuComponent = new TopMenuComponent();
    }

    /**
     * action
     */
    public void clickLetsGetStartedButton(){
        click(LETS_GET_STARTED, "Let's Get Started Button");
    }
	
	/**
     * Step : perform top right-conver menu icon
     * @author shiwantha
     * @update 5/7/2022
     * @return
     */
    public MenuMainPage switchTOMenu(){
        this.topMenuComponent.clickOnMenu("Menu");
        return new MenuMainPage();
    }
}
