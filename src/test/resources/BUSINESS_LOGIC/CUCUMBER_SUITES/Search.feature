Feature: Login feature
Background: user is successfully logged in
When user opens "Chrome" browser and exe "C:\\Project1\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user clicks on login button

@SmokeTest
Scenario: Search functionality with valid input
When user clicks on branches
When user select "INDIA" as country
When user select "Andhra Pradesh" as state
When user select "Hyderabad" as city
When user clicks on Search button
Then application shows listed branches from "Hyderabad" city