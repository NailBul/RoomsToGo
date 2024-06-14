package com.roomsToGo.pages;


import com.roomsToGo.utility.ConfigurationReader;
import com.roomsToGo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='MuiDialog-container MuiDialog-scrollPaper']//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath="//div[@class='MuiDialog-container MuiDialog-scrollPaper']//input[@id = 'password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[.='LOG IN']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[@class='MuiAlert-message css-1xsto0d']")
    public WebElement loggedMessage;



    @FindBy(xpath=("//div[@class='video-box css-1slilz8']//video"))
    public WebElement hotBuyBanner;

    public void login(){

        String username= System.getenv("username");
        String password=System.getenv("password");


        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }

    public void loginConfig(){

        String username= ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");


        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }




}
