package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"./Features/LoginFeature.feature", "./Features/Customers.feature"},
                //"./Features/Customers.feature" - To execute specific single feature file.
               // "./Features/" - To execute all features present in Features Folder
        glue="StepDefinition",
        dryRun = false,
       /* tags = "@Sanity", - Scenarios under @Sanity tag will be executed.
        tags = "@Sanity or @Regression", - Scenarios tagged with @Sanity or @Regression will be executed.
        tags = "@Sanity and @Regression", - Scenarios tagged with @Sanity and @Regression will be executed.
        tags = "Sanity and not @Regression", - Scenarios tagged with @Sanity and not @Regression will be executed.*/
        monochrome = true,
        plugin = {"pretty","html:Reports/Html-Report.html",
                  "pretty","junit:Reports/Xml-Report.xml",
                  "pretty","json:Reports/Json-Report.json"}
)

public class Run
{

}
