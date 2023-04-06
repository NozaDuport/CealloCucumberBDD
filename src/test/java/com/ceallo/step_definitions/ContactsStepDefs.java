package com.ceallo.step_definitions;

import com.ceallo.pages.ContactsPage;
import com.ceallo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefs {

    HomePage homePage = new HomePage();
    ContactsPage contacts = new ContactsPage();

    @Given("the user is on the contacts module page")
    public void the_user_is_on_the_contacts_module_page() {

        homePage.contactsModule.click();
    }


    @When("the user clicks on new contact button")
    public void the_User_clicks_On_new_contact_button() {
    }

    @When("the user enters phone number {string}")
    public void the_user_enters_phone_number(String string) {
        contacts.phoneBox.sendKeys(string);

    }
    @When("the user enters email {string}")
    public void the_user_enters_email(String string) {
        contacts.emailBox.sendKeys(string);
    }
    @When("the user enters address {string}")
    public void the_user_enters_address(String string) {
        contacts.addressBox.sendKeys(string);
    }
    @When("the user enters postal code {string}")
    public void the_user_enters_postal_code(String string) {

        contacts.postcodeBox.sendKeys(string);
    }
    @When("the user enters city {string}")
    public void the_user_enters_city(String string) {
        contacts.cityBox.sendKeys(string);

    }
    @When("the user enters state {string}")
    public void the_user_enters_state(String string) {

        contacts.stateBox.sendKeys(string);
    }
    @When("the user enters country {string}")
    public void the_user_enters_country(String string) {
        contacts.countryBox.sendKeys(string);

    }
    @Then("the user should display new created contact")
    public void the_user_should_display_new_created_contact() {


    }


}
