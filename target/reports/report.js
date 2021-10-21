$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariffplan.feature");
formatter.feature({
  "name": "Add Tariff Plan",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
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
  "name": "user enter telecom website",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariff.user_enter_telecom_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click add tariff plan",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.click_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add tariff plan using 1 dim concept",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@reg"
    },
    {
      "name": "@1dl"
    }
  ]
});
formatter.step({
  "name": "user enter all Fields using one dim list concept",
  "rows": [
    {
      "cells": [
        "10000",
        "200",
        "100",
        "200",
        "12",
        "20",
        "3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff.user_enter_all_Fields_using_one_dim_list_concept(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.click_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to congratulation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff.navigate_to_congratulation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});