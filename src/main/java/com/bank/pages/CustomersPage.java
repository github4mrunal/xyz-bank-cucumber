package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    @FindBy(xpath = "//button[@ng-click = 'byebye()']")
    WebElement logOutTab;

    @FindBy(xpath = "//label[contains(text() , 'Your Name :')]")
    WebElement yourNameText;


    public String verifyLogOutTab(){
        log.info("verifying logout tab"  +logOutTab  );
        return getTextFromElement( logOutTab );
    }
    public String verifyYourNameText(){
        log.info("verifying your name text"  +yourNameText );

        return getTextFromElement( yourNameText );

    }
    public void clickOnLogOutTab(){
        clickOnElement(logOutTab);
        log.info("Clicking on Log Out tab" +logOutTab.toString());
    }


}
