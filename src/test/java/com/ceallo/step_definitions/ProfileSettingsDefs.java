package com.ceallo.step_definitions;

import com.ceallo.pages.LoginPage;
import com.ceallo.pages.ProfileSettingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
}
