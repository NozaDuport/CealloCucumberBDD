Feature:As a user, I should be able to change profile info settings under the Profile module

  @CEA10-349 @smoke
  Scenario:User can see at least following titles inside personal info under Profile Settings page;
  =>Full name/Email/Phone Number
    Given User logged in successfully
    When User on the profile settings page
    Then User should be able to see fullName, email and phoneNumber

  @CEA10-351 @wip
  Scenario Outline:  User can change "Full name" info under Profile Settings page
    Given User logged in successfully
    When User on the profile settings page
    And user clicks full name input box
    And types "<new name>" into full name input box
    Then user should be able to see "<expected new name>" in the full name input box
    Examples:
      | new name | expected new name |
      | Lionel Messi | Lionel Messi |
      | Alex de Souza | Alex de Souza |
      | Cristiano Ronaldo | Cristiano Ronaldo |
      | Karim Benzema | Karim Benzema |
      | Joaquin O'Keefe | Joaquin O'Keefe |
