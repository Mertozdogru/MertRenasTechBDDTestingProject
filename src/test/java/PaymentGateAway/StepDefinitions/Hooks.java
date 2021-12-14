package PaymentGateAway.StepDefinitions;

import PaymentGateAway.Utils.BrowserUtils;
import PaymentGateAway.Utils.ConfigurationReader;
import PaymentGateAway.Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks extends BrowserUtils {

    @Before
    public void setup(Scenario scenario) {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperties("url"));


    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
       // driver.close();

    }
}

