#Author: your.email@your.domain.com
@regression
Feature: Add Tariff Plan
 Background:
    Given user enter telecom website
    And click add tariff plan
@reg @1dl
  Scenario: add tariff plan using 1 dim concept
    When user enter all Fields using one dim list concept
     |10000|200|100|200|12|20|3|
    And click Submit button
    Then navigate to congratulation page
   @1dl 
  Scenario: add tariff plan using 1 map concept
    When user enter all Fields using one dim map concept
     |rental|10000|
     |flocal|200|
     |fintmin|100|
     |fsms|200|
     |lperm|12|
     |intperm|20|
     |smsp|3|
    And click Submit button
    Then navigate to congratulation page
 
 Scenario Outline:
     # When user enter all Fields"<rental>","<flocal>","<fintmin>","<fsms>","<lperm>","<intperm>","<smsp>"
     # And click Submit button
     # Then navigate to congratulation page
      
 #Examples:
    # |rental|flocal|fintmin|fsms|lperm|intperm|smsp|  
    # |10000 |200   |100    |200 |12    |20      |3|
    # |14000 |100   |200    |900 |17    |22      |7|
    # |23000 |2300  |150    |240 |13    |25      |6|