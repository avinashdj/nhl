package com.nhl.pages.menunavigations;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Capture faq's screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 4/7/2022
 */
public class FaqsNHLPage {

    public FaqsNHLPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='FAQs']");
    private static final By QUESTION_ITEMS = By.className("android.widget.ScrollView");
    private static final By BACK = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

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
    public void check_and_validate_faqQuestionsBody() {
        Map<String, String> map = new HashMap<>();
        map.put("Why do I need to register?", "You need to register in order to access your grant details");
        map.put("My Emirates ID is not scanning - what can I do?", "Please bring your Emirates ID closer to the camera");
        map.put("What mobile number should I use to register?", "You need to use the mobile number you have registered with ADHA ");
        map.put("Why do I need an account?","You need to have an account opened with FAB");
        map.put("Why do you need my monthly income?","Your monthly income is used to calculate your monthly installment");
        map.put("How to calculate monthly income?","Monthly income is a total of gross salary");
        //map.put("Why are my bank details required?","Your bank details (IBAN) is required to set up");
        map.put("How often will I repay my loan?","Your installment is paid monthly till completion");
        map.put("When does repayment begin?","Your repayment will begin on completion");
        //TODO Pending Records

        Set<Map.Entry<String, String>> faqList = map.entrySet();

        for (Map.Entry<String, String> entry : faqList) {
            String questions = entry.getKey();
            String answer = entry.getValue();

            WebElement eleQuestions = DriverManager.getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc='"+questions+"']"));
            SeleniumUtils.click(eleQuestions);

            Assert.assertTrue(DriverManager.getDriver().findElement(By.xpath("//android.view.View[@content-desc='"+questions+"']")).isDisplayed(),"Oops.. Questions does not load !");
            WebElement eleAnswer = DriverManager.getDriver().findElement(By.xpath("//android.view.View[@content-desc='"+questions+"']/following-sibling::android.view.View[1]"));
            Assert.assertTrue(eleAnswer.getAttribute("content-desc").contains(answer),"Oops.. Faqs answer does not match !");
            SeleniumUtils.click(BACK,"Move Back");
        }

    }
}
