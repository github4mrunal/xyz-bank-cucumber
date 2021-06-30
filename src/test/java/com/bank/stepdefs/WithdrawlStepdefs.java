package com.bank.stepdefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WithdrawlStepdefs {
    @And("^I click on Withdrawl tab$")
    public void iClickOnWithdrawlTab() {
        new AccountPage().clickOnWithdrawaltab();
    }

    @And("^I enter  Withdrawl amount \"([^\"]*)\"$")
    public void iEnterWithdrawlAmount(String amt) throws InterruptedException {
        Thread.sleep(3000);
        new AccountPage().enterWithdrawalAmount(amt);

    }

    @And("^I click on Withdraw button$")
    public void iClickOnWithdrawButton() {

        new AccountPage().clickOnWithdrawalbutton();
    }

    @Then("^I should able to see message \"([^\"]*)\"$")
    public void iShouldAbleToSeeMessage(String widthdrawmessage)  {
        String expectedwidthdrawmessage = "Transaction successful";
        widthdrawmessage = new AccountPage().verifyTransactionSuccessfulText();
        Assert.assertEquals(expectedwidthdrawmessage,widthdrawmessage);
    }
}
