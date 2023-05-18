package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
//        feature: Path of the feature file , where feature file is available
        features = "C:\\Users\\bjmis\\IdeaProjects\\BddFramework\\src\\test\\resources\\Features",
//        features = ".",tags = "@Login", //Specific Scenario
//        features = ".",tags = {"@Regression,@Sanity"}, // OR
//        features = ".",tags = {"@Regression","@Sanity"}, //And
   // features = ".", tags = "~@Smoke", //Ignore
        tags = "~@Smoke", //Ignore
        //        glue: Path of the step definitions
        glue = {"StepDefinitions"},
//        format: We can create different type of report and pretty output.
        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},
//      dryRun =  Will help to do one to one mapping between feature file and step definitions
        dryRun = false
//      monochrome: Display the console output in proper readable format
//        monochrome = true
)
//      strict: It will fail the execution if there are pending step or undefine step. It will check if any step is not defined in ste


public class RunnerTest {
}
