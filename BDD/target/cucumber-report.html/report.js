$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/my/training/features/AmazonHomePage.feature");
formatter.feature({
  "name": "Amazon HomePage Functionality Check",
  "description": "",
  "keyword": "Feature"
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
  "name": "I navigate to amazon HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.my.training.stepDefs.BaseClass.i_navigate_to_amazon_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user verifies the adding item to cart functionality.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fgh"
    }
  ]
});
formatter.step({
  "name": "I enter search Term",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.my.training.stepDefs.AmazonPageStepDefinitions.i_enter_search_Term(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select an Item",
  "keyword": "And "
});
formatter.match({
  "location": "com.my.training.stepDefs.AmazonPageStepDefinitions.i_select_an_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I checkout the selected item",
  "keyword": "And "
});
formatter.match({
  "location": "com.my.training.stepDefs.AmazonPageStepDefinitions.i_checkout_the_selected_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the title of the page should be \"Amazon.in : Mobile\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.my.training.stepDefs.AmazonPageStepDefinitions.i_verify_the_title_of_the_page_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});