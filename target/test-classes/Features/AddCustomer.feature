#Author: your.vijayviswa95@your.domain.com
@reg
Feature: Add Customer verification
Background:
     Given user launches demo telecom websie
     And user click add customer
     
   Scenario: Add Customer
    When user enter all the details
    And user enter submit button
    Then user customer id generated
    
   @1dl @reg
    Scenario: Add Customer using 1 dim list concept
     When user enter all the details by one dim list concept
      |vijay|kumar|vijayviswa95@gmail.com|create id|9597666445|
     And user enter submit button
     Then user customer id generated
    @1dl @reg
    Scenario: Add Customer using 1 dim  map concept
     When user enter all the details by one dim  map concept
     |fname |vijay|
     |lname | kumar|
     |mail |vijayviswa95@gmail.com|
     |note| create id|
     |call|9597666445|
     And user enter submit button
     Then user customer id generated
    
   Scenario: Add Customer using 2 dim list concept
    When user enter all the details by two dim  list concept
     |vijay|kumar  |vijayviswa95@gmail.com|create id|9597666445|
     |ram  |murugan|jjyfhtd@gmail.com|create id|9597666445|
     |siva |balan  |nvhfggf@gmail.com|create hi|9597666446|
     |kavi |balan  |ngchtdy@gmail.com|create ab|9597666466|
     |bala |kumar  |gcjfju5@gmail.com|create ac|9597666485|
    And user enter submit button
    Then user customer id generated
   
  Scenario: Add Customer using 2 dim map concept
    When user enter all the details by two dim  map concept
     |fname|lname  |mail                  |note      |call|                    
     |vijay|kumar  |vijayviswa95@gmail.com|create id|9597666445|
     |ram  |murugan|jjyfhtd@gmail.com|create id|9597666445|
     |siva |balan  |nvhfggf@gmail.com|create hi|9597666446|
     |kavi |balan  |ngchtdy@gmail.com|create ab|9597666466|
     |bala |kumar  |gcjfju5@gmail.com|create ac|9597666485|
    And user enter submit button
    Then user customer id generated
   
 Scenario Outline:
   When user enter all the details "<fname>","<lname>","<mail>","<note>","<call>" 
   And user enter submit button
   Then user customer id generated  
   
   Examples:
   |fname|lname  |mail                  |note      |call|     
   |vijay|kumar  |vijayviswa95@gmail.com|create id|9597666445|
   |ram  |murugan|jjyfhtd@gmail.com|create id|9597666445|
   |siva |balan  |nvhfggf@gmail.com|create hi|9597666446|
   |kavi |balan  |ngchtdy@gmail.com|create ab|9597666466|
   |bala |kumar  |gcjfju5@gmail.com|create ac|9597666485|