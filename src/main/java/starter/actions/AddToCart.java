package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;
import starter.pages.ProductsPage;

public class AddToCart extends UIInteractionSteps {

    @Step("Add {0} To Cart")
    public void add(String prodName ) {
        $(ProductsPage.ADD_BTN(prodName)).setWindowFocus();
        $(ProductsPage.ADD_BTN(prodName)).click();
    }

    @Step("Get the title")
    public String getTitle(){
       return $(ProductsPage.TITLE_FIELD).getText();
    }
}
