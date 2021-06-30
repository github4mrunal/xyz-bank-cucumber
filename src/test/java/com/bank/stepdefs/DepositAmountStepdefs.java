package com.bank.stepdefs;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DepositAmountStepdefs {
    @And("^I click on Customer Login button$")
    public void iClickOnCustomerLoginButton() throws InterruptedException {
        Thread.sleep(3000);
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("^I click on Deposit tab$")
    public void iClickOnDepositTab() throws InterruptedException {
        Thread.sleep(3000);
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amt)  {
        new AccountPage().enterDepositamount(amt);

    }

    @And("^I click on Deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I should see a message \"([^\"]*)\"$")
    public void iShouldSeeAMessage(String depositmessage)  {
        String expecteddepositmessage = "Deposit Successful";
        depositmessage = new AccountPage().verifyDepositSuccessfulText();
        Assert.assertEquals(expecteddepositmessage,depositmessage);
    }
}
