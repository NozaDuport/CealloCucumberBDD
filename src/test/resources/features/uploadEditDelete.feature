Feature: User should be able to upload, create, move, edit and delete a file.

  Background:
    Given User logged in successfully

   @smoke @CEA10-374 @wip
  Scenario: User should be able to create a new file.
    When user clicks plus button
    And clicks New folder
    And types "test123" of the folder and hits enter
    Then file gets created

   @CEA10-375 @wip
    Scenario: User should be able to Move or Copy a file
    When user clicks three dots of a file
    And clicks Move of Copy
    And chooses Talk file and clicks Move to Talk button
    Then file is moved to Talk file

   @CEA10-376 @wip
  Scenario: User should be able to delete any file.
    When user clicks three dots of a file
    And clicks delete button
    Then file gets deleted

   @CEA10-377 @wip
  Scenario: User should be able to see total number of files and folders
    Then user can see total number of files and folders