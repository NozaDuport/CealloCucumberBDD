Feature:As a user, I should be able to change profile info settings under the Profile module

  @CEA10-349 @wip @smoke
  Scenario:User can see at least following titles inside personal info under Profile Settings page;
  =>Full name/Email/Phone Number
    Given User logged in successfully
    When User on the profile settings page
    Then User should be able to see fullName, email and phoneNumber


  Scenario:  User can change "Full name" info under Profile Settings page
    Given User logged in successfully
    When User on the profile settings page
