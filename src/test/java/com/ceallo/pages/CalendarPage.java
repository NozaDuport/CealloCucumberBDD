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

    @FindBy(className = "fc-col-header-cell-cushion")
    public WebElement dayTitle;

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

    @FindBy(css = "input[placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(xpath = "//button[normalize-space(text())='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr/td")
    public List<WebElement> calendarTable;

    @FindBy(xpath = "//div[@class='fc-daygrid-event-harness']")
    public List<WebElement> stickyNote;

    @FindBy(xpath = "//button[normalize-space(text())='More']")
    public WebElement moreBtn;

    @FindBy(xpath = "//div[@class='action-item app-sidebar-header__menu']/div/div/button")
    public WebElement threeDot;;

    @FindBy(xpath = "//div[@class='popover__inner']/div/div/ul/li/button")
    public WebElement deleteBtn;


}
