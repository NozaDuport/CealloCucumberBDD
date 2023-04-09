Feature: As a user, I should be able to change my online status and set a status message

  Background: Logging in to Ceallo dashboard and navigating to the profile settings

  Scenario: User can view Online Status
    Given User logged in successfully
    When click on user avatar
    Then customer sees the online status

   @smoke
  Scenario Template: User can change Online Status
    Given User logged in successfully
    When click on status icon
    And change the status to "<status>"
    And close the status customization popup
    Then choose "<status>" option must be visible on status
    Examples:
      | status    |
      | away      |
      | invisible |
      | dnd       |

  @wip
  Scenario Template: User can set a status message from any default options
    Given User logged in successfully
    When click on status icon
    And change the status message to "<statusMessage>"
    Examples:
      | statusMessage    |
      | In a meeting     |
      | Commuting        |
      | Working remotely |
      | Out sick         |
      | Vacationing      |


  Scenario:User can set a custom status message with also using any emoji option provided


  Scenario:User can clear status message or set a time to clear the message automatically


