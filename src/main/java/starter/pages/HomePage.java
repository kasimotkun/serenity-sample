package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://weathershopper.pythonanywhere.com/")
public class HomePage extends PageObject {

    public static By TEMP_FIELD = By.id("temperature");
    public static By BUY_MOIS_BTN = By.xpath("//button[text()='Buy moisturizers']");
    public static By BUY_SUN_BTN = By.xpath("//button[text()='Buy sunscreens']");
}
