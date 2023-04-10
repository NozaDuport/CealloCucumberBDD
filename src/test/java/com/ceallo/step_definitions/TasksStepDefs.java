package com.ceallo.step_definitions;

import com.ceallo.pages.TasksPage;
import com.ceallo.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();

    Faker faker = new Faker();
    String tempNameOfNewList = "List_"+ faker.number().randomDigitNotZero()+faker.letterify("???",true);

    @When("User click {string} link sign in the header")
    public void user_click_link_sign_in_the_header(String linkName) {
        if (linkName.equals("Tasks")) {
            tasksPage.linkOfTasks.click();
        }
    }
    @Then("User should navigate to tasks page")
    public void user_should_navigate_to_tasks_page() {
        BrowserUtils.verifyURLContains("tasks");
    }
    @Then("User see and click {string} button in the right-hand menu")
    public void user_see_and_click_button_in_the_right_hand_menu(String buttonName) {
        if (buttonName.equals("Add List")) {
            tasksPage.addListButton.click();
        }
    }
    @Then("User see {string} input box and enter {string}")
    public void user_see_input_box_and_enter(String newListPlaceHolder, String nameOfNewList) {
        nameOfNewList = tempNameOfNewList;
        Assert.assertEquals(tasksPage.newListInputBox.getAttribute("placeholder"),newListPlaceHolder);
        tasksPage.newListInputBox.sendKeys(nameOfNewList);
    }
    @Then("User click checkmark button to save and create a new list of tasks")
    public void user_click_checkmark_button_to_save_and_create_a_new_list_of_tasks() {
        tasksPage.checkmarkButton.click();
    }
    @Then("User should see {string} in the right-hand menu")
    public void user_should_see_in_the_right_hand_menu(String nameOfNewList) {
        nameOfNewList = tempNameOfNewList;
        BrowserUtils.waitFor(2);
        System.out.println("tasksPage.listOfTasks.get(tasksPage.listOfTasks.size()-1).getText() = " + tasksPage.listOfTasks.get(tasksPage.listOfTasks.size() - 1).getText());
        Assert.assertTrue(tasksPage.listOfTasks.get(tasksPage.listOfTasks.size()-1).getText().contains(nameOfNewList));
    }
}
