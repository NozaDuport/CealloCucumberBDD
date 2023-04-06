Feature:Contacts module functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given User logged in successfully
    And the user is on the contacts module page

  Scenario Outline:User can create a new contact
    When the user clicks on new contact button
    And the user enters phone number "<phoneNumber>"
    And the user enters email "<email>"
    And the user enters address "<address>"
    And the user enters postal code "<postalCode>"
    And the user enters city "<city>"
    And the user enters state "<state>"
    And the user enters country "<country>"
    Then the user should display new created contact

    Examples:List of contacts
      | phoneNumber  | email               | address             | postalCode | city      | state | country  |
      | 856-636-8749 | art@venere.org      | 6649 N Blue Gum St  | 8014       | Liverpool | EN    | England  |
      | 210-812-9597 | valentine@gmail.com | 6649 N 775 17th st  | 78203      | Lisbon    | PR    | Portugal |
      | 956-841-7216 | calbares@gmail.com  | 56 Eth 1st moris st | 34256      | Barcelona | SPN   | Spain    |

    Scenario: User can see all the contacts as a list inside the middle column
              and total number of the contacts near the “All Contacts” tab



    Scenario: User can change the profile picture of any contact with a previously
              uploaded picture by using “Choose from files” option


    Scenario: User can delete any selected contact