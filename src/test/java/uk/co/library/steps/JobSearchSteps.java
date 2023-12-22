package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Home Page")
    public void iAmOnHomePage() {

    }
    @And("I enter location {string}")
    public void iEnterLocation(String Value) {
        new HomePage().enterLocation(Value);
    }
    @When("I enter job title {string}")
    public void iEnterJobTitle(String Value) {
        new HomePage().enterJobTitle(Value);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String Value) {
        new HomePage().selectDistance(Value);
    }

    @Then("I click on moreSearchOptions Link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();

    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String value) {
        new HomePage().enterMinSalary(value);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String value) {
        new HomePage().enterMaxSalary(value);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String value) {
        new HomePage().selectSalaryType(value);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String value) {
        new HomePage().selectJobType(value);
    }

    @Then("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();

    }

    @And("I verify the result {string}")
    public void iVerifyTheResult(String value) {
        new ResultPage().verifyTheResults(value);
    }
}
