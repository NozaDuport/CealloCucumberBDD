package com.ceallo.step_definitions;

import com.ceallo.pages.UploadEditDeletePage;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UploadEditDeleteStepDefs {

    UploadEditDeletePage uploadEditDeletePage = new UploadEditDeletePage();

    @When("user clicks plus button")
    public void user_clicks_plus_button() {
        // Write code here that turns the phrase above into concrete actions
        uploadEditDeletePage.plusButton.click();

    }
    @When("clicks New folder")
    public void clicks_new_folder() {
        // Write code here that turns the phrase above into concrete actions
        uploadEditDeletePage.newFolderButton.click();

    }
    @When("types {string} of the folder and hits enter")
    public void types_of_the_folder_and_hits_enter(String test123Keyword) {
        // Write code here that turns the phrase above into concrete actions
        WebElement activeElement = Driver.getDriver().switchTo().activeElement();
        activeElement.sendKeys(test123Keyword + Keys.ENTER);
    }
    @Then("file gets created")
    public void file_gets_created() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(uploadEditDeletePage.createdTest123File.isDisplayed());
        //first scenario

    }
}
