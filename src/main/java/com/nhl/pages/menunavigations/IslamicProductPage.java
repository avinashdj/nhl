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

    private static final By PAGE_TITLE = By.xpath("(//*[@class='android.view.View'])[0]");
    private static final By CURRENT_SAVING_OPTION = By.xpath("//*[contains(text(),'Current & Savings accounts')]");
    private static final By CREDIT_CARD_OPTION = By.xpath("//*[contains(text(),'Credit Cards')]");
    private static final By PERSONAL_FINANCE_OPTION = By.xpath("//*[contains(text(),'Personal finance')]");
    private static final By CAR_FINANCE_OPTION = By.xpath("//*[contains(text(),'Car finance')]");
    private static final By HOME_FINANCE_OPTION = By.xpath("//*[contains(text(),'Home finance')]");

    /**
     * Step : User check and validate already loaded islamic-product page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage check_and_validate_branchNHLTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title - Islamic Products"));
        return this;
    }

    /**
     * Step : User choose current-saving type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseCurrentSavingOption() {
        SeleniumUtils.click(CURRENT_SAVING_OPTION, "Choose current-saving");
        return this;
    }

    /**
     * Step : User choose credit-card type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseCreditCardOption() {
        SeleniumUtils.click(CREDIT_CARD_OPTION, "Choose credit card");
        return this;
    }

    /**
     * Step : User choose personal-finance type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_choosePersonalFinanceOption() {
        SeleniumUtils.click(PERSONAL_FINANCE_OPTION, "Choose personal finance");
        return this;
    }

    /**
     * Step : User choose car-finance type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseCarFinanceOption() {
        SeleniumUtils.click(CAR_FINANCE_OPTION, "Choose car finance");
        return this;
    }

    /**
     * Step : User choose house-finance type option
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseHomeFinanceOption() {
        SeleniumUtils.click(HOME_FINANCE_OPTION, "Choose house finance");
        return this;
    }

    /**
     * Step : User choose specific given location and proceed
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public IslamicProductPage step_chooseRequiredProduct(String product) {
        boolean results_found = false;
        List<WebElement> question_list = DriverManager.getDriver().findElements(By.xpath("(//*[@class='android.view.View'])[1]"));
        for (WebElement item : question_list) {
            if (item.getTagName().equals(product)) {
                item.click();
                break;
            }
        }
        return this;
    }
}
