Feature: My validations on Mercury Tours
Scenario: Login Validations by registered user
Given User has launched the application
Then User enters valid credentials
And user clicks on Submit
Then User verifies the login status

Scenario: Guest User registartion in Mercury Tours
Given User has launched the app of Mercury Tours
Then User clicks on SignUp link
When User enters the valid data in the form
And User clicks on Submit Button available
Then User verifies the registration status
