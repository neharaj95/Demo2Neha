Feature: Account Login

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking page
When User login into application with username "name" and password "43291"
Then Home page is populated
And Cards are displayed "false"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking page
When User login into application with username "raj" and password "4321"
Then Home page is populated
And Cards are displayed "false"
