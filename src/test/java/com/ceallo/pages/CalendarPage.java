package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='new-event-today-view-section']/div")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']/..")
    public WebElement dayBtn;
}
