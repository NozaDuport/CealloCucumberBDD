package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='new-event-today-view-section']/div")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']/..")
    public WebElement dayBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']/..")
    public WebElement weekBtn;

    @FindBy(xpath = "//th")
    public List<WebElement> daysOfWeek;
}
