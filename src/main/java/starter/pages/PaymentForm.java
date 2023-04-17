package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class PaymentForm extends PageObject {

    public static By EMAIL_FIELD =  By.id("email");

    public static By CARD_NUMBER_FIELD =  By.id("card_number");

    public static By CC_EXP_FIELD =  By.id("cc-exp");

    public static By CVC_FIELD =  By.id("cc-csc");

    public static By ZIP_FIELD =  By.id("billing-zip");

    public static By PAY_BTN =  By.id("submitButton");
}
