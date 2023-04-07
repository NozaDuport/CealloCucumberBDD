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

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekBtn;

    @FindBy(xpath = "//th")
    public List<WebElement> daysOfWeek;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement monthBtn;

    @FindBy (xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']" )
    public WebElement dataPicker;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventBtn;

}
