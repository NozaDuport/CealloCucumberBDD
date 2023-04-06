package com.ceallo.step_definitions;

import com.ceallo.pages.BasePage;
import com.ceallo.pages.CalendarPage;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarStepDefs {
    BasePage basePage = new BasePage();
    CalendarPage calendarPage = new CalendarPage();
    @When("User navigates to calendar toplink")
    public void user_navigates_to_calendar_toplink() {
        basePage.calendarIcon.click();
    }
    @Then("Daily calendar view should be displayed")
    public void daily_calendar_view_should_be_displayed() {
        String expectedTitle = Driver.getDriver().getTitle();
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM YYYY");
        String currentDate = date.format(formatter) + " - Calendar - Ceallo - QA";
        System.out.println(currentDate);
        calendarPage.dropDownMenu.click();
        calendarPage.dayBtn.click();
        System.out.println(expectedTitle);
        Assert.assertEquals(expectedTitle, currentDate);
    }
}
