package com.bank.stepdefs;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OpenAccountStepdefs {
    @When("^I click on Open Account tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOpenAccount();
    }

    @And("^I search customer from DropDown$")
    public void iSearchCustomerFromDropDown() {
        new OpenAccountPage().clickCustomerNameFromDropDown();
    }

    @And("^I select currency from DropDown$")
    public void iSelectCurrencyFromDropDown() {
        new OpenAccountPage().selectCurrency();
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String actualMessage)  {
        actualMessage =   new AddCustomerPage().getTextFromAlert();
        Assert.assertTrue( actualMessage.contains( "Account created successfully" ) );


    }

    @And("^I should be able to accept pop up$")
    public void iShouldBeAbleToAcceptPopUp() {
        new OpenAccountPage().acceptAlert();
    }
}
