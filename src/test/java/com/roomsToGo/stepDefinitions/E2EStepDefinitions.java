package com.roomsToGo.stepDefinitions;

import com.roomsToGo.pages.HotBuysPage;
import com.roomsToGo.pages.LoginPage;
import com.roomsToGo.pages.ShoppingCartPage;
import com.roomsToGo.utility.BrowserUtil;
import com.roomsToGo.utility.ConfigurationReader;
import com.roomsToGo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class E2EStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HotBuysPage hotBuysPage = new HotBuysPage();
    ShoppingCartPage shCartPage= new ShoppingCartPage();

    @Given("user is on roomsToGo web page")
    public void user_is_on_rooms_to_go_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("roomsToGo_url"));

        loginPage.bonusBanner.click();
        loginPage.cookiesBanner.click();


    }

    @Given("user hits the login Link")
    public void user_hits_the_login_link() {
        loginPage.profileIcon.click();
        loginPage.secondLoginLink.click();

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.login();
    }

    @Then("user sees logged in message")
    public void userSeesLoggedInMessage() {

        BrowserUtil.waitForVisibility(loginPage.loggedMessage, 3);
        Assert.assertTrue(loginPage.loggedMessage.isDisplayed());
    }

    @Given("user clicks hot buys banner")
    public void user_clicks_hot_buys_banner() {
        BrowserUtil.waitForClickablility(loginPage.hotBuyBanner, 3);
        loginPage.hotBuyBanner.click();

    }

    @Given("user can see the furniture on sale")
    public void user_can_see_the_furniture_on_sale() {
        BrowserUtil.waitFor(3);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Hot Buy Furniture Sale", actualTitle);
    }

    @Given("user selects the color of the Drew & Jonathan living room set")
    public void user_selects_the_color_of_the_drew_jonathan_living_room_set() {
        hotBuysPage.denimColor.click();

    }

    @Given("user adds the item to cart")
    public void user_adds_the_item_to_cart() {
        hotBuysPage.addToCartButton.click();
    }


    @Then("user can see the cart")
    public void userCanSeeTheCart() {
        hotBuysPage.viewCartButton.click();
        BrowserUtil.waitFor(3);
        Assert.assertEquals("Shopping Cart - Rooms To Go",Driver.getDriver().getTitle());
    }


    @And("user removes the item")
    public void userRemovesTheItem() {
    shCartPage.removeButton.click();
    Assert.assertEquals("There are no items in your cart.\nCONTINUE SHOPPING",shCartPage.cartEmptyTitle.getText());
    }

    @Then("user logs out")
    public void userLogsOut() {
        loginPage.profileIcon.click();
        loginPage.logOutButton.click();
    }


}
