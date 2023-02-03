package com.runner.in;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.in.BaseClassPrjct;

import io.cucumber.core.plugin.PrettyFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vvmvk\\eclipse-workspace\\CucumberTest\\src\\test\\java\\com\\feature\\in\\Script.feature", glue = "com.stepdef.in",
plugin={"pretty"},monochrome = true,dryRun = true)
public class Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = BaseClassPrjct.browserLaunch("chrome");
	}
}
