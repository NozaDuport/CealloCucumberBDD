package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadEditDeletePage {

    public UploadEditDeletePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[@id='uploadprogresswrapper']/preceding-sibling::a")
    public WebElement plusButton;

    @FindBy (xpath = "//a[@data-templatename = 'New folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//span[text()='test123']")
    public WebElement createdTest123File;
    //first scenario

}
