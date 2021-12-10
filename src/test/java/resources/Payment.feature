Feature:Test payment functionality

  Background:
    Given The user wants to see payment gateway website

  @TC1 @Smoke
  Scenario: Verify home page
    When The user wants to verify that it is "Mother Elephant With Babies Soft Toy" page

  @TC2 @Smoke
  Scenario: Verify toy price
    Then The user wants to verify that the toy price is "Price: $20"

  @TC3 @Smoke
  Scenario: Verify the url title
    Then The user wants to verify URL contains "payment-gateway"


  @TC4 @Regression
  Scenario:Customer wants to order 5 toys
    And The user want to buy "5" quantities of toy
    Then The user wants to click on Buy Now button
    And The user fill out the information
    Then The user wants to pay now
    And The user wants to verify message as "Payment successfull!"

  @TC5 @Regression
  Scenario Outline:Customer wants to order different quantities of toy
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
