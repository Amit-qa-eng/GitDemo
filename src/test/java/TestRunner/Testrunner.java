package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(tags="",
features= {"src/test/resources/Features"},
glue= {"StepDefinitions"} ,
plugin= {"pretty", "html:target/htmlreport.html"}
//monochrome = true 
)
public class Testrunner  extends AbstractTestNGCucumberTests {

	
}
