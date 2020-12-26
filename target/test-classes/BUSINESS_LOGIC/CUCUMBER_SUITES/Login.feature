Feature: Login Feature

Background: user is successfully logged in
When user opens "Chrome" browser and exe "C:\\Project1\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"

@SmokeTest
Scenario: Login functionality for valid username and password
When user enters "Admin" as username
When user enters "Admin" as password
When user clicks on login button
Then user is on the "Admin" main page and get message as Welcome to Admin
