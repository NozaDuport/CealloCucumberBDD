Feature: User should be able to upload, create, move, edit and delete a file.

  Background:
    Given User logged in successfully

  @wip2 @smoke @CEA10-344
  Scenario: User should be able to upload a file.
    When user clicks plus button
    And clicks New folder
    And types "test123" of the folder and hits enter
    Then file gets created

  @wip2 @CEA10-344
    Scenario: User should be able to Move or Copy a fie
    When user clicks three dots of a file
    And clicks Move of Copy
    And chooses Talk file and clicks Move to Talk button
    Then file is moved to Talk file
