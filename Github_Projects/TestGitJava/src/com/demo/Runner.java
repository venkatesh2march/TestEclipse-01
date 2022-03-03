package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/resources/calendar.feature","src/resources/daysRemaining.feature"}, glue="com.yearmonthday", dryRun = false)
//@CucumberOptions(features = {"src\\resources\\ScenarioOutline.feature"},glue="com.yearmonthday", dryRun=false, monochrome = true, plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
//		"usage:target/cucumber-usage.json","junit:target/cucumber-junitresults.xml"},strict=false)

//@CucumberOptions(features = {"src\\resources\\ParameterizationUsingList.feature"},glue="com.yearmonthday", dryRun=false, monochrome = true, plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
//		"usage:target/cucumber-usage.json","junit:target/cucumber-junitresults.xml"},strict=false)


@CucumberOptions(features = {"src\\resources\\ParameterizationUsingMaps.feature"},glue="com.yearmonthday", dryRun=false, monochrome = true, plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json","junit:target/cucumber-junitresults.xml"},strict=false)
public class Runner {

}
