@CEA10-343
Feature: As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event
  under the Calendar module

  Background:
    Given User logged in successfully

    Scenario: Verify that user can display daily calendar view
      When User navigates to calendar toplink
      Then Daily calendar view should be displayed


    Scenario: Verify that user can display weekly calendar view
      Given  User is on the daily calendar page
      When   User navigates to the

    Scenario: User can display monthly calendar view


    Scenario: User can create a new event under the Calendar module and see it on the related day
    through the Monthly Calendar view

    Scenario: User can delete any event through the Monthly Calendar view by clicking on the event
    and then using “more” option
