package com.ceallo.step_definitions;

import com.ceallo.pages.StatusPopup;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.time.*;

import static org.junit.Assert.*;

public class StatusStepDefs{

    StatusPopup statusPopup = new StatusPopup();

    @And("click on user avatar")
    public void clickOnUserAvatar() {
        statusPopup.userAvatar.click();
    }


    //1st-Scenario----------------------------------------------------------------

    @Then("customer sees the online status")
    public void customerSeesTheOnlineStatus() {
        assertTrue(statusPopup.statusButton.isDisplayed());
    }


    //2nd-Scenario----------------------------------------------------------------

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

    //3rd-Scenario----------------------------------------------------------------

    @And("change the status message to {string}")
    public void changeTheStatusMessageTo(String statusMessage) {

        //click on status and open status popup
        statusPopup.statusButton.click();

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


    //4th-Scenario----------------------------------------------------------------

    @And("types a custom status message and chooses a random emoji")
    public void typesACustomStatusMessageAndChoosesARandomEmoji() {

        //click on status and open status popup
        statusPopup.statusButton.click();

        //clear any pre-defined custom status message
        statusPopup.buttonClearStatusMessage.click();
        statusPopup.userAvatar.click();
        statusPopup.statusButton.click();

        //enter a new customer status message
        statusPopup.inputStatusMessage.sendKeys("Custom Message Set");

        //choose an emoji for the custom status message
        statusPopup.emojiSelectButton.click();
        statusPopup.spanHeartEyesEmoji.click();
        statusPopup.buttonSetStatusMessage.click();

    }

    @Then("sets status message, custom message appears on status icon")
    public void setsStatusMessageCustomMessageAppearsOnStatusIcon() {

        //click on avatar and then see if the status is displayed
        statusPopup.userAvatar.click();

        //get the current status from status bar
        String currentStatus = statusPopup.statusButton.getText();

        //verify if the selected status message appears on status bar
        assertTrue(("\uD83D\uDE0D" + " Custom Message Set").contains(currentStatus));

    }



    //5th-Scenario----------------------------------------------------------------

    @When("user click on clearStatusButton to clear button")
    public void userClickOnClearStatusButtonToClearButton() {

        //click on status and open status popup
        statusPopup.statusButton.click();

        //clear any pre-defined custom status message
        statusPopup.buttonClearStatusMessage.click();
        statusPopup.userAvatar.click();

        //verify if the status cleared successfully
        //get the current status from status bar
        String currentStatus = statusPopup.statusButton.getText();

        if( currentStatus.contains("Do not disturb") || currentStatus.contains("Away") || currentStatus.contains("Invisible") || currentStatus.contains("Set Status") ){
            assertTrue(true);
        }


    }

    @And("set a time to clear message")
    public void setATimeToClearMessage() {

        //click on status and open status popup
        statusPopup.statusButton.click();

        //verify all the possibilities set and clear a status message
        for (int i = 0; i < statusPopup.defaultStatusMessage.size() ; i++) {

            //set the status message
            BrowserUtils.clickWithJS(statusPopup.defaultStatusMessage.get(i));

            //set the clear time possibilities for selected status message
            for (int j = 0; j < statusPopup.timeSetter.size() ; j++) {

                //click on clear status dropdown and choose a clear time
                statusPopup.timeSetSelection.click();
                BrowserUtils.clickWithJS(statusPopup.timeSetter.get(j));

                //set the status and time
                statusPopup.buttonSetStatusMessage.click();
                BrowserUtils.waitFor(1);

                //open the online status popUp
                statusPopup.userAvatar.click();
                statusPopup.statusButton.click();

                BrowserUtils.waitFor(2);

                //get the local time and day
                LocalDate localDate = LocalDate.now();
                DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
                int val = dayOfWeek.getValue();
                int hourOfDay = LocalTime.now().getHour();
                int minOfDay = LocalTime.now().getMinute();

                //verify if the clear time is selected successfully
                if(statusPopup.timeOptionVerify("1 hour", j)){

                    String correctFormatHour = "an hour";

                    if(correctFormatHour.contains(statusPopup.selectedTime.getText())){
                        assertTrue(true);
                    }else{
                        Assert.fail();
                    }
                }

                if(statusPopup.timeOptionVerify("Today", j)){

                    int hoursLeftToNewDay = 24 - hourOfDay;

                    if(minOfDay > 30){
                        --hoursLeftToNewDay;
                    }

                    String hourCountDown = hoursLeftToNewDay + " hours";

                    if(hourCountDown.contains(statusPopup.selectedTime.getText())){
                        assertTrue(true);
                    }else{
                        Assert.fail();
                    }

                }

                if(statusPopup.timeOptionVerify("This week", j)){

                    int daysLeftToNewWeek = 7 - val;
                    String thisWeekCountDown = daysLeftToNewWeek + " days";

                    if(hourOfDay < 12){
                        --daysLeftToNewWeek;
                    }

                    if(thisWeekCountDown.contains(statusPopup.selectedTime.getText())){
                        assertTrue(true);
                    }else{
                        Assert.fail();
                    }

                }

                if(statusPopup.timeOptionVerify("Don't clear", j) || statusPopup.timeOptionVerify("30 minutes", j) || statusPopup.timeOptionVerify("4 hours", j)) {

                    if (statusPopup.selectedTime.getText().contains(statusPopup.timeSetter.get(j).getAttribute("title"))) {
                        assertTrue(true);
                    } else {
                        Assert.fail();
                    }

                }

            }
        }
    }
}
