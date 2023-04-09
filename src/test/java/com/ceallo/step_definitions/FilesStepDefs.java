package com.ceallo.step_definitions;

import com.ceallo.pages.FilesPage;
import com.ceallo.pages.HomePage;
import com.ceallo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;


public class FilesStepDefs {

    HomePage homePage = new HomePage();
    FilesPage filesPage = new FilesPage();

    @Given("user on the file page")
    public void user_on_the_file_page() {
        homePage.filesButton.click();

    }

    @Given("user click three dot menu")
    public void user_click_three_dot_menu() {
        filesPage.threeDotButton.click();
        BrowserUtils.sleep(5);

    }

    @When("user click add to favorite button")
    public void user_click_add_to_favorite_button() {
        filesPage.addFavoriteButton.click();
        BrowserUtils.sleep(5);



    }

    @Then("user should see the file on favorite page")
    public void user_should_see_the_file_on_favorite_page() {
        filesPage.favorites.click();
        BrowserUtils.sleep(10);
       List<WebElement> favoriList=filesPage.favoriFilesList;
        Assert.assertTrue(favoriList.size()>=2);


    }


    @When("user click rename button")
    public void user_click_rename_button() {
        filesPage.renameButton.click();

    }

    @Then("user should able to write on file name")
    public void user_should_able_to_write_on_file_name() {
        Assert.assertTrue(filesPage.threeDotButton.isEnabled());

    }


    @When("user click detail button")
    public void user_click_detail_button() {
        filesPage.detailButton.click();

    }

    @When("user click comment button")
    public void user_click_comment_button() {
        filesPage.commentButton.click();
        BrowserUtils.sleep(5);


    }


    @When("user write {string} to comment input")
    public void user_write_to_comment_input(String string) {
        filesPage.commentInput.sendKeys(string, Keys.ENTER);
        BrowserUtils.sleep(10);

    }
    @Then("user should able to see  {string} comment on the comments")
    public void user_should_able_to_see_comment_on_the_comments(String string) {
        String addedCommentText = filesPage.addedComment.getText();

        Assert.assertEquals(string,addedCommentText);
    }


    @When("user click delete button at right side to comment")
    public void user_click_delete_button_at_right_side_to_comment() {
        filesPage.threeDotDetailPage.click();
        BrowserUtils.sleep(3);
        filesPage.deleteCommentButton.click();


    }
    @Then("user should not see {string}  on  comment's list")
    public void user_should_not_see_on_comment_s_list(String string) {

        System.out.println("filesPage.addedComment.getText() = " + filesPage.addedComment.getText());
        Assert.assertFalse(string.contains( filesPage.addedComment.getText()));




    }




}
