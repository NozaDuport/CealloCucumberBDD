Feature: User should be able to upload, create, move, edit and delete a file.

  Background:
    Given User logged in successfully

  @wip @smoke @CEA10-344
  Scenario: User should be able to upload a file.
    When user clicks plus button
    And clicks New folder
    And types "test123" of the folder and hits enter
    Then file gets created
