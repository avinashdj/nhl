package com.nhl.pages;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Capture initial loading view get-started page
 *
 * @author shiwanthalakmal
 * @since 6/7/2022
 */
public class GetStaterPage {

    public GetStaterPage() {
    }

    private static final By PAGE_TITLE = By.xpath("");
    private static final By LETS_GET_STARTED = By.xpath("(//android.widget.Button[(@content-desc,'Let')])[2]");

    /**
     * Step : User validate current page
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public GetStaterPage check_and_validate_pageTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title"), "Oops.. Page title not matching");
        return this;
    }

    /**
     * Step : User start customer journey
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public RegisterYourMobilePage step_getStarted() {
        SeleniumUtils.click(LETS_GET_STARTED, "Let Get Started");
        return new RegisterYourMobilePage();
    }
}
