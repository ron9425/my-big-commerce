package com.mybigcommerce.steps;

import com.mybigcommerce.page.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TieredWireBasketStepDefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new Homepage().clickOnAcceptCookies();
    }

    @When("^I click on Kitchen tab$")
    public void iClickOnKitchenTab() {
        new Homepage().clickOnKitchen();
    }

    @Then("^I click on the product to buy$")
    public void iClickOnTheProductToBuy() {
        new Kitchen().clickOnTieredWireBasket();
    }

    @And("^I click on add to chart$")
    public void iClickOnAddToChart() {
        new TieredWireBasket().clickOnAddToChart();
    }

    @And("^I click on Proceed to checkout$")
    public void iClickOnProceedToCheckout() {
        new TieredWireBasket().clickOnProceedToCheckout();
    }


    @And("^I verify the \"([^\"]*)\"$")
    public void iVerifyThe(String price) {
        Assert.assertEquals("$120.00", price, new Checkout().verifyThePrice());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String Email) {
        new Checkout().enterEmail(Email);
    }

    @And("^I agree with privacy policy$")
    public void iAgreeWithPrivacyPolicy() {
        new Checkout().clickOnPrivacyPolicy();
    }

    @And("^I click on continue as guest$")
    public void iClickOnContinueAsGuest() {
        new Checkout().clickOnContinueAsGuest();
    }


    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String FirstName) {
        new Checkout().enterFirstName(FirstName);
    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String LastName) {
        new Checkout().enterLastName(LastName);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String Address) {
        new Checkout().enterAddressName(Address);
    }

    @And("^I enter City  \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new Checkout().enterCityName(city);
    }

    @And("^I enter Postal Code \"([^\"]*)\"$")
    public void iEnterPostalCode(String PostCode) {
        new Checkout().enterPostCode(PostCode);
    }

    @And("^I enter Phone Number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String PhoneNumber) throws InterruptedException {
        new Checkout().enterPhoneNumber(PhoneNumber);
    }

    @And("^I click Continue$")
    public void iClickContinue() throws InterruptedException {
        new Checkout().clickOnContinue();
    }

    @And("^I enter Payment method$")
    public void iEnterPaymentMethod() {
        new Checkout().enterPaymentMethod();
    }

    @And("^I click place order$")
    public void iClickPlaceOrder() {
        new Checkout().clickOnPlaceOrder();
    }




}
