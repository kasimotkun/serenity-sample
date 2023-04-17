package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.actions.*;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;

public class StepDefinitions {
    @Steps
    NavigateTo navigateTo;

    @Steps
    GetTheTempValue getTheTempValue;

    @Steps
    BuyMoisturizers buyMoisturizers;

    @Steps
    BuySunscreens buySunscreens;

    @Steps
    AddToCart addToCart;

    @Steps
    GoToCart goToCart;

    @Steps
    PayWithCard payWithCard;

    @Steps
    ConfirmPayment confirmPayment;

    @Steps
    ConfirmProductsTitle confirmProductsTitle;

    @Steps
    ConfirmCartDetails confirmCartDetails;

    int actualTempValue;



    @Given("he navigates to the weathershopper site")
    public void i_am_on_the_weathershopper_page() {
        navigateTo.theHomePage();
    }

    @Given("he checks the temperature")
    public void he_checks_the_temperature() {
        actualTempValue = getTheTempValue.theTempvalue();
    }

    @When("if it is not below {int}, he refreshs the page")
    public void if_it_is_not_below_he_refreshs_the_page(int expectedTempValue) {

        while (actualTempValue >= expectedTempValue){
            navigateTo.theHomePage();
            actualTempValue = getTheTempValue.theTempvalue();
        }
    }

    @When("the temperature is below {int}, he tries to buy moisturizers")
    public void the_temp_below_the_value(int expectedTempValue) {
        if( actualTempValue < expectedTempValue)
           buyMoisturizers.buy();
    }

    @When("if it is not above {int}, he refreshs the page")
    public void if_it_is_not_above_he_refreshs_the_page(int expectedTempValue) {

        while (actualTempValue <= expectedTempValue){
            navigateTo.theHomePage();
            actualTempValue = getTheTempValue.theTempvalue();
        }
    }

    @When("the temperature is above {int}, he tries to buy sunscreens")
    public void the_temp_above_the_value(int expectedTempValue) {
        if( actualTempValue > expectedTempValue)
            buySunscreens.buy();
    }

    @Then("he should see {string} as title in the products page")
    public void should_see_the_expected_title_in_product_page(String expectedTitle) {
        assertThat(confirmProductsTitle.getTitle()).isEqualTo(expectedTitle);
    }


    @When("he adds {string} to cart")
    public void add_prod_to_the_cart(String prodName) {
        addToCart.add(prodName);
    }

    @When("he goes to carts page")
    public void go_to_the_cart() {
        goToCart.go();
    }
    @Then("he should see {string} as title, {string} as product name and {int} as price in the cart")
    public void should_see_the_expected_product_in_the_cart(String expectedTitle, String expectedProdName, int expectedPrice) {

        assertThat(confirmCartDetails.getTitle()).isEqualTo(expectedTitle);
        assertThat(confirmCartDetails.getThePrice(expectedProdName)).isEqualTo(expectedPrice);
        assertThat(confirmCartDetails.getTheProdName(expectedProdName)).isEqualTo(expectedProdName);
    }


    @When("he pays with card")
    public void pay_with_card()  {
        payWithCard.pay();
    }

    @Then("he should see {string} as title and {string} as message in the confirmation page")
    public void should_see_the_expected_message_in_confirmation_page(String expectedTitle, String expectedMessage) {
        assertThat(confirmPayment.getTitle()).isEqualTo(expectedTitle);
        assertThat(confirmPayment.getMessage()).isEqualTo(expectedMessage);
    }

}
