@CEA10-342
Feature:User should be able to create a new task list or a single task
  and add any task to completed and importants tasks list.
  Acceptance Criteria:
    User can create a new list of tasks
    User can create a new task
    User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    User can see the number of all uncompleted tasks next to the Current tab

  Background: User logging in with correct credentials and already on the task page
    Given User logged in successfully
    When User click "Tasks" link sign in the header
    Then User should navigate to tasks page

  @CEA10-395
  Scenario: User can create a new list of tasks
    And User click "Add List" link on the left-hand menu
    Then User see "New List" input box and enter "the name of new list"
    And User click checkmark button to save and create a new list of tasks
    Then User should see "the name of new list" in the left-hand menu

  @CEA10-396
  Scenario: User can create a new task
    And User click "A List of Tasks" link on the left-hand menu
    And User see "Add a task to" input box under the header
    And User write "New Task" and push the enter to add new task
    And User should be able to see "New Task" at the bottom of tasks list

  @CEA10-397
  Scenario: User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    And User click "A List of Tasks" link on the left-hand menu
    And User write "Task" and push the enter to add new task
    And User click on "Checkbox" next to "Task"
    And User click "Completed" link on the left-hand menu
    Then User see "Task" in a strikethrough

  @CEA10-398
  Scenario: User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    And User click "A List of Tasks" link on the left-hand menu
    Then User write "Task" and push the enter to add new task
    And User click on "Star Sign" next to "Task"
    And User click "Important" link on the left-hand menu
    Then User see "Task" in list of important tasks

  @CEA10-400
  Scenario: User can see the number of all uncompleted tasks next to the Current tab
    And User click "A List of Tasks" link on the left-hand menu
    Then User write "Task" and push the enter to add new task
    Then User can see the number of all uncompleted tasks next to the Current tab