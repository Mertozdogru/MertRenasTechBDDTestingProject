package PaymentGateAway.StepDefinitions;

import PaymentGateAway.Pages.AfterPayment;
import PaymentGateAway.Pages.HomePage;
import PaymentGateAway.Pages.PaymentPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Pages {
    HomePage homePage = new HomePage();
    PaymentPage paymentPage = new PaymentPage();
    AfterPayment afterPayment = new AfterPayment();

    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        System.out.println("browser launched");
    }

    @When("The user wants to verify that it is {string} page")
    public void the_user_wants_to_verify_that_it_is_page(String string) {
        homePage.setHeader(string);
    }

    @Then("The user wants to verify that the toy price is {string}")
    public void the_user_wants_to_verify_that_the_toy_price_is(String string) {
        homePage.setPrice(string);
    }

    @Then("The user wants to verify URL contains {string}")
    public void the_user_wants_to_verify_url_contains(String string) {
        homePage.setUrl(string);
    }

    @Then("The user want to buy {string} quantities of toy")
    public void the_user_want_to_buy_quantities_of_toy(String nmbr) {
        homePage.setQuantity(nmbr);

    }

    @Then("The user wants to click on Buy Now button")
    public void the_user_wants_to_click_on_buy_now_button() {
        homePage.setBuyNow();
    }

    @Then("The user fill out the information")
    public void the_user_fill_out_the_information() {
        paymentPage.setCardNumber();
        paymentPage.setMonth();
        paymentPage.setYear();
        paymentPage.setCVV();

    }

    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {

        paymentPage.setPayButton();

    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        afterPayment.verifyMessage(string);
        afterPayment.mssge();


    }

    @Given("The user want to buy toy as {string}")
    public void the_user_want_to_buy_toy_as(String string) {
        homePage.setQuantityForOutline(string);


    }


}
