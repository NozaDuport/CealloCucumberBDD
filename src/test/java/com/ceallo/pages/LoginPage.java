package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage (){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="user")
    public WebElement usernameInput;

    @FindBy (id="password")
    public WebElement passwordInput;

    @FindBy (id="submit-form")
    public WebElement loginBtn;

    @FindBy (xpath = "//div[@id='expand']")
    public WebElement profileMenuButton;

    @FindBy (xpath = "//ul//li[@data-id='settings']")
    public WebElement profileMenuSettingsButton;

}


//Joaquin O'Keefe
//Lionel Messi