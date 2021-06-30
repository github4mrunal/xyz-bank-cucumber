package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility{

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[@ng-click = 'deposit()']")
    WebElement depositTab;

    @FindBy(xpath = "//input[@ng-model = 'amount']")
    WebElement depositAmount;

    @FindBy(xpath = "//button[text() = 'Deposit']")
    WebElement depositButton;

    @FindBy(xpath = "//span[text() = 'Deposit Successful']")
    WebElement depoText;

    @FindBy(xpath = "//button[@ng-click = 'withdrawl()']")
    WebElement withdrawalTab;

    @FindBy(xpath = "//input[@ng-model = 'amount']")
    WebElement withdrwalAmtField;

    @FindBy(xpath = "//button[text() = 'Withdraw']")
    WebElement withdrawalButton;

    @FindBy(xpath = "//span[text() = 'Transaction successful']")
    WebElement transactionText;


    public void clickOnDepositTab() throws InterruptedException {
        log.info("clicking on deposit tab  "  +depositTab);
        Thread.sleep(3000);
        mouseHoverToElement(depositTab);
        clickOnElement( depositTab);

    }
    public void enterDepositamount(String depoAmt){
        sendTextToElement( depositAmount,depoAmt );
        log.info("entering deposit amount"  +depositAmount +depoAmt );
    }
    public void clickOnDepositButton(){
        clickOnElement( depositButton );
        log.info("clicking deposit button"  +depositButton );


    }
    public String verifyDepositSuccessfulText(){
        log.info("verifying deposit successful text"  +depoText);
        return getTextFromElement( depoText );

    }

    public void clickOnWithdrawaltab(){
        clickOnElement( withdrawalTab );
        log.info( "clicking withdrawal tab"  +withdrawalTab );

    }
    public void enterWithdrawalAmount(String wthdrawalAmt){
        sendTextToElement( withdrwalAmtField,wthdrawalAmt);
        log.info("entering withdrawl amount"  +withdrwalAmtField  +wthdrawalAmt  );
    }
    public void clickOnWithdrawalbutton(){
        clickOnElement( withdrawalButton );
        log.info( "clicking withdrawal Button"  +withdrawalButton );
    }
    public String verifyTransactionSuccessfulText(){
        log.info("verifying transaction successful text"  +transactionText);
        return getTextFromElement( transactionText );

    }


}






