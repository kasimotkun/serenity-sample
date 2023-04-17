Feature: Buy Products


  Scenario: Buy A Moisturizer Product
    Given he navigates to the weathershopper site
    And he checks the temperature
    When if it is not below 19, he refreshs the page
    And the temperature is below 19, he tries to buy moisturizers
    Then he should see "Moisturizers" as title in the products page
    When he adds "Tigran Aloe Isolani" to cart
    When he goes to carts page
    Then he should see "Checkout" as title, "Tigran Aloe Isolani" as product name and 215 as price in the cart
    When he pays with card
    Then he should see "PAYMENT SUCCESS" as title and "Your payment was successful. You should receive a follow-up call from our sales team." as message in the confirmation page


  Scenario: Buy A Sunscreen Product
    Given he navigates to the weathershopper site
    And he checks the temperature
    When if it is not above 34, he refreshs the page
    And the temperature is above 34, he tries to buy sunscreens
    Then he should see "Sunscreens" as title in the products page
    When he adds "Paul Magnificient SPF-30" to cart
    When he goes to carts page
    Then he should see "Checkout" as title, "Paul Magnificient SPF-30" as product name and 121 as price in the cart
    When he pays with card
    Then he should see "PAYMENT SUCCESS" as title and "Your payment was successful. You should receive a follow-up call from our sales team." as message in the confirmation page

