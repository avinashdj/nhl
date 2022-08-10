package com.nhl.pages.menunavigations;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Capture islamic-product screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class IslamicProductPage {

    public IslamicProductPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='FAB ISLAMIC PRODUCTS']");
    private static final By CURRENT_SAVING_OPTION = By.xpath("//android.view.View[@content-desc='Current & Savings accounts Your everyday banking needs']/android.widget.ImageView[2]");
    private static final By CREDIT_CARD_OPTION = By.xpath("//android.view.View[@content-desc='Credit Cards Exceptional & exciting features']");
    private static final By PERSONAL_FINANCE_OPTION = By.xpath("//android.view.View[@content-desc='Personal finance Exceptional services and features']");
    private static final By CAR_FINANCE_OPTION = By.xpath("//android.view.View[@content-desc='Car finance Your dream car through FAB Islamic']");
    private static final By HOME_FINANCE_OPTION = By.xpath("//android.view.View[@content-desc='Home finance Shariah-compliant home finance']");
    private static final By NEXT = By.xpath("//android.widget.Button[@content-desc='Next']");
    private static final By DONE = By.xpath("//android.widget.Button[@content-desc='Done']");
    private static final By BACK = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView");

    /**
     * Step : User check and validate already loaded islamic-product page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage check_and_validate_islamicProductsTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"FAB ISLAMIC PRODUCTS","Oops.. Islamic page does not load !");
        return this;
    }

    /**
     * Step : User choose current-saving type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseCurrentSavingOption() {
        SeleniumUtils.waitUntilElementToBeClickable(CURRENT_SAVING_OPTION).click();
        return this;
    }

    /**
     * Step : User choose credit-card type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseCreditCardOption() {
        SeleniumUtils.waitUntilElementToBeClickable(CREDIT_CARD_OPTION).click();
        return this;
    }

    /**
     * Step : User choose personal-finance type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_choosePersonalFinanceOption() {
        SeleniumUtils.waitUntilElementToBeClickable(PERSONAL_FINANCE_OPTION).click();
        return this;
    }

    /**
     * Step : User choose car-finance type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseCarFinanceOption() {
        SeleniumUtils.waitUntilElementToBeClickable(CAR_FINANCE_OPTION).click();
        return this;
    }

    /**
     * Step : User choose house-finance type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseHomeFinanceOption() {
        SeleniumUtils.waitUntilElementToBeClickable(HOME_FINANCE_OPTION).click();
        return this;
    }

    /**
     * Step : User confirm and move next with selected products
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_moveNext(){
        SeleniumUtils.click(NEXT,"NEXT");
        return this;
    }

    /**
     * Step : User back to main menu screen
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public MenuMainPage step_completeFABProduct(){
        SeleniumUtils.click(DONE,"DONE");
        return new MenuMainPage();
    }

    /**
     * Step : User back to main menu screen
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public MenuMainPage step_goBack(){
        SeleniumUtils.click(BACK,"BACK");
        return new MenuMainPage();
    }
}
