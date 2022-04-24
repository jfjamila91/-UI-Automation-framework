$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "login to walmart",
  "description": "",
  "id": "login-to-walmart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "successfully login with valid credential",
  "description": "",
  "id": "login-to-walmart;successfully-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click source Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters email",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters  password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user capture page title",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_the_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_click_source_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_enters_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_enters_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_click_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_capture_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "login to walmart with valid credential",
  "description": "",
  "id": "login-to-walmart;login-to-walmart-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user want to sign into walmart website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user enter \"\u003cemail\u003e\" address and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click sign up button",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-to-walmart;login-to-walmart-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 21,
      "id": "login-to-walmart;login-to-walmart-with-valid-credential;;1"
    },
    {
      "cells": [
        "jannat10@gmail.com",
        "JannatulJamila10"
      ],
      "line": 22,
      "id": "login-to-walmart;login-to-walmart-with-valid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "login to walmart with valid credential",
  "description": "",
  "id": "login-to-walmart;login-to-walmart-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 14,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user want to sign into walmart website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user enter \"jannat10@gmail.com\" address and \"JannatulJamila10\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click sign up button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_want_to_sign_into_walmart_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jannat10@gmail.com",
      "offset": 12
    },
    {
      "val": "JannatulJamila10",
      "offset": 45
    }
  ],
  "location": "StepDefination.user_enter_address_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_click_sign_up_button()"
});
formatter.result({
  "status": "skipped"
});
});