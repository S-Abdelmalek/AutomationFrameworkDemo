Feature: Coursera Login 

Scenario: Negative test validate Login

Given WebDriver is initialized

When Navigate to url
And Click login button
And Enter Credentials "sara@yahoo.com" and "password5123"
And Click Submit Button

Then Login refused
