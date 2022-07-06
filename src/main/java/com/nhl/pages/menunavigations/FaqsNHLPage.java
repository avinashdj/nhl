package com.nhl.pages.menunavigations;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Capture faq's screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class FaqsNHLPage {

    public FaqsNHLPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//*[@contentDescription='FAQs']");
    private static final By QUESTION_ITEMS = By.xpath("");

    /**
     * Step : User check and validate already loaded faq's page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void check_and_validate_faqsNHLTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title - Faq"));
    }

    /**
     * Step : User check and validate existing faqs availability page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void check_and_validate_aboutNHLBody(String question) {
        boolean results_found = false;
        List<WebElement> question_list = DriverManager.getDriver().findElements(QUESTION_ITEMS);
        for (WebElement item : question_list) {
            if (item.getTagName().equals(question)) {
                results_found = true;
                break;
            }
        }
        Assert.assertTrue(results_found, "Question not found !");
    }
}
