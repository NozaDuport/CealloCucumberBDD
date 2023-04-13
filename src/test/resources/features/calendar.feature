  @CEA10-343
Feature: As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event
  under the Calendar module


  Background:
    Given User logged in successfully
    And   User navigates to calendar icon on the top

    @CEA10-358
    Scenario: Verify that user can display daily calendar view
      When  User navigates to calendar icon on the top
      And   User navigates to dropdown menu on the left upper corner
      And   User chooses Daily view from dropdown menu
      Then  Daily calendar view should be displayed
    @CEA10-359
    Scenario: Verify that user can display weekly calendar view
      When  User chooses Weekly view from dropdown menu
      Then  Weekly calendar view should be displayed
    @CEA10-360
    Scenario: Verify user can display monthly calendar view
      When  User chooses Monthly view from dropdown menu
      Then  Monthly calendar view should be displayed
    @CEA10-361
    Scenario: Verify user can create a new event under the Calendar module and see it on the related day
    through the Monthly Calendar view

      When  User clicks on New event button under the Calendar module
      And   User fills out the event form
      And   User saves an event in the calendar
      Then  User should see it on the related day through the Monthly Calendar view

    @CEA10-363
    Scenario: Verify user can delete any event through the Monthly Calendar view by clicking on the event
    and then using “more” option
      Given User chooses Monthly view from dropdown menu
      When  User navigates to specific calendar event
      And   User clicks on delete button from the dropdown menu inside the sidebar
      Then  Event should be removed from the calendar view

