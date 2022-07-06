package com.nhl.pages.menunavigations;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.click;

/**
 * Capture main menu screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class MenuMainPage {

    public MenuMainPage() {
    }

    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");
    private static final By PAGE_TITLE = By.xpath("//*[@contentDescription='Menu']");
    private static final By IDENTITY_VERIFY_TAB = By.xpath("//*[contains(text(),'Verify your identity')]");
    private static final By ISLAMIC_PRODUCTS_TAB = By.xpath("//*[contains(text(),'FAB Islamic products')]");
    private static final By NHL_BRANCH_TAB = By.xpath("//*[contains(text(),'NHL branches')]");
    ;
    private static final By FAQs_TAB = By.xpath("//*[contains(text(),'FAQs')]");
    private static final By ABOUT_NHL_TAB = By.xpath("//*[contains(text(),'About NHL')]");
    ;

    private static final By LOGOUT = By.xpath("//*[@contentDescription='Log Out']");

    /**
     * Step : User check and validate already loaded menu main page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void check_and_validate_menuTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title - Menu"));
    }

    /**
     * Step : User perform identity verification navigation
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void step_identityVerifyClickAndNavigate() {
        click(IDENTITY_VERIFY_TAB, "Verify Identity");
    }

    /**
     * Step : User perform islamic products navigation
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public void step_islamicProductClickAndNavigate() {
        click(ISLAMIC_PRODUCTS_TAB, "Islamic Products");
    }

    /**
     * Step : User perform nhl-branch navigation
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public void step_nhlBranchClickAndNavigate() {
        click(NHL_BRANCH_TAB, "NHL Branches");
    }

    /**
     * Step : User perform faq's navigation
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public void step_faqsClickAndNavigate() {
        click(FAQs_TAB, "FAQs");
    }

    /**
     * Step : User perform about nhl navigation
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public void step_aboutClickAndNavigate() {
        click(ABOUT_NHL_TAB, "About NHL");
    }

    /**
     * Step : User perform app logout
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public void step_logoutNHL() {
        click(LOGOUT, "Logout");
    }

    /**
     * Step : User got back to previous screen using top back button
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public void step_navigateBack() {
        click(BACK, "GO Back");
    }
}
