package PaylocityRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\LoginPaylocity.feature",
//        features = "src\\test\\resources\\WebOrder.feature",
        glue = "PalocityStepDefs",
        dryRun = false,
        monochrome = true


)
public class cukesRunner {
//src\test\resources\com.cucumber.features\RunnerTest.feature

}
