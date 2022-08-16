package com.mybigcommerce.page;

import com.mybigcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TieredWireBasket extends Utility {

    private static final Logger log = LogManager.getLogger(TieredWireBasket.class.getName());

    public TieredWireBasket() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='form-action-addToCart']")
    WebElement addToChart ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    WebElement checkout ;

    public void clickOnAddToChart() {
        log.info("Clicking on Add To Chart : " + addToChart.toString());
        clickOnElement(addToChart);
    }

    public void clickOnProceedToCheckout() {
        log.info("Clicking on Proceed To Checkout : " + checkout.toString());
        clickOnElement(checkout);
    }









}
