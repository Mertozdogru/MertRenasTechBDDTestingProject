package PaymentGateAway.Pages;

import PaymentGateAway.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sun.jvm.hotspot.debugger.Page;

public class HomePage extends BrowserUtils {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    WebElement header;
    @FindBy(xpath = "//h3[.='Price: $20']")
    WebElement price;
    @FindBy(xpath = "//select[@name='quantity']")
    WebElement quantity;
    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;


    public void setHeader(String head){
        String Header=header.getText();
        Assert.assertEquals(Header,head);
    }
    public void setPrice(String toyPrice){
        String Price=price.getText();
        Assert.assertEquals(Price,toyPrice);
    }
    public void setUrl(String url){
        Assert.assertTrue(driver.getCurrentUrl().contains(url));

    }
    public void setQuantity(String number){

        Select dropDown=new Select(quantity);
        staticWait(2);
        dropDown.selectByVisibleText(number);

    }

    public void setBuyNow() {
        buyNow.click();
    }
    public void setQuantityForOutline(String nmber){
        Select dropDown=new Select(quantity);
        dropDown.selectByVisibleText(nmber);


    }

}