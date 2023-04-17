package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class BuySunscreens extends UIInteractionSteps {

    @Step("Buy Sunscreens")
    public void buy() {
        $(HomePage.BUY_SUN_BTN).click();
    }
}
