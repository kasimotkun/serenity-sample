package starter.actions;

import lombok.SneakyThrows;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.CartPage;
import starter.pages.PaymentForm;
import starter.pages.ProductsPage;

public class PayWithCard extends UIInteractionSteps {
    @SneakyThrows
    @Step("Pay With Cart")
    public void pay() {
        $(CartPage.PAY_BTN).click();
        getDriver().switchTo().frame(0);
        $(PaymentForm.EMAIL_FIELD).clear();
        $(PaymentForm.EMAIL_FIELD).sendKeys("test@test.com");
        $(PaymentForm.CARD_NUMBER_FIELD).clear();
        $(PaymentForm.CARD_NUMBER_FIELD).sendKeys("4111");
        Thread.sleep(100);
        $(PaymentForm.CARD_NUMBER_FIELD).sendKeys("1111");
        Thread.sleep(100);
        $(PaymentForm.CARD_NUMBER_FIELD).sendKeys("1111");
        Thread.sleep(100);
        $(PaymentForm.CARD_NUMBER_FIELD).sendKeys("1111");
        $(PaymentForm.CC_EXP_FIELD).clear();
        $(PaymentForm.CC_EXP_FIELD).sendKeys("03");
        Thread.sleep(100);
        $(PaymentForm.CC_EXP_FIELD).sendKeys("27");
        $(PaymentForm.CVC_FIELD).clear();
        $(PaymentForm.CVC_FIELD).sendKeys("123");
        $(PaymentForm.ZIP_FIELD).waitUntilVisible();
        $(PaymentForm.ZIP_FIELD).clear();
        $(PaymentForm.ZIP_FIELD).sendKeys("IG93DD");
        $(PaymentForm.PAY_BTN).click();
        Thread.sleep(20000);
        getDriver().switchTo().parentFrame();

    }
}
