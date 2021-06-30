package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());



    @FindBy(xpath = "//option[contains,text() = 'Iron Man']")
    WebElement selectCustomer;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    public void setCustomerNameFromDropDown() {
        clickOnElement(selectCustomer);
        log.info("Clicking on Customer Login Tab" +selectCustomer.toString());

    }

    public void clickOnLoginTab(){
        clickOnElement(loginBtn);
        log.info("Clikcing on Login Tab" +loginBtn.toString());


    }
}

