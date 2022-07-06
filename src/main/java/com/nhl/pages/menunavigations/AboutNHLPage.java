package com.nhl.pages.menunavigations;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Capture about-nhl screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class AboutNHLPage {

    public AboutNHLPage() {
    }

    private static final By PAGE_TITLE = By.xpath("(//*[@class='android.view.View'])[0]");
    private static final By ABOUT_NHL_BODY = By.xpath("(//*[@class='android.view.View'])[1]");

    /**
     * Step : User check and validate already loaded about-nhl page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public AboutNHLPage check_and_validate_aboutNHLTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title - About"));
        return this;
    }

    /**
     * Step : User check and validate already loaded about-nhl page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public AboutNHLPage check_and_validate_aboutNHLBody(String body) {
        SeleniumUtils.isDisplayed(ABOUT_NHL_BODY, "Page Title - Menu");
        String content = SeleniumUtils.getContentDesc(ABOUT_NHL_BODY);
        Assert.assertEquals(content, body);
        return this;
    }
}
