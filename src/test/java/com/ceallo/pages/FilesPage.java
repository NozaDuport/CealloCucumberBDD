package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {
    public FilesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@data-action=\"menu\"])[1]")
    public WebElement threeDotButton;

    @FindBy(xpath = "(//li[@class=\" action-favorite-container\"]/a/span)[2]")
    public WebElement addFavoriteButton;

    @FindBy(xpath = "//li[@class=\" action-details-container\"]")
    public WebElement detailButton;

    @FindBy(xpath = "//li[@class=\" action-rename-container\"]")
    public WebElement renameButton;


//    //tbody[@id="fileList"]/tr[@data-type="dir"]/td/a/span/span[.="Talk"]

    @FindBy(xpath = "(//div[@id=\"app-navigation\"]/ul/li)[3]")
    public WebElement favorites;

    @FindBy(xpath = " //a[@data-id=\"commentsTabView\"]")
    public  WebElement commentButton;

    @FindBy(xpath ="//div[@data-placeholder=\"New comment …\"]" )
    public WebElement commentInput;


    @FindBy(xpath = "//li[@class=\"comment\"]")
    public List<WebElement> comments;


    @FindBy(xpath = "(//ul[@class=\"comments\"]/li/div[@class=\"message\"])[1]")
    public WebElement addedComment;



    @FindBy(xpath = "//tbody[@id=\"fileList\"]/tr[@data-type=\"dir\"]/td/a/span/span")

    public List<WebElement> favoriFilesList;

    @FindBy(xpath = "//a[@class =\"menuitem action delete permanent\"]/span[.=\"Delete comment\"]")
    public WebElement deleteCommentButton;

    @FindBy(xpath = "//a[@class =\"action more icon icon-more has-tooltip\"]")
    public WebElement threeDotDetailPage;



}
