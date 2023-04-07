package com.ceallo.step_definitions;

import com.ceallo.pages.ContactsPage;
import com.ceallo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefs {

    HomePage homePage = new HomePage();
    ContactsPage contacts = new ContactsPage();

    @Given("the user is on contacts module page")
    public void the_user_is_on_contacts_module_page() {
        homePage.contactsModule.click();
    }

    @When("the user clicks on new contact button")
    public void the_User_clicks_On_new_contact_button() {
        contacts.newContactButton.click();
    }

    @When("the user enters phone number {string}")
    public void the_user_enters_phone_number(String phoneNumber) {
        contacts.phoneBox.sendKeys(phoneNumber);
    }

    @When("the user enters email {string}")
    public void the_user_enters_email(String email) {
        contacts.emailBox.sendKeys(email);
    }

    @When("the user enters address {string}")
    public void the_user_enters_address(String address) {
        contacts.addressBox.sendKeys(address);
    }

    @When("the user enters postal code {string}")
    public void the_user_enters_postal_code(String postCode) {

        contacts.postcodeBox.sendKeys(postCode);
    }

    @When("the user enters city {string}")
    public void the_user_enters_city(String city) {
        contacts.cityBox.sendKeys(city);
    }

    @When("the user enters state {string}")
    public void the_user_enters_state(String state) {
        contacts.stateBox.sendKeys(state);
    }

    @When("the user enters country {string}")
    public void the_user_enters_country(String country) {
        contacts.countryBox.sendKeys(country);
    }

    @Then("the user should display new created contact")
    public void the_user_should_display_new_created_contact() {


    }


}
