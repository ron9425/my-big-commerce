package com.mybigcommerce.page;

import com.mybigcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout extends Utility {

    private static final Logger log = LogManager.getLogger(Checkout.class.getName());

    public Checkout() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/label[1]/span[1]")
    WebElement ePrivacy;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout-customer-continue']")
    WebElement guest;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-app']/div[1]/div[1]/div[1]/aside[1]/article[1]/section[3]/div[1]/div[1]/span[2]/span[1]")
    WebElement verify;

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstNameInput']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='lastNameInput']")
    WebElement lastname;

    @CacheLookup
    @FindBy(id = "addressLine1Input")
    WebElement address;

    @CacheLookup
    @FindBy(id = "cityInput")
    WebElement cityName;

    @CacheLookup
    @FindBy(id = "postCodeInput")
    WebElement postcode;

    @CacheLookup
    @FindBy(id = "phoneInput")
    WebElement phone;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout-shipping-continue']")
    WebElement continue1;

    @CacheLookup
    @FindBy(id = "ccNumber")
    WebElement cardnumber;

    @CacheLookup
    @FindBy(id = "ccExpiry")
    WebElement cardexpiry;

    @CacheLookup
    @FindBy(id = "ccName")
    WebElement cardname;

    @CacheLookup
    @FindBy(id = "ccCvv")
    WebElement cvv;

    @CacheLookup
    @FindBy(id = "checkout-payment-continue")
    WebElement placeorder;


    public void enterEmail(String Email) {
        log.info("I Enter email : " + email.toString());
        sendTextToElement(email, Email);
    }

    public void clickOnPrivacyPolicy() {
        log.info("Clicking yes on Privacy Policy : " + ePrivacy.toString());
        clickOnElement(ePrivacy);
    }


    public void clickOnContinueAsGuest() {
        log.info("Clicking on Continue as guest : " + guest.toString());
        clickOnElement(guest);
    }


    public String verifyThePrice() {
        String message = getTextFromElement(verify);
        log.info("I verify the price of the product : " + verify.toString());
        return message;
    }

    public void enterFirstName(String FirstName) {
        log.info("I Enter First Name : " + firstname.toString());
        sendTextToElement(firstname, FirstName);
    }

    public void enterLastName(String LastName) {
        log.info("I Enter Last Name : " + lastname.toString());
        sendTextToElement(lastname, LastName);
    }

    public void enterAddressName(String Address) {
        log.info("I Enter Address Name : " + address.toString());
        sendTextToElement(address, Address);
    }

    public void enterCityName(String city) {
        log.info("I Enter City Name : " + city.toString());
        sendTextToElement(cityName, city);
    }


    public void enterPostCode(String PostCode) {
        log.info("I Enter Post Code : " + postcode.toString());
        sendTextToElement(postcode, PostCode);
    }

    public void enterPhoneNumber(String PhoneNumber) throws InterruptedException {
        log.info("I Enter PhoneNumber : " + phone.toString());
        sendTextToElement(phone, PhoneNumber);
        pageScrollDown();
        Thread.sleep(1000);
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(2000);
        log.info("I click On Continue : " + continue1.toString());
        mouseHoverToElement(continue1);
        clickOnElement(continue1);
    }


    public void enterPaymentMethod() {
        log.info("I Enter card number : " + cardnumber.toString());
        sendTextToElement(cardnumber, "4111 1111 1111 1111");
        log.info("I Enter card expiry : " + cardexpiry.toString());
        sendTextToElement(cardexpiry, "09/30");
        log.info("I Enter card name: " + cardname.toString());
        sendTextToElement(cardname, "MR R LOBO");
        log.info("I Enter cvv: " + cvv.toString());
        sendTextToElement(cvv, "007");
    }

    public void clickOnPlaceOrder() {
        log.info("click on PlaceOrder : " + placeorder.toString());
        clickOnElement(placeorder);
    }


}
