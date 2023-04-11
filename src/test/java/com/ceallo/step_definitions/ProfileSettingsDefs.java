package com.ceallo.step_definitions;

import com.ceallo.pages.LoginPage;
import com.ceallo.pages.ProfileSettingsPage;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.text.SimpleDateFormat;

public class ProfileSettingsDefs {
    LoginPage loginPage = new LoginPage();
    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @When("User on the profile settings page")
    public void user_on_the_profile_settings_page() {
        loginPage.profileMenuButton.click();
        loginPage.profileMenuSettingsButton.click();

    }

    @Then("User should be able to see fullName, email and phoneNumber")
    public void user_should_be_able_to_see_full_name_email_and_phone_number() {

        Assert.assertTrue(profileSettingsPage.fullNameTitle.isDisplayed());
        Assert.assertTrue(profileSettingsPage.emailTitle.isDisplayed());
        Assert.assertTrue(profileSettingsPage.phoneNumberTitle.isDisplayed());

    }

    @When("user clicks full name input box")
    public void user_clicks_full_name_input_box() {
    profileSettingsPage.fullNameInputBox.click();
    profileSettingsPage.fullNameInputBox.clear();

    }

    @When("types {string} into full name input box")
    public void types_into_full_name_input_box(String string1) {
        profileSettingsPage.fullNameInputBox.sendKeys(string1 + Keys.ENTER);
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().refresh();

    }

    @Then("user should be able to see {string} in the full name input box")
    public void user_should_be_able_to_see_in_the_full_name_input_box(String string2) {
        String actualFullName =profileSettingsPage.fullNameInputBox.getAttribute("value");
        Assert.assertEquals(actualFullName, string2);



    }



    @And("user clicks phone number privacy list")
    public void user_clicks_phone_number_privacy_list() {
        profileSettingsPage.phoneNumberPrivateOrPublicList.click();

    }


    @When("User selects phone number private option")
    public void user_selects_phone_number_private_option() {
        profileSettingsPage.phoneNumberPrivateSelectButton.click();
        BrowserUtils.sleep(3);

    }

    @Then("user should be able to see private icon next to phone number")
    public void user_should_be_able_to_see_private_icon_next_to_phone_number() {

        Assert.assertEquals("icon-federation-menu icon-password",
                profileSettingsPage.phoneNumberPrivateOrPublicList.getAttribute("class"));

    }

    @Then("User should be able to see the current local time under the Local dropdown")
    public void user_should_be_able_to_see_the_current_local_time_under_the_local_dropdown() {

        String timeText = profileSettingsPage.timeElement.getText();

        // Convert the text value to a LocalTime object
        LocalTime pageTime = LocalTime.parse(timeText);

        // Convert the LocalTime object to String
        String pageTimeInStringFormat = pageTime.toString();

        // Get the current time from the local machine
        LocalTime currentTime = LocalTime.now();

        // Create a formatter for the desired time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format the current time using the formatter
        String formattedTime = currentTime.format(formatter);

        BrowserUtils.sleep(2);


        Assert.assertEquals(pageTimeInStringFormat,formattedTime);

    /*

        //if we want to see the results

        System.out.println("pageTimeInStringFormat = " + pageTimeInStringFormat);
        System.out.println("currentTime = " + currentTime);
        System.out.println("formattedTime = " + formattedTime);

      */



    }



}
