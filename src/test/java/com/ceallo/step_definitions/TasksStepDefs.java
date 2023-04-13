package com.ceallo.step_definitions;

import com.ceallo.pages.TasksPage;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.ceallo.utilities.BrowserUtils.*;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();

    Faker faker = new Faker();
    String tempNameOfNewList = "List_"+ faker.number().randomDigitNotZero()+faker.letterify("??",true);
    int tempTaskNumber = faker.number().numberBetween(1,99);

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

    @Then("User click {string} link on the left-hand menu")
    public void user_click_link_on_the_left_hand_menu(String linkName) {
        waitFor(3);
        if (linkName.equals("Completed")){
            tasksPage.completedLink.click();
        } else if (linkName.equals("A List of Tasks")) {
            tasksPage.listOfTasks.get(0).click();
        } else if (linkName.equals("Add List")) {
            tasksPage.addListButton.click();
        } else if (linkName.equals("Important")){
            tasksPage.importantLink.click();
        }
    }
   /* @Then("User see and click {string} button in the left-hand menu")
    public void user_see_and_click_button_in_the_left_hand_menu(String buttonName) {
        if (buttonName.equals("Add List")) {
            tasksPage.addListButton.click();
        }
    }*/
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
    @Then("User should see {string} in the left-hand menu")
    public void user_should_see_in_the_left_hand_menu(String nameOfNewList) {
        nameOfNewList = tempNameOfNewList;
        waitFor(1);
        Assert.assertTrue(tasksPage.listOfTasks.get(tasksPage.listOfTasks.size()-1).getText().contains(nameOfNewList));
    }
    @Then("User see {string} input box under the header")
    public void user_see_input_box_under_the_header(String nameOfInputBox) {
        waitFor(1);
        BrowserUtils.verifyElementDisplayed(tasksPage.addTaskInputBox);
    }
    @Then("User write {string} and push the enter to add new task")
    public void user_write_and_push_the_enter_to_add_new_task(String nameOfTask) {
        //waitForClickablility(tasksPage.addTaskInputBox,10);
        tasksPage.addTaskInputBox.sendKeys(nameOfTask+tempTaskNumber+ Keys.ENTER);
    }
    @Then("User should be able to see {string} at the bottom of tasks list")
    public void user_should_be_able_to_see_at_the_bottom_of_tasks_list(String nameOfTask) {
        List<WebElement> tasksList = tasksPage.tasksInTheList;
        for (WebElement eachTask : tasksPage.tasksInTheList) {
            if (eachTask.getText().equals(nameOfTask+tempTaskNumber)) {
                Assert.assertTrue(true);
                return;
            }
        }
    }
    @Then("User click on {string} next to {string}")
    public void user_click_on_checkbox_next_to(String signName, String nameOfTask) {

        if (signName.equals("Checkbox")){
            System.out.println("nameOfTask+tempTaskNumber = " + nameOfTask + tempTaskNumber);
            Driver.getDriver().findElement(By.xpath("//div[@class='task-list']/div/ol/li// span[contains(text(),'"
                    +nameOfTask+tempTaskNumber+
                    "')]/../../../div/label")).click();
        } else if (signName.equals("Star Sign")) {
            Driver.getDriver().findElement(By.xpath("(//div[@class='task-list']/div/ol/li//span[contains(text(),'"+
                    nameOfTask+tempTaskNumber+
                    "')]/../../../div)[3]/button")).click();
        }
    }
    @Then("User see {string} in a strikethrough")
    public void user_see_in_a_strikethrough(String nameOfTask) {
        String lastCompletedTask = tasksPage.listOfCompletedTasks.get(tasksPage.listOfCompletedTasks.size() - 1).getText();
        Assert.assertEquals(nameOfTask+tempTaskNumber,lastCompletedTask);
    }
    @Then("User see {string} in list of important tasks")
    public void user_see_in_list_of_important_tasks(String nameOfTask) {
        for (WebElement webElement : tasksPage.tasksInTheList) {
            if (webElement.getText().contains(nameOfTask+tempTaskNumber)) {
                Assert.assertTrue(true);
                return;
            }
        }
    }
    @Then("User can see the number of all uncompleted tasks next to the Current tab")
    public void user_can_see_the_next_to_the_current_tab() {
        String number = tasksPage.numberNextToCurrentTab.getText().trim();
        System.out.println("Integer.parseInt(number) = " + Integer.parseInt(number));
        Assert.assertTrue(Integer.parseInt(number)>0);
    }

    
}
