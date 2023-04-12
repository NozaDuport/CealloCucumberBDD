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

    // scenario 1
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

    @FindBy(xpath = "(//input[@type='text'])[21]")
    public WebElement countryBox;


    @FindBy(id = "contact-fullname")
    public WebElement contactCheck;

    // scenario 2
    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactsButton;


    @FindBy(xpath = "(//div[@class='app-navigation-entry__utils'])[1]")
    public WebElement contactsCount;


    @FindBy(xpath = "(//div[@class='vue-recycle-scroller__item-view'])")
    public List<WebElement> allContacts;

    //scenario 3
    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement changePictureButton;

    @FindBy(xpath = "//span[.='Choose from files']")
    public WebElement choseFromFileButton;

    @FindBy(xpath = "//span[contains(text(),'Arten.jpg')]")
    public WebElement choseAnyPicture;

    @FindBy(css = "button[class='primary']")
    public WebElement chooseButton;

    @FindBy(xpath = "//div[@class='contact-header-avatar']")
    public WebElement profileImage;

    // scenario 4
    @FindBy(xpath = "//div[@class='contact-header__actions']")
    public WebElement threeDotsIcon;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteButton;

    @FindBy(css = ".empty-content__title")
    public WebElement noContactSelectedMessage;






}
