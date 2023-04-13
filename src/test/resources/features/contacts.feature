@adem
  Feature:Contacts module functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given User logged in successfully
    And the user is on contacts module page


  Scenario Outline:User can create a new contact
    When the user clicks on new contact button
    And the user clicks on add new property option
    And the user clicks on detailed name option
    And the user enters contact name "<contactName>"
    And the user enters phone number "<phoneNumber>"
    And the user enters email "<email>"
    And the user enters address "<address>"
    And the user enters country "<country>"
    Then the user should display new created contact

    Examples:List of contacts
      | contactName       | phoneNumber  |  | email               | address            | country |
      | Arten Vener       | 856-636-8749 |  | art@venere.org      | 6649 N Blue Gum St | England |
      | Valentine Hopkins | 210-812-9597 |  | valentine@gmail.com | 775 W 17th St      | Poland  |
      | Calbares More     | 956-841-7216 |  | calbares@gmail.com  | 56 E7 Morehead St  | Spain   |


  Scenario: User can see all the contacts as a list inside the middle column
             and total number of the contacts near the “All Contacts” tab
    When user clicks all contacts button
    Then the user should display all the contacts inside the middle column and total number of contacts near the contacts tab


  Scenario: User can change the profile picture of any contact with a previously
            uploaded picture by using “Choose from files” option
    When the user clicks on one of the contacts in the contact list
    And the user clicks on change picture button placed on the profile picture
    And the user clicks chose from files file
    And the user clicks on the picture that he wants to change
    And the user clicks on the choose button
    Then user should be displayed new profile picture in the contacts list


  Scenario: User can delete any selected contact
    When the user clicks on one of the contacts in the contact list
    And the user clicks on three dots button left on the page
    And the user clicks on the delete button
    Then the user should delete the selected contact in the contacts list
