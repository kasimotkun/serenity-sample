package starter.pages;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;


public class ProductsPage extends PageObject {

    public static By CART_BTN =  By.xpath("/html/body/nav/ul/button");
    public static By TITLE_FIELD =  By.xpath("/html/body/div[1]/div[1]/h2");

    public static By ADD_BTN (String prodName){

        return  By.xpath("//p[text() = '"+prodName+"']/following-sibling::button[1]");
    }

}
