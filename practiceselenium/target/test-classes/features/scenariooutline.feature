Feature: validate the login with multiple set of data

@regression
Scenario Outline: check the login functionality with valid credentials

Given user has launched the url

When  user has entered valid <email>

And User has entered valid <password>

And   user has clicked on login button

Then  user should login successfully

Examples:
|email							 	 |password|
|jilnosepos@gmail.com	 |12345	 |	
|batidheeru@gmail.com  |12345   |
|batidheeru1@gmail.com |12345   |
|batidheeru2@gmail.com |12345   |
|batidheeru3@gmail.com |12345   |