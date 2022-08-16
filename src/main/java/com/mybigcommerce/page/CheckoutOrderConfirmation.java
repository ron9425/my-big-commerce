package com.mybigcommerce.page;

import com.mybigcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOrderConfirmation extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutOrderConfirmation.class.getName());

    public CheckoutOrderConfirmation() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you ron!')]")
    WebElement confirmation ;


    public String verifyConfirmation() {
        String message = getTextFromElement(confirmation);
        log.info("I verify order Confirmation Text: " + confirmation.toString());
        return message;
    }



}
