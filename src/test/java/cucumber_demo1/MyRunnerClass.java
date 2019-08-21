package cucumber_demo1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\Selenium WorkSpace\\Cucumber_demo\\MyFeatures\\DemoOnTags.feature",glue="cucumber_demo1",tags= {"@Regression,@Smoke"},plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})
public class MyRunnerClass 

}
