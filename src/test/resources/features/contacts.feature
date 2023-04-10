Feature:Contacts module functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given User logged in successfully
    And the user is on contacts module page

  @wip1
  Scenario Outline:User can create a new contact
    When the user clicks on new contact button
    And the user clicks on add new property option
    And the user clicks on detailed name option
    And the user enters contact name "<contactName>"
    And the user enters phone number "<phoneNumber>"
    And the user enters email "<email>"
    Then the user should display new created contact

    Examples:List of contacts
      | contactName       | phoneNumber  |  | email               |
      | Arten Vener       | 856-636-8749 |  | art@venere.org      |
      | Valentine Hopkins | 210-812-9597 |  | valentine@gmail.com |
      | Calbares More     | 956-841-7216 |  | calbares@gmail.com  |



  Scenario: User can see all the contacts as a list inside the middle column
  and total number of the contacts near the “All Contacts” tab


  Scenario: User can change the profile picture of any contact with a previously
  uploaded picture by using “Choose from files” option


  Scenario: User can delete any selected contact