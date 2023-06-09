package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StatusPopup {

    public StatusPopup(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean timeOptionVerify(String timeOption, int j){
        if(this.timeSetter.get(j).getAttribute("title").equalsIgnoreCase(timeOption)){
            return true;
        }else{
            return false;}
    }


    @FindBy(css = "button[class$='primary']")
    public WebElement buttonSetStatusMessage;

    @FindBy(css = "button[class$='select']")
    public WebElement buttonClearStatusMessage;

    @FindBy(css = "input[maxlength='80']")
    public WebElement inputStatusMessage;

    @FindBy(css = "button[class$='emoji-button']")
    public WebElement emojiSelectButton;

    @FindBy(css = "html > body > div:nth-of-type(10) > div > div:nth-of-type(1) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(2) > div > div > span:nth-of-type(15)")
    public WebElement spanHeartEyesEmoji;

    @FindBy(css = "div[class$='avatardiv-shown']")
    public WebElement userAvatar;

    @FindBy(xpath = "//div[@class='user-status-menu-item']//a")
    public WebElement statusButton;

    @FindBy(xpath = "//div[@class='user-status-menu-item']//a[@class='user-status-menu-item__toggle']")
    public WebElement statusButtonText;

    @FindBy(xpath = "//button[@rel='noreferrer noopener']")
    public WebElement popupCloseButton;

    @FindBy(xpath = "//div[@class='predefined-statuses-list']//div//span[2]")
    public List<WebElement> defaultStatusMessage;

    @FindBy(xpath = "//*[@class=\"name-parts\"]")
    public List<WebElement> timeSetter;

    @FindBy(xpath = "//*[@class=\"multiselect__single\"]")
    public WebElement timeSetSelection;

    @FindBy(xpath = "//div[@class=\"clear-at-select\"]//div//div[2]//span")
    public WebElement selectedTime;


























}
