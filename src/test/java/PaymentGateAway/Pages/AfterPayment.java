package PaymentGateAway.Pages;

import PaymentGateAway.Utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterPayment extends BrowserUtils {
    public AfterPayment() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@id='three']/div/div/h2")
    private WebElement paymentVerificationMessage;

    public String verifyMessage() {
        String paymentVerificationMessageText= paymentVerificationMessage.getText();
        return paymentVerificationMessageText;
    }

    public  void mssge(){
        System.out.println("paymentVerificationMessage.getText() = " + paymentVerificationMessage.getText());
    }
}

