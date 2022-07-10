package stepdefs;

import com.nhl.pages.accountcreation.sourceofincome.AdditionalIncomePage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.accountcreation.sourceofincome.OwnBusinessPage;
import com.nhl.pages.accountcreation.sourceofincome.SalaryDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SourceOfIncomeStepDef {

    @Then("the user lands on the Source of income screen")
    public void theUserLandsOnTheSourceOfIncomeScreen() {
        System.out.println("The user is in Source of Income screen");
    }

    @When("the user clicks on {string} as income source")
    public void theUserClicksOnIncomeSource(final String incomeSource) {
        if(incomeSource.equalsIgnoreCase("Salary")) {
            new IncomeDetailsPage().clickSalaryDetails();
        } else if(incomeSource.equalsIgnoreCase("Own Business")){
            new IncomeDetailsPage().clickOwnBusiness();
        } else if(incomeSource.equalsIgnoreCase("Additional Income")){
            new IncomeDetailsPage().clickAdditionalIncome();
        }
    }

    @Then("the user lands on the Salary Details screen")
    public void theUserLandsOnTheSalaryDetailsScreen() {
        System.out.println("The user lands on Salary Details screen");
    }

    @When("the user enter the total Monthly Salary as {string}")
    public void theUserEnterTheTotalMonthlySalaryAs(String salary) {
        new SalaryDetailsPage().enterTotalMonthlySalary(salary);
    }


    @When("the user uploads the document - {string}")
    public void theUserUploadsTheIncomeDocument(String incomeDocument) {
        switch(incomeDocument){
            case "Salary certificate":
                new SalaryDetailsPage().uploadSalaryCertificate();
                break;
            case "Salary-Bank statement" :
                new SalaryDetailsPage().uploadBankStatement();
                break;
            case "Trade license":
                new OwnBusinessPage().uploadTradeLicense();
                break;
            case "Own Business-Bank statement" :
                new OwnBusinessPage().uploadBankStatement();
                break;
            case "Pension certificate":
                new AdditionalIncomePage().uploadPensionCertificate();
                break;
            case "Additional Income-Bank statement" :
                new AdditionalIncomePage().uploadBankStatement();
                break;
        }
    }


    @When("the user uploads the Bank statement")
    public void theUserUploadsTheBankStatement() {
        new SalaryDetailsPage().uploadBankStatement();
    }
    @When("Clicks on add button")
    public void clicksOnAddButton() {
       new SalaryDetailsPage().clickAdd();
    }

    @When("click on Remove link")
    public void clickOnRemoveLink() {
        new SalaryDetailsPage().clickRemove();
    }
    @When("click on Remove option in the popup")
    public void clickOnRemoveOptionInThePopup() {
        new SalaryDetailsPage().clickRemoveInDocumentRemovePopup();
    }
    @When("document must be removed")
    public void documentMustBeRemoved() {
        System.out.println("Document removed");
    }

    @Then("continue button should be {string}")
    public void continueButtonShouldBe(String isDisabled) {
        if(isDisabled.equalsIgnoreCase("Disabled")){
            Assert.assertFalse(new IncomeDetailsPage().checkIfContinueButtonIsEnabled());
        } else {
            Assert.assertTrue(new IncomeDetailsPage().checkIfContinueButtonIsEnabled());
        }
    }

    @And("the user selects Industry as {string}")
    public void theUserSelectsIndustryAs(String industryType) {
        new OwnBusinessPage().selectIndustry(industryType);
    }

    @When("the user enter the total income for {string} as {string}")
    public void theUserEnterTheTotalIncomeAs(final String incomeSource, final String income) {
        switch(incomeSource){
            case "Salary":
                new SalaryDetailsPage().enterTotalMonthlySalary(income);
                break;
            case "Own Business" :
                new OwnBusinessPage().enterTotalMonthlyIncome(income);
                break;
            case "Additional Income":
                new AdditionalIncomePage().enterTotalMonthlyIncome(income);
                break;
        }
    }

    @When("the user clicks on remove icon of {string}")
    public void theUserClicksOnRemoveIconOf(String incomeDocument) {
        switch(incomeDocument){
            case "Salary certificate":
                new SalaryDetailsPage().removeSalaryCertificate();
                break;
            case "Salary-Bank statement" :
                new SalaryDetailsPage().removeBankStatement();
                break;
            case "Trade license":
                new OwnBusinessPage().removeTradeLicense();
                break;
            case "Own Business-Bank statement" :
                new OwnBusinessPage().removeBankStatement();
                break;
            case "Pension certificate":
                new AdditionalIncomePage().removePensionCertificate();
                break;
            case "Additional Income-Bank statement" :
                new AdditionalIncomePage().removeBankStatement();
                break;
        }
    }
    @Then("check if the Add button is disabled")
    public void checkIfTheAddButtonIsDisabled() {
        Assert.assertFalse(new SalaryDetailsPage().isAddEnabled());
    }

    @Then("check if the Add button is enabled")
    public void checkIfTheAddButtonIsEnabled() {
        Assert.assertTrue(new SalaryDetailsPage().isAddEnabled());
    }

    @Then("the user uploads the document above the max size limit - {string}")
    public void theUserUploadsTheDocumentAboveTheMaxSizeLimit(String incomeDocument) {
        switch(incomeDocument){
            case "Salary certificate":
                new SalaryDetailsPage().uploadSalaryCertificateGreaterThan4MB();
                break;
            case "Salary-Bank statement" :
                new SalaryDetailsPage().uploadBankStatementGreaterThan4MB();
                break;
            case "Trade license":
                new OwnBusinessPage().uploadTradeLicenseGreaterThan4MB();
                break;
            case "Own Business-Bank statement" :
                new OwnBusinessPage().uploadBankStatementGreaterThan4MB();
                break;
            case "Pension certificate":
                new AdditionalIncomePage().uploadPensionCertificateGreaterThan4MB();
                break;
            case "Additional Income-Bank statement" :
                new AdditionalIncomePage().uploadBankStatementGreaterThan4MB();
                break;
        }
    }

    @Then("validate whether the File exceeds max size error is shown")
    public void validateWhetherTheFileExceedsMaxSizeErrorIsShown() {
        Assert.assertTrue(new SalaryDetailsPage().iSFileExceedsMaxLimitErrorShown());
    }
}
