package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.ProductsPage;

public class ConfirmProductsTitle extends UIInteractionSteps {


    @Step("Get the product page title")
    public String getTitle(){
       return $(ProductsPage.TITLE_FIELD).getText();
    }
}
