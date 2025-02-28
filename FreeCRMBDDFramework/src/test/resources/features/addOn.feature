

Feature: Check addOn offers

Background: Login into web
 Given user is on login page
 When tilte is name of web
 Then user add "9970264720" and "Saga@123"
 Then user click on login button
 @saga
  Scenario: Check addOn offer
    Given User click on addOn tab and go to spiceMax opttion
    Then check terms and condition
    And user close broser

