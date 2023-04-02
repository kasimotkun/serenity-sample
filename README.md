### Install
If you want to run the project in your local, you have to install JDK 15 or above and Maven 3.6.3 or above. Please use Java and Maven installation and configuration guides to install and configure environment variables for java and mvn commands
### Execute Test
Go to the project directory and run this command
```json
$ mvn clean surefie-report:report
```
### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             search_by_keyword.feature
```

### Add a new scenario
Go to `src/resources/features.search/post_product.feature` and add your BDD steps
```Gherkin

  Scenario: Searching for Mango term
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/apple"
    Then he sees the results displayed for "Mango"
```

### The Step Definitions implementation
Go to `src/java/starter/stepdefinitions/SeachStepDefinitions.java` file and add your step definition methods per your BDD steps in your feature scenarios
```java

     @Then("he sees the results displayed for {string}")
     public void heSeesTheResultsDisplayedForValue(String arg0) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body(containsString(arg0)));
     }
```
### Reports
I used surefire report plugin for html and xml reports. You can find the surefire-report.html report under `target/site/`


### Additional Info
Please read `README_OF_STARTERS.md` file in the project to learn more about SERENITY and CUCUMBER frameworks.