package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage {
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // new contact button
    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public WebElement addNewProperty;

    @FindBy(xpath = "//div[@title='Detailed name']")
    public WebElement detailedNameOption;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement name;

    @FindBy(xpath = "(//input[@inputmode='tel'])[1]")
    public WebElement phoneBox;

    @FindBy(css = "input[inputmode='email']")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@type='text'])[16]")
    public WebElement addressBox;

    @FindBy(xpath = "//div[@class='property-masonry']//div[3]//input[1]")
    public WebElement postcodeBox;

    @FindBy(xpath = "(//input[@type='text'])[14]")
    public WebElement cityBox;

    @FindBy(xpath = "(//input[@type='text'])[15]")
    public WebElement stateBox;

    @FindBy(xpath = "(//input[@type='text'])[21]")
    public WebElement countryBox;


    @FindBy(id = "contact-fullname")
    public WebElement contactCheck;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactsButton;


    @FindBy(xpath = "(//div[@class='app-navigation-entry__utils'])[1]")
    public WebElement contactsCount;


    @FindBy(xpath = "(//div[@class='vue-recycle-scroller__item-view'])")
    public List<WebElement> allContacts;



}
