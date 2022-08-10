package com.nhl.pages.menunavigations;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Capture branches-nhl screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class BranchesNHLPage {

    public BranchesNHLPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//*[@contentDescription='NHL branch location']");
    private static final By BRANCH_ITEMS = By.xpath("//*[@class='android.view.View']");

    /**
     * Step : User check and validate already loaded branch-nhl page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void check_and_validate_branchNHLTitle() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(PAGE_TITLE, "Page Title - About"));
    }

    /**
     * Step : User check and validate existing faqs availability page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void check_and_validate_branchesNHLBody(String branch) {
        boolean results_found = false;
        List<WebElement> question_list = DriverManager.getDriver().findElements(BRANCH_ITEMS);
        for (WebElement item : question_list) {
            if (item.getTagName().equals(branch)) {
                results_found = true;
                break;
            }
        }
        Assert.assertTrue(results_found, "Branches not found !");
    }

    /**
     * Step : User choose specific given location and proceed
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public void step_performClickChooseBranch(String branch) {
        boolean results_found = false;
        List<WebElement> question_list = DriverManager.getDriver().findElements(BRANCH_ITEMS);
        for (WebElement item : question_list) {
            if (item.getTagName().equals(branch)) {
                item.click();
                break;
            }
        }
    }
}
