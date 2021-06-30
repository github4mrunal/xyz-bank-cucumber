package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class OpenAccountPage extends Utility {
        private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

        @FindBy(xpath = "//option[text() = 'Iron Man']")
        WebElement selectCust;

        @FindBy(xpath = "//select[@id = 'currency']")
        WebElement currency;

        @FindBy(xpath = "//option[contains(text(),  'Pound')]")
        WebElement pound;

        @FindBy(xpath = "//button[contains(text(), 'Process')]")
        WebElement processButton;



        public void clickCustomerNameFromDropDown(){

        clickOnElement(selectCust);
        log.info("Selecting Customer from DropDown" + selectCust.toString());
          //  mouseHoverToElementAndClick( selectCust );
            //  selectByValueFromDropDown(  custName,value);
        }
        public void selectCurrency(){
                         clickOnElement( currency );
                clickOnElement( pound );
                log.info( "clicking on currency"  +currency +pound  );
        }
        public void clickOnProcessButton() {

                mouseHoverToElement(processButton);
                log.info("clicking on process button" + processButton);
                clickOnElement(processButton);
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


