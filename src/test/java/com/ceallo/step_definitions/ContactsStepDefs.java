package com.ceallo.step_definitions;

import com.ceallo.pages.ContactsPage;
import com.ceallo.pages.HomePage;
import com.ceallo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

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
    public void user_Clicks_All_Contacts_Button() {

        contacts.allContactsButton.click();
    }

    @Then("the user should display all the contacts inside the middle column and total number of contacts near the contacts tab")
    public void the_User_Should_Display_All_The_Contacts_Inside_The_Middle_Column_And_Total_Number_Of_contacts_Near_the_contacts_Tab() {


       List<String> allContactsNames= Arrays.asList("Adem","Arten","Valentine","calbares");

        List<WebElement> actualListOfContacts = contacts.allContacts;
        for (WebElement actualListOfContact : actualListOfContacts) {
            if (actualListOfContact.equals(allContactsNames)) {
                Assert.assertEquals(actualListOfContact.getText(), allContactsNames);
            }

        }


        String expectedCount = contacts.contactsCount.getText();

        int actualContactsCount = actualListOfContacts.size();
        int expectedContactsCount = Integer.parseInt(expectedCount);

        System.out.println(actualListOfContacts.size());
        Assert.assertEquals(expectedContactsCount, actualContactsCount);


    }


    // Third Scenario
    @When("the user clicks on one of the contacts in the contact list")
    public void the_user_clicks_on_one_of_the_contacts_in_the_contact_list() {

    }

    @When("the user clicks on change picture button placed on the profile picture")
    public void the_user_clicks_on_change_picture_button_placed_on_the_profile_picture() {

    }

    @When("the user clicks chose from files file")
    public void the_user_clicks_chose_from_files_file() {

    }

    @When("the user clicks on the picture that he wants to change")
    public void the_user_clicks_on_the_picture_that_he_wants_to_change() {

    }

    @Then("user should be displayed new profile picture in the contacts list")
    public void user_should_be_displayed_new_profile_picture_in_the_contacts_list() {

    }

    // fourth scenario
    @When("the user clicks on three dots button left on the page")
    public void the_user_clicks_on_three_dots_button_left_on_the_page() {

    }

    @When("the user clicks on the delete button")
    public void the_user_clicks_on_the_delete_button() {

    }

    @Then("the user should delete the selected contact in the contacts list")
    public void the_user_should_delete_the_selected_contact_in_the_contacts_list() {

    }

}
