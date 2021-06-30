package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger( BankManagerLoginPage.class.getName());

    @FindBy(xpath = "//button[@ng-click='addCust()']")
    WebElement addCustomerTab;

    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;

    public void clickOnAddCustomerTab(){
        clickOnElement( addCustomerTab );
        log.info("clicking on add customer tab"  +addCustomerTab );
    }
    public void clickOpenAccount(){
        clickOnElement ( openAccount );
        log.info("clicking open account tab"  +openAccount );
    }


}

