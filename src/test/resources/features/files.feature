@alev
Feature: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Background:
    Given User logged in successfully
    And user on the file page
    And user click three dot menu

@CEA10-365
  Scenario: User can add any file to favorites from its own three dots menu
    When user click add to favorite button
    Then user should see the file on favorite page

@CEA10-366
  Scenario: User can rename any file from its own three dots menu
    When user click rename button
    Then user should able to write on file name

@CEA10-367
  Scenario: User can put some comments on any file from the file details menu opened right side
    When user click detail button
    And user click comment button
    And user write "Well done" to comment input
    Then user should able to see  "Well done" comment on the comments

@CEA10-368
  Scenario: User can delete the comments made on any file from the the file details menu opened right side
    When user click detail button
    And user click comment button
    And user click delete button at right side to comment
    Then user should not see "Well done"  on  comment's list




