package com.ceallo.step_definitions;

import com.ceallo.pages.BasePage;
import com.ceallo.pages.CalendarPage;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
        String expectedTitle = calendarPage.dayTitle.getText();
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E d/M/YYYY");
        String currentDate = date.format(formatter);
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
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", calendarPage.newEventBtn);
    }

    @And("User fills out the event form")
    public void userFillsOutTheEventForm() {
        calendarPage.eventTitle.sendKeys("Meeting with Alina");
    }

    @And("User saves an event in the calendar")
    public void userSavesAnEventInTheCalendar() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", calendarPage.saveBtn);
        BrowserUtils.waitFor(10);
    }

    @Then("User should see it on the related day through the Monthly Calendar view")
    public void userShouldSeeItOnTheRelatedDayThroughTheMonthlyCalendarView() {
        for (WebElement loop : calendarPage.calendarTable) {
            String currentEvent = loop.getText();
            if (currentEvent.contains("Meeting with Alina")) {
                System.out.println(currentEvent);
            Assert.assertTrue(currentEvent.contains("Meeting with Alina"));
            }
        }
    }

    @When("User navigates to specific calendar event")
    public void userNavigatesToSpecificCalendarEvent() {
        BrowserUtils.waitForVisibility(calendarPage.stickyNote.get(0), 50);
        for (WebElement calendarLoop : calendarPage.calendarTable) {
            BrowserUtils.waitForPageToLoad(30);
            String currentEvent = calendarLoop.getText();
            if (currentEvent.contains("Meeting with Alina")){
                calendarPage.stickyNote.get(0).click();
            }
        }
    }

    @And("User clicks on delete button from the dropdown menu inside the sidebar")
    public void userClicksOnDeleteButtonFromTheDropdownMenuInsideTheSidebar() {
        calendarPage.moreBtn.click();
        calendarPage.threeDot.click();
        calendarPage.deleteBtn.click();
    }

    @Then("Event should be removed from the calendar view")
    public void eventShouldBeRemovedFromTheCalendarView() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(10);
        for (WebElement calendarLoop : calendarPage.calendarTable) {
            BrowserUtils.waitForPageToLoad(30);
            String currentEvent = calendarLoop.getText();
            Assert.assertTrue(!currentEvent.contains("Meeting with Alina"));

}}}
