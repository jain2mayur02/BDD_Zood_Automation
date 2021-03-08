package com.zoodmall.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/resources/functionalTest"
		features =   "."
		,glue= {"com.zoodmall.stepDefinitions"},tags={"@RegressionOfferDeal1"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" , "rerun:target/rerun.txt"}, 
        monochrome = true
                )
	
public class TestRunner {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("configs/report.xml"));
    
    }
}



/*package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/functionalTest"
,glue= {"stepDefinitions"}
)

public class TestRunner {

}*/


