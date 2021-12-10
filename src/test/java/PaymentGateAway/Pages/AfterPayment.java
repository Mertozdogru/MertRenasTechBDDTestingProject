package PaymentGateAway.Pages;

import PaymentGateAway.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterPayment extends BrowserUtils {
    public AfterPayment() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@id='three']/div/div/h2")
    WebElement paymentVerificationMessage;

    public void verifyMessage(String string) {
        String paymentVerificationMessageText= paymentVerificationMessage.getText();
        Assert.assertEquals(paymentVerificationMessageText,string);
    }

    public  void mssge(){
        System.out.println("paymentVerificationMessage.getText() = " + paymentVerificationMessage.getText());
    }
}

