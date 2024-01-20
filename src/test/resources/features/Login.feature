Feature: Login viment with credentials

  @smoke
  Scenario: User can successfully login into the viment dashboard with providing correct email and password.
    Given user is on the login page
    When user insert correct email "hasan.mujtaba+21@vimient.com"
    And user insert correct password "Vista!@#135!@#"
    And user click login page
    Then user will successfully login "Login Successfull !"
    And use will click to select the senior
