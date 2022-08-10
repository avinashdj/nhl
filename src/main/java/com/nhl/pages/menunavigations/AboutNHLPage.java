package com.nhl.pages.menunavigations;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Capture about-nhl screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class AboutNHLPage {

    public AboutNHLPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='National Housing Loan']");
    private static final By ABOUT_NHL_BODY = By.xpath("//android.view.View[@content-desc='National Housing Loan']/following-sibling::android.view.View[1]");

    private static final By BACK = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView");

    /**
     * Step : User check and validate already loaded about-nhl page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public AboutNHLPage check_and_validate_aboutNHLTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"National Housing Loan","Oops.. About page does not load !");
        return this;
    }

    /**
     * Step : User check and validate already loaded about-nhl page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public AboutNHLPage check_and_validate_aboutNHLBody() {
        List<String> pharagraphList = new ArrayList<String>(5);
        pharagraphList.add("In March 2006, the Bank, at the invitation of the Finance Department");
        //pharagraphList.add("- The program was launched in July 29, 1990 under Law");
        //pharagraphList.add("- In December 1990, the Executive Council of the Emirate");
        //pharagraphList.add("- Law No. 3 of 1990 was amended by Law No. 6 of 2000 by increasing");
        //pharagraphList.add("- In May 2008, Law No. 6 of 2000 was amended by Law");

        for (String pharagraph : pharagraphList) {
            Assert.assertTrue(SeleniumUtils.getContentDesc(ABOUT_NHL_BODY).contains(pharagraph),"Oops.. About page content messing or changed !");
        }
        return this;
    }

    /**
     * Step : User move back from about nhl screen
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public MenuMainPage step_goBack(){
        SeleniumUtils.click(BACK, "BACK");
        return new MenuMainPage();
    }
}
