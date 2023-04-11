@CEA10-343
Feature: As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event
  under the Calendar module

  Background:
    Given User logged in successfully
    And   User navigates to calendar icon on the top

    Scenario: Verify that user can display daily calendar view
      When  User navigates to calendar icon on the top
      And   User navigates to dropdown menu on the left upper corner
      And   User chooses Daily view from dropdown menu
      Then  Daily calendar view should be displayed

    Scenario: Verify that user can display weekly calendar view
      When  User chooses Weekly view from dropdown menu
      Then  Weekly calendar view should be displayed

    Scenario: User can display monthly calendar view
      When  User chooses Monthly view from dropdown menu
      Then  Monthly calendar view should be displayed

    Scenario: User can create a new event under the Calendar module and see it on the related day
    through the Monthly Calendar view
      When  User clicks on New event button under the Calendar module
      And   User saves an event in the calendar
      Then  User should see it on the related day through the Monthly Calendar view

    Scenario: User can delete any event through the Monthly Calendar view by clicking on the event
    and then using “more” option
