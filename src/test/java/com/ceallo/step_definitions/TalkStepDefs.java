package com.ceallo.step_definitions;

import com.ceallo.pages.TalkPage;
import com.ceallo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        talkPage.conversationName_InputBox.sendKeys(talkPage.conversationName);
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

    @When("User clicks any conversation group")
    public void user_clicks_any_conversation_group() {
        talkPage.conversationTab.click();
    }

    @Then("User clicks participants tab")
    public void User_clicks_participants_tab() {
        talkPage.participantsTab.click();
    }

    @Then("User sees participants on right hand menu")
    public void user_sees_participants_on_right_hand_menu() {
        Assert.assertEquals(talkPage.firstParticipantInParticipantTab.getText(), talkPage.addEmployee1AsParicipant.getText());
    }

    @When("User clicks 3dots and clicks remove participant")
    public void user_clicks_3dots_and_clicks_remove_participant() {
        talkPage.participant3DotsMenu.click();
        talkPage.removeParticipantBtn.click();
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String removeText) {
        removeText = "You removed";
        Assert.assertEquals(talkPage.removeMessage.getText().substring(0, 11), removeText);
    }

    @When("User clicks first conversation icon")
    public void user_clicks_first_conversation_icon() {
        talkPage.conversationIcon.click();
    }


    @When("User types message in message input box")
    public void user_types_message_in_message_input_box() {
        talkPage.messageInputBox.sendKeys("Hello World", Keys.ENTER);
    }

    @Then("User sees message appears in conversation")
    public void user_sees_message_appears_in_conversation() {
        Assert.assertTrue(talkPage.sentMessage.isDisplayed());
    }

    @When("User types conversation name2")
    public void user_types_conversation_name2() {
        talkPage.conversationName_InputBox.sendKeys(talkPage.conversationName2);
    }

    @When("User clicks first conversation 3dots menu")
    public void user_clicks_first_conversation_3dots_menu() throws InterruptedException {
        Thread.sleep(5000);
        talkPage.conversations3DotsMenu.click();
    }

    @When("User clicks on delete conversation button")
    public void user_clicks_on_delete_conversation_button() {
        talkPage.deleteConversationBtn.click();
    }

    @When("User clicks Yes button")
    public void user_clicks_yes_button() {
        talkPage.yesBtn.click();
    }

    @Then("User does not see conversation name on conversations list")
    public void user_does_not_see_conversation_name_on_conversations_list() {

        Assert.assertFalse(talkPage.conversationList.contains(talkPage.firstConversation.getText()));
    }
}
