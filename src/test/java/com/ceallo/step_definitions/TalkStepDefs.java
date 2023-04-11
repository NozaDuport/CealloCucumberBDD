package com.ceallo.step_definitions;

import com.ceallo.pages.TalkPage;
import com.ceallo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TalkStepDefs {

    TalkPage talkPage = new TalkPage();

    Faker faker = new Faker();

    @When("User goes Talk page")
    public void user_goes_talk_page() {
        talkPage.talkModule_Btn.click();
    }

    @When("User clicks on plus icon")
    public void user_clicks_on_plus_icon() {
        talkPage.createNewConversation_PlusBtn.click();
    }

    @When("User types conversation name")
    public void user_types_conversation_name() {
        String groupName = faker.animal().name().toString() + "Group";
        talkPage.conversationName_InputBox.sendKeys(groupName);
    }

    @When("User clicks on Add participants button")
    public void user_clicks_on_Add_participants_button() {
        talkPage.addParticipants_Btn.click();
    }

    @When("User choose users to add as participants")
    public void user_choose_users_to_add_as_participants() {
        talkPage.addEmployee1AsParicipant.click();
        talkPage.addEmployee10AsParicipant.click();
    }

    @When("User clicks Create conversation button")
    public void user_clicks_Create_conversation_button() {
        talkPage.createConversation_Btn.click();
    }

    @Then("User sees You created the conversation text displayed")
    public void user_sees_You_created_the_conversation_text_displayed() {
        Assert.assertTrue(talkPage.youCreatedTheConversation_Text.isDisplayed());
    }

}
