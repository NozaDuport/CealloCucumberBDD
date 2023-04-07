package com.ceallo.step_definitions;

import com.ceallo.pages.BasePage;
import com.ceallo.pages.CalendarPage;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarStepDefs {
    BasePage basePage = new BasePage();
    CalendarPage calendarPage = new CalendarPage();

    //First Scenario
    @When("User navigates to calendar icon on the top")
    public void userNavigatesToCalendarIconOnTheTop() {
        basePage.calendarIcon.click();
    }

    @And("User navigates to dropdown menu on the left upper corner")
    public void userNavigatesToDropdownMenuOnTheLeftUpperCorner() {
        calendarPage.dropDownMenu.click();
    }

    @And("User chooses Daily view from dropdown menu")
    public void userChoosesDailyViewFromDropdownMenu() {
        calendarPage.dayBtn.click();
    }

    @Then("Daily calendar view should be displayed")
    public void dailyCalendarViewShouldBeDisplayed() {
        String expectedTitle = Driver.getDriver().getTitle();
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM YYYY");
        String currentDate = date.format(formatter) + " - Calendar - Ceallo - QA";
        System.out.println(currentDate);
        System.out.println(expectedTitle);
        Assert.assertEquals(expectedTitle, currentDate);
    }

    //Second scenario
    @When("User chooses Weekly view from dropdown menu")
    public void userChoosesWeeklyViewFromDropdownMenu() {
        calendarPage.dropDownMenu.click();
        calendarPage.weekBtn.click();
    }

    @Then("Weekly calendar view should be displayed")
    public void calendarShouldBeDisplayed() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E d/M/YYYY");
        String currentDate = date.format(formatter);
        if (currentDate.contains("Mon")) {
            String monday = calendarPage.daysOfWeek.get(1).getText();
            System.out.println(currentDate);
            System.out.println(monday);
            Assert.assertEquals(currentDate, monday);
        } else if (currentDate.contains("Tue")) {
            String tuesday = calendarPage.daysOfWeek.get(2).getText();
            System.out.println(currentDate);
            System.out.println(tuesday);
            Assert.assertEquals(currentDate, tuesday);
        } else if (currentDate.contains("Wed")) {
        String wednesday = calendarPage.daysOfWeek.get(3).getText();
        System.out.println(currentDate);
        System.out.println(wednesday);
        Assert.assertEquals(currentDate, wednesday);
        } else if (currentDate.contains("Thu")) {
            String thursday = calendarPage.daysOfWeek.get(4).getText();
            System.out.println(currentDate);
            System.out.println(thursday);
            Assert.assertEquals(currentDate, thursday);
        } else if (currentDate.contains("Fri")) {
            String friday = calendarPage.daysOfWeek.get(5).getText();
            System.out.println(currentDate);
            System.out.println(friday);
            Assert.assertEquals(currentDate, friday);
        } else if (currentDate.contains("Sat")) {
            String saturday = calendarPage.daysOfWeek.get(6).getText();
            System.out.println(currentDate);
            System.out.println(saturday);
            Assert.assertEquals(currentDate, saturday);
        } else if (currentDate.contains("Sun")) {
            String sunday = calendarPage.daysOfWeek.get(7).getText();
            System.out.println(currentDate);
            System.out.println(sunday);
            Assert.assertEquals(currentDate, sunday);
    }else {
            System.out.println("Test failed");
        }
    }

    //Third scenario
    @When("User chooses Monthly view from dropdown menu")
    public void userChoosesMonthlyViewFromDropdownMenu() {
        calendarPage.dropDownMenu.click();
        calendarPage.monthBtn.click();
    }
    @Then("Monthly calendar view should be displayed")
    public void monthlyCalendarViewShouldBeDisplayed() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM YYYY");
        String currentDate = date.format(formatter);
        String expectedMonth = calendarPage.dataPicker.getText();
        System.out.println(currentDate);
        System.out.println(expectedMonth);
        Assert.assertEquals(currentDate, expectedMonth);
    }

    //Fourth scenario
    @When("User clicks on New event button under the Calendar module")
    public void userClicksOnNewEventButtonUnderTheCalendarModule() {
    }

    @And("User saves an event in the calendar")
    public void userSavesAnEventInTheCalendar() {
    }

    @Then("User should see it on the related day through the Monthly Calendar view")
    public void userShouldSeeItOnTheRelatedDayThroughTheMonthlyCalendarView() {
    }
}
