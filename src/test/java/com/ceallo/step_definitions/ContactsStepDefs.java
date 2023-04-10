package com.ceallo.step_definitions;

import com.ceallo.pages.ContactsPage;
import com.ceallo.pages.HomePage;
import com.ceallo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactsStepDefs {

    HomePage homePage = new HomePage();
    ContactsPage contacts = new ContactsPage();

    @Given("the user is on contacts module page")
    public void the_user_is_on_contacts_module_page() {

        homePage.contactsModule.click();
        BrowserUtils.sleep(4);
    }

    @When("the user clicks on new contact button")
    public void the_User_clicks_On_new_contact_button() {

        contacts.newContactButton.click();

    }

    // First Scenario
    @And("the user clicks on add new property option")
    public void the_User_Clicks_On_Add_New_Property_Option() {
        contacts.addNewProperty.click();

    }

    @And("the user clicks on detailed name option")
    public void the_User_Clicks_On_detailed_Name_Option() {
        contacts.detailedNameOption.click();


    }
    @When("the user enters contact name {string}")
    public void the_user_enters_contact_name(String contactName) {
        contacts.name.sendKeys(contactName);
        BrowserUtils.sleep(3);

    }
    @When("the user enters phone number {string}")
    public void the_user_enters_phone_number(String phoneNumber) {

        contacts.phoneBox.sendKeys(phoneNumber);
        BrowserUtils.sleep(3);
    }

    @When("the user enters email {string}")
    public void the_user_enters_email(String email) {

        contacts.emailBox.sendKeys(email);
        BrowserUtils.sleep(3);

    }

    @And("the user enters address {string}")
    public void the_User_Enters_Address(String address) {
        contacts.addressBox.sendKeys(address);
        BrowserUtils.sleep(3);
    }

    @And("the user enters country {string}")
    public void the_User_Enters_Country(String country) {
        contacts.countryBox.sendKeys(country);
        BrowserUtils.sleep(3);
    }

    @Then("the user should display new created contact")
    public void the_user_should_display_new_created_contact() {
        Assert.assertTrue(contacts.contactCheck.isDisplayed());

    }

    // Second Scenario
    @When("user clicks all contacts button")
    public void userClicksAllContactsButton() {
    }

    @Then("the user should display all the contacts near the contacts tab")
    public void theUserShouldDisplayAllTheContactsNearTheContactsTab() {
    }


}
