@CEA10-337
Feature: Ceallo file sorting functionality
  User Story :
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  User can change folder view order by Name
  User can change folder view order by Size
  User can change folder view order by Modified
  User can change the folder view by clicking the toggle-view button at the right corner of all files tab screen
  User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list



  Background: User logging in with correct credentials
    Given User logged in successfully


  @CEA10-404
  Scenario: User can change folder view order by Name
    When User clicks on the Name button
    Then User should see the folder view order by Name

  @CEA10-406
  Scenario: User can change folder view order by Size
    When User clicks on the Size button
    Then User should see folder view order by Size

  @CEA10-407
  Scenario: User can change folder view order by Modified
    When User clicks on the Modified button
    Then User should see folder view order by Modified

  @CEA10-408
  Scenario: User can change the folder view by clicking the
  toggle-view button at the right corner of all files tab screen
    When user clicks on the toggle-view button
    Then user should change the folder view

  @CEA10-409
  Scenario: User can select all the files at once and see the
  total values of all files in the first line when clicked on
  the “select all” checkbox at the left top corner of the list
    When user clicks on select all checkbox
    Then user see total values of all files on first line