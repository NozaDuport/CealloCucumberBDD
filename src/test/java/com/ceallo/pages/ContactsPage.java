package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // new contact button
    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(css = "input[inputmode='tel']")
    public WebElement phoneBox;

    @FindBy(css = "input[inputmode='email']")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement addressBox;

    @FindBy(xpath = "//div[@class='property-masonry']//div[3]//input[1]")
    public WebElement postcodeBox;

    @FindBy(xpath = "(//input[@type='text'])[14]")
    public WebElement cityBox;

    @FindBy(xpath = "(//input[@type='text'])[15]")
    public WebElement stateBox;

    @FindBy(xpath = "(//input[@type='text'])[16]")
    public WebElement countryBox;


    @FindBy(id = "contact-fullname")
    public WebElement contactName;


}
