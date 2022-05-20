package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept the cookies by clicking on acceptcookies$")
    public void iAcceptTheCookiesByClickingOnAcceptcookies() {
        new HomePage().clickOnAcceptCookie();

    }

    @And("^I enter \"([^\"]*)\" in the job title field$")
    public void iEnterInTheJobTitleField(String jobTitle)  {
       new HomePage().setJobtitle(jobTitle);
    }

    @And("^I enter the \"([^\"]*)\" in the location field$")
    public void iEnterTheInTheLocationField(String location)  {
       new HomePage().setLocation(location);
    }

    @And("^I enter the \"([^\"]*)\" in the distance field$")
    public void iEnterTheInTheDistanceField(String distance)  {
       new HomePage().setDistance(distance);
    }

    @And("^I click on more search option link$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("^I enter \"([^\"]*)\" in the min salary field$")
    public void iEnterInTheMinSalaryField(String salaryMin)  {
       new HomePage().setSalaryminimum(salaryMin);
    }

    @And("^I enter \"([^\"]*)\" in the max salary field$")
    public void iEnterInTheMaxSalaryField(String salaryMax)  {
       new HomePage().setMaximumsalary(salaryMax);
    }

    @And("^I enter \"([^\"]*)\" in the salary type field$")
    public void iEnterInTheSalaryTypeField(String salaryType)  {
       new HomePage().setSalarytype(salaryType);
    }

    @And("^I enter \"([^\"]*)\" in the job type field$")
    public void iEnterInTheJobTypeField(String jobType)  {
       new HomePage().setJobtype(jobType);
    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobButton();
    }

    @Then("^I can see the \"([^\"]*)\" on the page$")
    public void iCanSeeTheOnThePage(String result)  {

        Assert.assertEquals("", result,new ResultPage().setResults());
    }
}
