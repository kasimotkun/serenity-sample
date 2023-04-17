package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.ProductsPage;

public class GoToCart extends UIInteractionSteps {

    @Step("Go To Cart")
    public void go () {
        $(ProductsPage.CART_BTN).click();
    }
}
