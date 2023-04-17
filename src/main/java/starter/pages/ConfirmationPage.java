package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ConfirmationPage extends PageObject {
    public static By TITLE_FIELD =  By.xpath("/html/body/div[1]/div[1]/h2");

    public static By MESSAGE_FIELD =  By.className("text-justify");

}
