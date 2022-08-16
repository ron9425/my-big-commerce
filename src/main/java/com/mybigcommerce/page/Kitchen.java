package com.mybigcommerce.page;

import com.mybigcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitchen extends Utility {

    private static final Logger log = LogManager.getLogger(Kitchen.class.getName());

    public Kitchen() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Tiered Wire Basket')]")
    WebElement basket ;


    public void clickOnTieredWireBasket() {
        log.info("Clicking on Tiered Wire Basket : " + basket.toString());
        clickOnElement(basket);
    }



}
