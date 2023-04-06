package com.ceallo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefs {
    @Given("User is already on dashboard")
    public void user_is_already_on_dashboard() {
        System.out.println("user is on dash");
    }
    @When("the user clicks on the new contact button")
    public void the_user_clicks_on_the_new_contact_button() {
        System.out.println("user is on dash");
    }
    @When("the user enters phone number {string}")
    public void the_user_enters_phone_number(String string) {
        System.out.println("user is on dash");
    }
    @When("the user enters email {string}")
    public void the_user_enters_email(String string) {
        System.out.println("user is on dash");
    }
    @When("the user enters address {string}")
    public void the_user_enters_address(String string) {
        System.out.println("user is on dash");
    }
    @When("the user enters postal code {string}")
    public void the_user_enters_postal_code(String string) {
        System.out.println("user is on dash");
    }
    @When("the user enters city {string}")
    public void the_user_enters_city(String string) {
        System.out.println("user is on dash");
    }
    @When("the user enters state {string}")
    public void the_user_enters_state(String string) {
        System.out.println("user is on dash");
    }
    @When("the user enters country {string}")
    public void the_user_enters_country(String string) {
        System.out.println("user is on dash");
    }
    @Then("the user should display new created contact")
    public void the_user_should_display_new_created_contact() {
        System.out.println("user is on dash");
    }
}
