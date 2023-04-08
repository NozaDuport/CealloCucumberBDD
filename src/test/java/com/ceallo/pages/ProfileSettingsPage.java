package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {

    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//label[text()='Full name']")
    public WebElement fullNameTitle;


    @FindBy (xpath = "//label[text()='Email']")
    public WebElement emailTitle;


    @FindBy (xpath = "//label[text()='Phone number']")
    public WebElement phoneNumberTitle;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullNameInputBox;

    @FindBy(xpath = "//label[text()='Phone number']/..//div//span")
    public WebElement phoneNumberPrivateOrPublicList;

    @FindBy(xpath = "//ul//li//span[@class='icon icon-password']")
    public WebElement phoneNumberPrivateSelectButton;

    @FindBy(xpath = "//*[@id=\"localeexample\"]//span[2]")
    public WebElement localTimeOnSettingsPage;





}
