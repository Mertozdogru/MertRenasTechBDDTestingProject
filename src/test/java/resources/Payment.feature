Feature:Test payment functionality
  Background:
    Given The user wants to see payment gateway website
    When The user wants to verify that it is "Mother Elephant With Babies Soft Toy" page
    Then The user wants to verify that the toy price is "Price: $20"
    Then The user wants to verify URL contains "payment-gateway"

@TC1 @Smoke
  Scenario:provide payment information and verify if its successful
    And The user want to buy "5" quantities of toy
    Then The user wants to click on Buy Now button
  And The user fill out the information
    Then The user wants to pay now
    And The user wants to verify message as "Payment successfull!"
@TC2 @Regression
  Scenario Outline:
  And The user want to buy toy as "<quantities>"
   Then The user wants to click on Buy Now button
  And The user fill out the information
  Then The user wants to pay now
   And The user wants to verify message as "Payment successfull!"
    Examples:
     | quantities |
     | 5          |
      | 8          |
      | 9          |
     | 2          |
     | 4          |
