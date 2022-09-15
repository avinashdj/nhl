package com.nhl.pages.accountactivation;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeDocumentsPage {

    public HomeDocumentsPage(){
    }

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    private static final By PAGE_TITLE = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'])[2]");

    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    private static final By CHECK_CONSENT = By.xpath("");

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public HomeDocumentsPage check_and_validate_termsConditionsTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Terms and Conditions","Oops.. Terms and Condition page does not load !");
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public HomeDocumentsPage step_sitePlanUpload(){
        SeleniumUtils.waitFor(5000);
        System.out.println("Uploading Site Plan upload");
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public HomeDocumentsPage step_certificateUpload(){
        SeleniumUtils.waitFor(5000);
        System.out.println("Uploading Search Certificate upload");
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public LoanAgreementPage step_clickContinue(){

        //SeleniumUtils.click(CONTINUE,"CONTINUE");
        //SeleniumUtils.waitFor(2000);
        return new LoanAgreementPage();
    }

}
