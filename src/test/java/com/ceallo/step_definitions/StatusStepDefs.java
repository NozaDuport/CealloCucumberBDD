package com.ceallo.step_definitions;

import com.ceallo.pages.StatusPopup;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class StatusStepDefs {

    StatusPopup statusPopup = new StatusPopup();


    @When("click on status icon sees the available status options")
    public void click_on_status_icon_sees_the_available_status_options() {
        //click on avatar and then see if the status is displayed
        statusPopup.userAvatar.click();
        assertTrue(statusPopup.statusButton.isDisplayed());
    }

    @And("change the status to {string}")
    public void changeTheStatusTo(String statusOption) {
        //click on status and open status popup
        statusPopup.statusButton.click();

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
}
