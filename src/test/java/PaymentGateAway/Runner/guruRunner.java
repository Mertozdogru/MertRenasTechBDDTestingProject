package PaymentGateAway.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources",
       glue = "PaymentGateAway/StepDefinitions",
        dryRun= false,
        tags = "@Smoke or @Regression",
        plugin ={  "pretty",
                "html:target/HTMLReports/reports.html",
                "json:target/JSONReports/report.json",
                "junit:target/JUNITReports/report.xml",
                "rerun:target/rerun.txt"
        },
        publish=true,
        monochrome = true

)
public class guruRunner {

}
