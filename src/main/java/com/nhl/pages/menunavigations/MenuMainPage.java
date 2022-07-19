package com.nhl.pages.menunavigations;

import com.nhl.pages.SetPinPage;
import com.nhl.pages.WelcomePage;
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

    private static final By BACK = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='Menu']");
    private static final By IDENTITY_VERIFY_TAB = By.xpath("//android.view.View[@content-desc='OTHER FAB PRODUCTS']/preceding-sibling::*");
    private static final By ISLAMIC_PRODUCTS_TAB = By.xpath("//android.view.View[@content-desc='OTHER FAB PRODUCTS']/following-sibling::android.view.View[1]");
    private static final By NHL_BRANCH_TAB = By.xpath("//android.view.View[@content-desc='NATIONAL HOUSING LOAN']/following-sibling::android.view.View[1]");
    ;
    private static final By FAQs_TAB = By.xpath("//android.view.View[@content-desc='NATIONAL HOUSING LOAN']/following-sibling::android.view.View[2]");
    private static final By ABOUT_NHL_TAB = By.xpath("//android.view.View[@content-desc='NATIONAL HOUSING LOAN']/following-sibling::android.view.View[3]");

    private static final By LOGOUT = By.xpath("//android.view.View[@content-desc='NATIONAL HOUSING LOAN']/following-sibling::android.view.View[4]");

    /**
     * Step : User check and validate already loaded menu main page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public MenuMainPage check_and_validate_menuTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title - Menu"));
        return this;
    }

    /**
     * Step : User perform identity verification navigation
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public PersonalInfoPage step_identityVerifyClickAndNavigate() {
        click(IDENTITY_VERIFY_TAB, "Verify Identity");
        return new PersonalInfoPage();
    }

    /**
     * Step : User perform islamic products navigation
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public IslamicProductPage step_islamicProductClickAndNavigate() {
        click(ISLAMIC_PRODUCTS_TAB, "Islamic Products");
        return new IslamicProductPage();    }

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
    public FaqsNHLPage step_faqsClickAndNavigate() {
        click(FAQs_TAB, "FAQs");
        return new FaqsNHLPage();
    }

    /**
     * Step : User perform about nhl navigation
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public AboutNHLPage step_aboutClickAndNavigate() {
        click(ABOUT_NHL_TAB, "About NHL");
        return new AboutNHLPage();
    }

    /**
     * Step : User perform app logout
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public SetPinPage step_logoutNHL() {
        click(LOGOUT, "Logout");
        return new SetPinPage();
    }

    /**
     * Step : User got back to previous screen using top back button
     *
     * @author shiwnatha
     * @update 4/7/2022
     */
    public WelcomePage step_navigateBack() {
        click(BACK, "GO Back");
        return new WelcomePage();
    }
}
