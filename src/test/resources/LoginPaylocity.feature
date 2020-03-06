Feature: Paylocity

  Background:
    Given user navigate to webpage


  Scenario Outline: negative
    * user enter username "<userName>" "<password>"
    * user click login button
    * user have to validate error message
    Examples:
      | userName | password |
      | test     | test     |
      | Testuser | Test1234 |
    Scenario:  negative
      * user enter username "testUser" "userter34"
      * user click login button
      * user have to validate error message "The password is incorrect for username testUser"

  Scenario: positive

    * user enter username "testUser" and password "Test1234"
    * user click login button
    * user have to validate homepage header


