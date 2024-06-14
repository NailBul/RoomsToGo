package com.roomsToGo.pages;

import com.roomsToGo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotBuysPage extends BasePage{
   public HotBuysPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath = "//div[@class='MuiBox-root css-1szfvbg']")
    public WebElement denimColor;

   @FindBy(xpath = "//button[@aria-label='Add To Cart for Arlington 2 Pc Living Room Set']")
    public WebElement addToCartButton;

   @FindBy(xpath = "//div[@data-testid='modal-content']//button[@data-testid='view-cart-button']")
    public WebElement viewCartButton;


}
