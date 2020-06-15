$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Story5.feature");
formatter.feature({
  "name": "As an admin user should be able to add different skills in qualifications",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@story5"
    }
  ]
});
formatter.scenario({
  "name": "add skills in qualification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@story5"
    },
    {
      "name": "@tag1"
    }
  ]
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
  "name": "navigated to qualification page and click add button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.steps.ModifiedQualificationSteps.navigated_to_qualification_page_and_click_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user modified different skills \"User Friendly\" and \"can be work any person\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.steps.ModifiedQualificationSteps.user_modified_different_skills_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: mismatch skill name expected:\u003c[Automation using cucumber tool]\u003e but was:\u003c[User Friendly]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat com.project.steps.ModifiedQualificationSteps.user_modified_different_skills_and(ModifiedQualificationSteps.java:36)\r\n\tat ✽.user modified different skills \"User Friendly\" and \"can be work any person\"(file:///C:/Users/16824/eclipse-workspace2/Dallas_TX/src/test/resources/features/Story5.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "add skills in qualification");
formatter.after({
  "status": "passed"
});
});