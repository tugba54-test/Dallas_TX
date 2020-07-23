$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Story6.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "modify employee qualification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Story6"
    }
  ]
});
formatter.step({
  "name": "admin search employee \"\u003cId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "navigate to Personal Details page and click Qualification",
  "keyword": "And "
});
formatter.step({
  "name": "modified employee \"\u003cskill\u003e\",\"\u003cyearsExperience\u003e\",\"\u003cComments\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Id",
        "skill",
        "yearsExperience",
        "Comments"
      ]
    },
    {
      "cells": [
        "12674",
        "Problem Solving",
        "3",
        "dealing with complaints"
      ]
    },
    {
      "cells": [
        "10518",
        "Friendly",
        "2",
        "thinking differently"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.steps.ModifiedQualificationSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate employee search page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.user_navigate_employee_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "modify employee qualification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Story6"
    }
  ]
});
formatter.step({
  "name": "admin search employee \"12674\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.admin_search_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Personal Details page and click Qualification",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.navigate_to_Personal_Details_page_and_click_Qualification()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "modified employee \"Problem Solving\",\"3\",\"dealing with complaints\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.modified_employee(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "modify employee qualification");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.steps.ModifiedQualificationSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate employee search page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.user_navigate_employee_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "modify employee qualification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Story6"
    }
  ]
});
formatter.step({
  "name": "admin search employee \"10518\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.admin_search_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Personal Details page and click Qualification",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.navigate_to_Personal_Details_page_and_click_Qualification()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "modified employee \"Friendly\",\"2\",\"thinking differently\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.steps.ModifiedEmployeeSkill.modified_employee(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "modify employee qualification");
formatter.after({
  "status": "passed"
});
});