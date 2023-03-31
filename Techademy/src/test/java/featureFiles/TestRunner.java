package featureFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featureFiles",glue="stepDefinitions",monochrome=true,plugin= {"html:target/cucumberreports.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
