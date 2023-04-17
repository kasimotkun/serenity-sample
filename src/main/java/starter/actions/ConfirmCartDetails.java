package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.CartPage;
import starter.pages.ProductsPage;

public class ConfirmCartDetails extends UIInteractionSteps {


    @Step("Get the cart title")
    public String getTitle(){
       return $(CartPage.TITLE_FIELD).getText();
    }


    @Step("Find the product name :{0}")
    public String getTheProdName(String prodName){

        return $(CartPage.PROD_NAME_FIELD(prodName)).getText();

    }

    @Step("Get the price of {0}")
    public int getThePrice(String prodName){

        return Integer.parseInt($(CartPage.PROD_PRICE_FIELD(prodName)).getText());

    }
}
