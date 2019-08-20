Feature: Understanding of tags
@Smoke @Sanity
Scenario: Login validation on flipkart
Given Flipkart application is launched and running
Then Valid Credentials are entered for login
@Regression
Scenario: User access to items in the portal
Given User searching the product with code
Then User able to add it to the cart
@Smoke
Scenario: User access to remove from cart
Given user able to see items count on cart
Then user decides to remove an item
@Sanity
Scenario: User wanted to track the order
Given user has active order
Then user verifies the status of the order
