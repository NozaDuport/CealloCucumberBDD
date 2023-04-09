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


    @FindBy(xpath = "//span[.='test123']/../following-sibling::span/a[2]/span[1]")
    public WebElement threeDotsOftest123;

    @FindBy(xpath = "(//span[text()='Move or copy'])[2]")
    public WebElement moveOrCopyButton;

    @FindBy(xpath = "//tr[@data-entryname='Talk']")
    public WebElement talkFile;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveToTalkButton;

    @FindBy(xpath = "//a[@href='/index.php/apps/files?dir=//Talk']")
    public WebElement talkButtonMainMenu;

    @FindBy(xpath ="//a[@href='/index.php/apps/files?dir=/Talk/test123']")
    public WebElement test123File;

    @FindBy(xpath = "//*[@id=\"oc-dialog-filepicker-content\"]/span/div[1]")
    public WebElement homeButton;

    @FindBy(xpath = "//button[.='Move']")
    public WebElement moveButton;

    @FindBy(xpath = "//a[@class='icon-home']")
    public WebElement homeButtonToMainMenu;


}
