Feature: Verify login functionality of facebook application

Scenario Outline: Verify using invalid credentials

Given User should be on login page

When User enter username and password

#2D with header
|Username|Password|
|Arun|Arun@123|
|Bala|Bala@123|
|Babu|Babu@123|

And User clicks On login button

Then User gets the Error message

