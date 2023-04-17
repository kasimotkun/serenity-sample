package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class BuyMoisturizers extends UIInteractionSteps {

    @Step("Buy Moisturizers")
    public void buy() {
        $(HomePage.BUY_MOIS_BTN).click();
    }
}
