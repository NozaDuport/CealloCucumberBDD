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

    @FindBy(xpath = "(//input[@class='property__value'])[1]")
    public WebElement addressBox;

    @FindBy(xpath = "(//input[@class='property__value'])[6]")
    public WebElement postcodeBox;

    @FindBy(xpath = "(//input[@class='property__value'])[7]")
    public WebElement cityBox;

    @FindBy(xpath = "(//input[@class='property__value'])[8]")
    public WebElement stateBox;

    @FindBy(xpath = "(//input[@class='property__value'])[9]")
    public WebElement countryBox;




}
