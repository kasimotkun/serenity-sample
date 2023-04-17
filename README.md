# Getting started
I used Serenity BDD framework with actions design pattern in this project.

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.


### Install
If you want to run the project in your local, you have to install JDK 15 or above and Maven 3.6.3 or above. Please use Java and Maven installation and configuration guides to install and configure environment variables for java and mvn commands
### Execute Test
Go to the project directory and run this command
```json
$ mvn test
```
### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
    + java                        Actions and pages code
  + test
    + java                        Test runners and step definitions code
    + resources
      + features                  Feature files
     + buy_products                  Feature file subdirectories 
             buy_products.feature
```

### Add a new scenario
Go to `src/resources/features.buy_products/buy_products.feature` and add your BDD steps
```Gherkin
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

```

### The Step Definitions implementation
Go to `src/java/starter/stepdefinitions/StepDefinitions.java` file and add your step definition methods per your BDD steps in your feature scenarios
```java

    @Given("he navigates to the weathershopper site")
    public void i_am_on_the_weathershopper_page() {
        navigateTo.theHomePage();
    }
```
### Reports
  Serenity has html and xml reports. You can find the report under `target/site/serenity`
  

### Additional Info
Please read README_OF_STARTERS.md file in the project to learn more about SERENITY and CUCUMBER frameworks.