package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class GetTheTempValue extends UIInteractionSteps {

    @Step("Get the temperature value")
    public int theTempvalue() {

        return Integer.parseInt($(HomePage.TEMP_FIELD).getText()
                .substring(0,2)
                .replace(" ",""));
    }
}
