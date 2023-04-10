package com.ceallo.step_definitions;

import com.ceallo.pages.StatusPopup;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StatusStepDefs {

    StatusPopup statusPopup = new StatusPopup();

    //1st-Scenario----------------------------------------------------------------

    @When("click on user avatar")
    public void clickOnUserAvatar() {
        statusPopup.userAvatar.click();
    }

    @Then("customer sees the online status")
    public void customerSeesTheOnlineStatus() {
        assertTrue(statusPopup.statusButton.isDisplayed());
    }


    //2nd-Scenario----------------------------------------------------------------

    @When("click on status icon")
    public void click_on_status_icon() {
        //click on avatar and then see if the status is displayed
        statusPopup.userAvatar.click();
        //click on status and open status popup
        statusPopup.statusButton.click();
    }

    @And("change the status to {string}")
    public void changeTheStatusTo(String statusOption) {

        //choose one of the available status option
        WebElement status = Driver.getDriver().findElement(By.cssSelector("label[class$='icon-user-status-"+statusOption+"']"));
        BrowserUtils.clickWithJS(status);
    }

    @When("close the status customization popup")
    public void close_the_status_customization_popup() {
        //close the status popup
        statusPopup.popupCloseButton.click();
    }

    @Then("choose {string} option must be visible on status")
    public void chooseOptionMustBeVisibleOnStatus(String statusOption) {

        //check if the chosen status is displayed on status menu
        statusPopup.userAvatar.click();
        statusPopup.statusButton.click();
        WebElement status = Driver.getDriver().findElement(By.cssSelector("label[class$='icon-user-status-"+statusOption+"']"));
        assertTrue(status.isDisplayed());

    }

    //3rd-Scenario----------------------------------------------------------------

    @And("change the status message to {string}")
    public void changeTheStatusMessageTo(String statusMessage) {

        for (WebElement eachElement : statusPopup.defaultStatusMessage) {

            //get the eachElement Text
            String eachElementText = null;
            try {
                eachElementText = eachElement.getText();
            } catch (StaleElementReferenceException e) {
            }

            //select the statusMessage example and verify if it is selected corrected
            if (eachElementText.contains(statusMessage)) {
                BrowserUtils.clickWithJS(eachElement);
                BrowserUtils.clickWithJS(statusPopup.buttonSetStatusMessage);

                BrowserUtils.waitForClickablility(statusPopup.userAvatar, 5);
                //click on avatar and then see if the status is displayed
                statusPopup.userAvatar.click();

                //get the current status from status bar
                String currentStatus = statusPopup.statusButton.getText().substring(3);

                //verify if the selected status message appears on status bar
                assertTrue(eachElementText.contains(currentStatus));
                break;

            }

        }

    }






}
