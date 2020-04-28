Feature: Coursera Login 

Scenario: Negative test validate Login

Given WebDriver is initialized

When Navigate to url
And Click login button
And Enter Credentials "email" and "password"
And Click Submit Button

Then Login refused
