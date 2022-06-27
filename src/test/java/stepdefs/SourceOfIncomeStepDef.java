package stepdefs;

import com.nhl.pages.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.sourceofincome.SalaryDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SourceOfIncomeStepDef {

    @Then("the user lands on the Source of income screen")
    public void theUserLandsOnTheSourceOfIncomeScreen() {
        System.out.println("The user is in Source of Income screen");
    }

    @When("the user clicks on salary Details")
    public void theUserClicksOnSalaryDetails() {
        new IncomeDetailsPage().clickSalaryDetails();
    }

    @Then("the user lands on the Salary Details screen")
    public void theUserLandsOnTheSalaryDetailsScreen() {
        System.out.println("The user lands on Salary Details screen");
    }

    @When("the user enter the total Monthly Salary as {string}")
    public void theUserEnterTheTotalMonthlySalaryAs(String salary) {
        new SalaryDetailsPage().enterTotalMonthlySalary(salary);
    }
    @When("the user uploads the Salary certificate")
    public void theUserUploadsTheSalaryCertificate() {
        new SalaryDetailsPage().uploadSalaryCertificate();
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
}
