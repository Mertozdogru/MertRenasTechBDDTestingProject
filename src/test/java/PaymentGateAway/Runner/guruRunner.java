package PaymentGateAway.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/Payment.feature",
       glue = "PaymentGateAway/StepDefinitions",
        dryRun= false,
        tags = "@smoke",
        plugin ={  "pretty",
        "html:target/HTMLReports/reports.html",
                "json:target/JSONReports/report.json",
                "junit:target/JUNITReports/report.xml",
                "rerun:target/rerun.txt"
        }

)
public class guruRunner {

}
