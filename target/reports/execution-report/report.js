$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CalculatorFeatures/calcTest.feature");
formatter.feature({
  "name": "Calc test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "E2E test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Android"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I see calculator opened",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorPageSteps.I_see_calculator_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that SUM of \u00272\u0027 and \u00273\u0027 equals to \u00275\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorPageSteps.I_verify_sum(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/CalculatorFeatures/calcTestFailed.feature");
formatter.feature({
  "name": "Calc test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "E2E test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Android"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I see calculator opened",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorPageSteps.I_see_calculator_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that SUM of \u00272\u0027 and \u00273\u0027 equals to \u00276\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorPageSteps.I_verify_sum(String,String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Sum of 2 and 3 should be equal to 6\nExpected: is \"6\"\n     but: was \"5\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat stepdefinitions.CalculatorPageSteps.I_verify_sum(CalculatorPageSteps.java:21)\r\n\tat ✽.I verify that SUM of \u00272\u0027 and \u00273\u0027 equals to \u00276\u0027(file:src/test/resources/features/CalculatorFeatures/calcTestFailed.feature:6)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/CalculatorFeatures/calcTestZ.feature");
formatter.feature({
  "name": "Calc test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "E2E test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Android"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I see calculator opened",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorPageSteps.I_see_calculator_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that SUM of \u00275\u0027 and \u00273\u0027 equals to \u00278\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorPageSteps.I_verify_sum(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});