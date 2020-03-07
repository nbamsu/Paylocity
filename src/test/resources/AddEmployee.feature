Feature: add Employee

  Background:
    * user enter username "testUser" and password "Test1234"
    * user click login button
    * user have to validate homepage header

  Scenario: Add Employee no Discount

    * user click Add Employee button
    * user enter employee details
    * First Name does not begin with “A” or “a”
    * user click save button
    * user validate created employee in the table
    * user validate benefits costs are correct

  Scenario: Add employee with discount
    * user click Add Employee button
    * user enter employee details
    * First Name begins with “A” or “a”
    * user click save button
    * user validate created employee in the table
    * the employee has a 10% discount
    * user validate benefits costs are correct

  Scenario Outline: Edit Employee

    * user click the button Edit
    * user can edit employee details "<First Name>" "<Last Name>" "<Dependants>"
    * user validate changed details in table
    Examples:
      | First Name | Last Name | Dependants |
      | Aaron      | Travis    | 3          |
      | Rose       | Gal       | 2          |
      | Santa      | Moroz     | 1          |

  Scenario: Delete Employee

  * I am on the Benefits Dashboard page
  * user click delete button
  * the user validate employee deletegit status

