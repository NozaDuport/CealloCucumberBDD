@CEA10-339
Feature:  As a user, I should be able to create/delete conversation groups
  and chat with other co-workers under Talk Module

  Background: User logging in with correct credentials
    Given User logged in successfully

  @CEA10-370 @smoke
  Scenario: User can create a new group conversation by adding other users
    When User goes Talk page
    And User clicks on plus icon
    And User types conversation name
    And User clicks on Add participants button
    And User choose users to add as participants
    And User clicks Create conversation button
    Then User sees You created the conversation text displayed

  @CEA10-371
  Scenario: User can can see the participants of the conversation
  on the right-hand menu under Participants
    When User goes Talk page
    And User clicks any conversation group
    And User clicks participants tab
    Then User sees participants on right hand menu