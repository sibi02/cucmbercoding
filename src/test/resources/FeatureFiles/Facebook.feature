Feature: To validate login funtionality of facebook
@smoke
Scenario: Validate with username and password in login page
Given The user should launch the chrome browser
When The user should type the url
And The user should maximixe the window
And The user should type the username and password 
Then The user should close the browser

@sanity
Scenario Outline: Validate with username and password in login page
Given The user should launch the chrome browser
When The user should type the url
And The user should maximixe the window
And The user should type the username"<user>" and password "<pass>"
Then The user should close the browser

Examples:
	|user|pass|
	|Kannan|Vicky|
	|Java|Java@123|