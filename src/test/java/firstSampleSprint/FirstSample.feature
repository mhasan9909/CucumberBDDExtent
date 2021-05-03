Feature: To validate FB create account funtionality

@Smoke
Scenario: validate create new account tab
Given user in Facebook home page
When  user click on create account tab

@Regression
Scenario: validate sign up
Given user in Facebook home page
When  user click on create account tab
Then user enters first name 
And user enters last name



@Smoke
Scenario: validate sign up
Given user in Facebook home page
When  user click on create account tab
Then user enters first name 
And user enters last name