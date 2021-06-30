package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger( AddCustomerPage.class.getName());

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @FindBy(xpath = "\n" +
            "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCode;

   @FindBy(xpath = "//div[@class='form-group']//following-sibling::div[2]//following::button[@type='submit']")
    WebElement addCustButton;

    public void enterFirstName(String frstName){
       mouseHoverToElementAndClick(firstName);
        sendTextToElement(firstName,frstName);
        log.info("Enter first name"  +firstName );
    }
    public void enterLastName(String lstName){
        sendTextToElement( lastName,lstName );
        log.info("Enter last name"  +lastName );
    }
    public void enterPostCode(String pstCode){
        sendTextToElement( postCode,pstCode);
        log.info("Enter postcode"  +postCode);
    }
    public void clickOnAddCustomerButton(){
        log.info("clicking add customer button"  +addCustButton);
        clickOnElement( addCustButton );

    }
    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String getTextFromAlert(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();

    }


}

