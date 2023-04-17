package starter.actions;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class NavigateTo {
    HomePage homePage;

    @Step("Open the WeatherShopper home page")
    public void theHomePage() {
        homePage.open();
    }

}
