package com.roomsToGo.pages;

import com.roomsToGo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    public ShoppingCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "remove-btn")
    public WebElement removeButton;

    @FindBy(id = "empty-cart-title")
    public WebElement cartEmptyTitle;


}
