@All
  Feature: Login

    @Test1
    Scenario: Login
      Given User is in login page
      When User fill email and password
      And User click masuk button
      Then User verify login result
