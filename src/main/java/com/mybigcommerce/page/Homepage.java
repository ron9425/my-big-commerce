package com.mybigcommerce.page;

import com.mybigcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='menu']/nav[1]/ul[1]/li[3]/a[1]")
    WebElement kitchen ;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    WebElement cookies ;




    public void clickOnKitchen() {
        log.info("Clicking on Kitchen : " + kitchen.toString());
        clickOnElement(kitchen);
    }

    public void clickOnAcceptCookies() {
        log.info("Clicking on Accept Cookies : " + cookies.toString());
        clickOnElement(cookies);
    }


}
