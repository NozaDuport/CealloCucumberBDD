package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//li[@class=\" action-delete-container\"]")
    public WebElement deleteButton;

}
