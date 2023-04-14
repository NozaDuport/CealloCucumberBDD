package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesButton;



    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement contactsModule;

}
