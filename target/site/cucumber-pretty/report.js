$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/ShoppingSite.feature");
formatter.feature({
  "name": "Testing some of the use cases for the practice website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Purchase printed dress",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I am on the automation practice online shop site",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingSiteStep.onShoppingSite()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.ShoppingSiteStep.onShoppingSite(ShoppingSiteStep.java:28)\r\n\tat ✽.I am on the automation practice online shop site(file:src/test/java/features/ShoppingSite.feature:5)\r\n",
  "status": "pending"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "I click on casual dresses",
  "keyword": "When "
});
formatter.match({
  "location": "ShoppingSiteStep.i_click_on_casual_dresses()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "I add the printed dress to my cart",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingSiteStep.i_add_the_printed_dress_to_my_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "click on proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingSiteStep.click_on_proceed_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "I can see the printed dress in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSiteStep.i_can_see_the_printed_dress_in_my_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});