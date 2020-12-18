@userRegistrations
Feature: App Login

Background: 
Given Validate browser
When Browser launched
Then Validate if browser launched

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking page
When User login into application with username "neha" and password "1234"
Then Home page is populated
And Cards are displayed "true"

#@SmokeTest
#Scenario: Home page default login
#Given User is on NetBanking page
#When User login into application with username "raj" and password "4321"
#Then Home page is populated
#And Cards are displayed "false"

@RegTest
Scenario: Home page default login
Given User is on NetBanking page
When User login into application with following details
| neha | 8054426845 | add | empid | neha@g.com |
| name | 805 | add1 | 4556 | neha@g.com |

Then Home page is populated
And Cards are displayed "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking page
When User login into application with username "raj" and password "4321"
Then Home page is populated
And Cards are displayed "false"


@SanityTest
Scenario Outline: Home page default login
Given User is on NetBanking page
When User login in to application with username <Username> and password <Password>
Then Home page is populated
And Cards are displayed "true"

Examples:
|Username | Password |
|User1    | Pass1 |
|User2 | Pass2 |
|User3 | Pass3 |

@WebTest
Scenario: Home page default login
Given User is on NetBanking page
When User login into application with username "raj" and password "4321"
Then Home page is populated
And Cards are displayed "false"


