Feature: LogIn to Application

#Background: 
#Given Validate browser
#When Browser launched
#Then Validate if browser launched

@SmokeTest
Scenario: LogIn to Web Application
Given User is on HomePage
When User click on SignIn button
Then User enter email "EmailId" and "Password"
And Click on LogIn button
And Dashboard Page displayed 