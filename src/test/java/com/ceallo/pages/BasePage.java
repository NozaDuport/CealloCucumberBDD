package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendarIcon;

    @FindBy(id = "nextcloud")
    public WebElement cloudBtn;
}

