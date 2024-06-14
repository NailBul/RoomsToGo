package com.roomsToGo.pages;


import com.roomsToGo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 * abstract - to prevent instantiation.
 */
public abstract  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@id='header-accounts-menu-btn']")
    public WebElement profileIcon;

    @FindBy(css = "svg[data-testid='ShoppingCartOutlinedIcon']")
    public WebElement cartSymbol;

    @FindBy(xpath = "//li[@role='menuitem']")
    public WebElement secondLoginLink;


    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler ot-close-icon banner-close-button']")
    public WebElement bonusBanner;

    @FindBy(xpath = "//div[@class='abt-close-container']//span")
    public WebElement cookiesBanner;

    @FindBy(xpath = "//li[@role='menuitem']")
    public WebElement logOutButton;



    public void navigateModule(String moduleName){
        Driver.getDriver().findElement(By.xpath(" //a[normalize-space()='"+ moduleName+"']")).click();
    }
}
