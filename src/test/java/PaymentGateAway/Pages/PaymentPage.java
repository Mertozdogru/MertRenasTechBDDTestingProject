package PaymentGateAway.Pages;

import PaymentGateAway.Utils.BrowserUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends BrowserUtils {
    public PaymentPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "card_nmuber")
   private WebElement cardNumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvv;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement payButton;
    Faker faker = new Faker();
    public void setCardNumber() {

        cardNumber.clear();
        cardNumber.sendKeys(faker.business().creditCardNumber().replace("-",""));
    }
        public void setMonth(){
            Select dropdown=new Select(month);
            dropdown.selectByVisibleText("05");
        }
        public void setYear(){
            Select dropdown=new Select(year);
            dropdown.selectByVisibleText("2020");

        }
        public void setCVV(){

            cvv.clear();
            cvv.sendKeys(faker.number().digits(3));
            staticWait(2);
        }


    public void setPayButton(){
        payButton.click();
    }
}
