package com.bank.stepdefs;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddCustomerStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogintab();
    }

    @And("^I click on Add Customer Tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String firstname) {
        new AddCustomerPage().enterFirstName(firstname);
    }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void iEnterLastName(String lastname){
        new AddCustomerPage().enterLastName(lastname);
    }

    @And("^I enter PostCode \"([^\"]*)\"$")
    public void iEnterPostCode(String postcode) {
        new AddCustomerPage().enterPostCode(postcode);
    }

    @And("^I click on Add Customer Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String actualMessage){
        actualMessage = new AddCustomerPage().getTextFromAlert();
        Assert.assertTrue(actualMessage.contains("Customer added successfully"));
        new AddCustomerPage().getTextFromAlert();
    }

    @And("^I should able to accept popup$")
    public void iShouldAbleToAcceptPopup() {
        new AddCustomerPage().acceptAlert();
    }
}
