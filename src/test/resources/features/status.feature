@wip
Feature: As a user, I should be able to change my online status and set a status message

  Background: Logging in to Ceallo dashboard and navigating to the profile settings
    Given User logged in successfully
    And click on user avatar

  Scenario: User can view Online Status
    Then customer sees the online status

   @smoke
  Scenario Template: User can change Online Status
    And change the status to "<status>"
    And close the status customization popup
    Then choose "<status>" option must be visible on status
    Examples:
      | status    |
      | online    |
      | away      |
      | invisible |
      | dnd       |


  Scenario Template: User can set a status message from any default options
    And change the status message to "<statusMessage>"
    Examples:
      | statusMessage    |
      | In a meeting     |
      | Commuting        |
      | Working remotely |
      | Out sick         |
      | Vacationing      |


  Scenario:User can set a custom status message with also using any emoji option provided
    And types a custom status message and chooses a random emoji
    Then sets status message, custom message appears on status icon


  Scenario:User can clear status message or set a time to clear the message automatically
    When user click on clearStatusButton to clear button
    And set a time to clear message

