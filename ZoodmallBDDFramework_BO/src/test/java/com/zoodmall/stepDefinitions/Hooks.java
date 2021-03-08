package com.zoodmall.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.zoodmall.contextmanager.TestContext;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;
	WebDriver driver;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("Mayur Jain");
		
		
	}

	@After(order = 1)
	public void afterScenarioScreenshot(Scenario scenario) throws WebDriverException, InterruptedException {
	//	if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				// This takes a screenshot from the driver at save it to the
				// specified location
				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
						.getScreenshotAs(OutputType.FILE);
				
				String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

				// Building up the destination path for the screenshot to save
				// Also make sure to create a folder 'screenshots' with in the
				// cucumber-report folder
				/*File destinationPath = new File(
						"C://Users/Mayur/Desktop/Latestcodechecking01/zm_qa_automation/ZoodmallBDDFramework_BO/target/cucumber-reports/screenshots/"
								+ screenshotName + timestamp +".png");
				*/
				File destinationPath = new File(
						System.getProperty("user.dir") + "\\screencast\\"
								+ screenshotName + timestamp +".png");
	

				// Copy taken screenshot from source location to destination
				// location
				Files.copy(sourcePath, destinationPath);

				// This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			}
	//	}
	}

	@After(order = 2)
	public void embedScreenshot(Scenario scenario) throws WebDriverException, InterruptedException {
	//	if (scenario.isFailed()) {
			// Take a screenshot...
			final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
					.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png"); // ... and embed it in the
														// report.
	//	}
	}

	@After(order = 0)
	public void driveClose() {
		testContext.getWebDriverManager().closeDriver();
	}
	
	
}