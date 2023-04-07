Feature: As a user, I should be able to change my online status and set a status message

  Background: Logging in to Ceallo dashboard and navigating to the profile settings

  Scenario: User can view Online Status
#    When click on user avatar
#    Then customer sees the online status

  @wip
  Scenario Template: User can change Online Status
    Given User logged in successfully
    When click on status icon sees the available status options
    And change the status to "<status>"
    And close the status customization popup
    Then choose "<status>" option must be visible on status
    Examples:
      | status    |
      | away      |
      | invisible |
      | dnd       |

  Scenario:User can set a status message from any default options
#    When click on status icon sees the available status options
#    And change the status to <"status">


  Scenario:User can set a custom status message with also using any emoji option provided


  Scenario:User can clear status message or set a time to clear the message automatically


