Feature: Search for the product

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/demo/{product} for getting the products.
### Available products: "orange", "apple", "pasta", "cola"
### Prepare Positive and negative scenarios

  Scenario: Verifying the orange endpoint is working
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/orange"
    Then he sees the results displayed for "Orange"

  Scenario: Verifying the apple endpoint is working
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/apple"
    Then he sees the results displayed for "Mango"

  Scenario: Verifying the car endpoint is NOT working
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/car"
    Then he does not see the results

  Scenario: Verifying the cola endpoint is working
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/cola"
    Then he sees the results displayed for "Coca-Cola"

  Scenario: Verifying the pasta endpoint is working
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/pasta"
    Then he sees the results displayed for "spaghetti"