package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TasksPage {

    public TasksPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Tasks']")
    public WebElement linkOfTasks;

    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement newListInputBox;
    @FindBy(xpath = "//input[@id='newListInput']/..//input[@type='button']")
    public WebElement checkmarkButton;

    @FindBy(xpath = "//ul[@class='app-navigation__list']/div/li/a/span")
    public List<WebElement> listOfTasks;

    @FindBy(xpath = "//input[contains(@placeholder,'Add a task to')]")
    public WebElement addTaskInputBox;

    @FindBy(xpath = "//div[@class='task-list']/div/ol/li//span[contains(text(),'Task')]")
    public List<WebElement> tasksInTheList;

    @FindBy(xpath = "//span[@title='Completed']")
    public WebElement completedLink;
    @FindBy(xpath = "//span[@title='Important']")
    public WebElement importantLink;

    @FindBy(xpath = "//ol[@calendar-id='my-tasks']/li//div[@class='title']/span")
    public List<WebElement> listOfCompletedTasks;

    @FindBy(xpath = "//li[@id='collection_current']/div/div")
    public WebElement numberNextToCurrentTab;

}
