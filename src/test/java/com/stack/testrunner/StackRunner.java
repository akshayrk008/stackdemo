package com.stack.testrunner;


import com.stack.hooks.BaseCalsss;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepdef"},
        plugin = {"pretty","html:target/stackreport"}

        )
public class StackRunner extends BaseCalsss {

}
