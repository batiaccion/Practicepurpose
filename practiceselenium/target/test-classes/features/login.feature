Feature: validate the login functionality

Background:
Given user has launched the url

@sanity
Scenario: check the login functionality with valid credentials

When  user has entered credentials

And   user has click on login button

Then  user should land to homepage

Scenario: check the login functionality with invalid credentials

When  user has entered credentials

And   user has click on login button

Then  user should land to homepage