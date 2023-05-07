@All
  Feature: Login

    @TestLogin
    Scenario: Login
      Given User is in login page
      When User fill email and password
      And User click masuk button
      Then User verify login result
