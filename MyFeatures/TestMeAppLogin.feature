Feature: My Validations for TestMeApp
Scenario Outline: Login validation for multiple users in TestMeApp
Given TestMeApp is launched
When User clicks on SignIn link
Then User enters valid Username "<uname>"
And User enters valid Password "<pwd>"
Then clicks on Login button
And verifies the login data

Examples:
|uname|pwd|
|lalitha|Password123|
|vnmr1234|vnmr1234|