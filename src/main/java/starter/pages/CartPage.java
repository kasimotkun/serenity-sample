package starter.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    public static By PAY_BTN = By.xpath("//button[@type='submit']");
    public static By TITLE_FIELD = By.xpath("/html/body/div[1]/div[1]/h2");

    public static By PROD_NAME_FIELD (String prodName){
        return  By.xpath("//td[text()='"+prodName+"']");
    }

    public static By PROD_PRICE_FIELD (String prodName){
        return  By.xpath("//td[text()='"+prodName+"']/following-sibling::td[1]");
    }


}
