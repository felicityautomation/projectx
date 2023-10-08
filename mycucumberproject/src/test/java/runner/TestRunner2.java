package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/Login.feature","features/Login2.feature"},glue = {"step.definition"},plugin = {"html:htmlreport/cucumber-test-report.html","json:target/cucumber-report.json","pretty"},
tags = "@sanity")
public class TestRunner2 extends AbstractTestNGCucumberTests{

}



//@CucumberOptions(features = {"features/Login.feature"},glue = {"step.definition"}
//,plugin = {"html:htmlreport/cucumber-test-report.html","json:target/cucumber-report.json","pretty",
//		"junit:target/cucumber-report.xml"},tags = "@scenario2"
//		)
//public class TestRunner extends AbstractTestNGCucumberTests{
//
//}