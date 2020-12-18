$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Acount.feature");
formatter.feature({
  "name": "Account Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page default login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MobileTest"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User is on NetBanking page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_netbanking_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User login into application with username \"raj\" and password \"4321\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_login_into_application_with_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Cards are displayed \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.cards_are_displayed_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "name": "App Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@userRegistrations"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Validate browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.validate_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Browser launched",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.browser_launched()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate if browser launched",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.validate_if_browser_launched()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Home page default login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@userRegistrations"
    },
    {
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "name": "User is on NetBanking page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_netbanking_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User login into application with username \"raj\" and password \"4321\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_login_into_application_with_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Cards are displayed \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.cards_are_displayed_something(String)"
});
formatter.result({
  "status": "skipped"
});
});