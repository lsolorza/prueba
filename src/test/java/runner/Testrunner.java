package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode"),
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)
public class Testrunner {

}
