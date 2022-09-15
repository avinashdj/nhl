package com.nhl.pages.accountactivation;

import com.nhl.driver.DriverManager;
import com.nhl.pages.accountcreation.additionaldetails.CPRConditionsPage;
import com.nhl.pages.idandv.DashboardPage;
import com.nhl.pages.verifyidentityphase.ADHAApplicationPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.nhl.utils.SeleniumUtils.*;

public class YourBankAccountPage {

    public YourBankAccountPage(){
    }

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    //Screen title and Other headings
    private static final By PAGE_TITLE = By.xpath("(//android.view.View[@content-desc='Your bank account'])[2]");

    //Banks
    private static final By FAB_BANK = By.xpath("//android.view.View[@content-desc='First Abu Dhabi Bank (FAB)']");
    private static final By OTHER_UAE_BANK = By.xpath("//android.view.View[@content-desc='Other UAE bank']");

    //Bank Account details
    private static final By IBAN = By.xpath("//android.widget.EditText[contains(@text,'IBAN')]");
    private static final By ACCOUNT_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Account number')]");
    private static final By BANK_NAME = By.xpath("//android.widget.EditText[contains(@text,'Bank name')]");
    private static final By BRANCH_NAME = By.xpath("//android.view.View[@content-desc='FAB ACCOUNT DETAILS']/following-sibling::android.widget.EditText[3]");

    //Loading
    private static final By LOADING = By.xpath("//android.view.View[@content-desc='Loading']");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");


    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public YourBankAccountPage check_and_validate_yourBankTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Your bank account","Oops.. Your bank account page does not load !");
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public YourBankAccountPage step_clickChooseFabBank(){
        SeleniumUtils.click(FAB_BANK, "FAB BANK");
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public YourBankAccountPage step_clickChooseOtherBank(){
        SeleniumUtils.click(OTHER_UAE_BANK, "OTHER BANK");
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public YourBankAccountPage step_enterFabAccountDetails(String account, String iban, String branch){
        List<WebElement> elements = DriverManager.getDriver().findElements(By.className("android.widget.EditText"));
        elements.get(0).click();
        elements.get(0).sendKeys(account);
        SeleniumUtils.hideKeyboard();

        elements.get(1).click();
        elements.get(1).sendKeys(iban);
        SeleniumUtils.hideKeyboard();

        elements.get(2).click();
        elements.get(2).sendKeys(branch);
        SeleniumUtils.hideKeyboard();
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public YourBankAccountPage step_enterOtherBankAccountDetails(String account, String iban, String bank,String branch){
        List<WebElement> elements = DriverManager.getDriver().findElements(By.className("android.widget.EditText"));
        elements.get(0).click();
        elements.get(0).sendKeys(account);
        SeleniumUtils.hideKeyboard();

        elements.get(1).click();
        elements.get(1).sendKeys(iban);
        SeleniumUtils.hideKeyboard();

        elements.get(2).click();
        elements.get(2).sendKeys(bank);
        SeleniumUtils.hideKeyboard();

        elements.get(3).click();
        elements.get(3).sendKeys(branch);
        SeleniumUtils.hideKeyboard();
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public StandingInstructionPage step_clickContinue(){
        SeleniumUtils.click(CONTINUE,"CONTINUE");
        SeleniumUtils.waitFor(2000);
        return new StandingInstructionPage();
    }



}
