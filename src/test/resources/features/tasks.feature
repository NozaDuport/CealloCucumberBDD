@CEA10-342
Feature:
  User should be able to create a new task list or a single task
  and add any task to completed and importants tasks list.
  Acceptance Criteria:
    User can create a new list of tasks
    User can create a new task
    User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    User can see the number of all uncompleted tasks next to the Current tab

  Background: User logging in with correct credentials
    Given User logged in successfully

  @TC1
  Scenario: User can create a new list of tasks
    When User click "Tasks" link sign in the header
    Then User should navigate to tasks page
    And User see and click "Add List" button in the right-hand menu
    Then User see "New List" input box and enter "the name of new list"
    And User click checkmark button to save and create a new list of tasks
    Then User should see "the name of new list" in the right-hand menu

