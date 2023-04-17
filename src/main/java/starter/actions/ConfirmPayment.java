package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.ConfirmationPage;
import starter.pages.ProductsPage;

public class ConfirmPayment extends UIInteractionSteps {

    @Step("Confirm the title")
    public String getTitle () {
        return $(ConfirmationPage.TITLE_FIELD).getText();
    }


    @Step("Confirm the message")
    public String getMessage () {
        return $(ConfirmationPage.MESSAGE_FIELD).getText();
    }
}
