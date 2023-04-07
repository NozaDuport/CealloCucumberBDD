Feature: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Background:
    Given User logged in successfully
    And user on the file page
    And user click three dot menu

  Scenario: User can add any file to favorites from its own three dots menu
    When user click add to favorite button
    Then user should see the file on favorite page


  Scenario: User can rename any file from its own three dots menu
    When user click rename button
    Then user should able to write on file name


  Scenario: User can put some comments on any file from the file details menu opened right side
    When user click detail button
    And user click comment button
    Then user should able to write comment input


  Scenario: User can delete the comments made on any file from the the file details menu opened right side
    When user click delete button
    Then user should not see file on all file list




