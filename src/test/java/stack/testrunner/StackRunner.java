package stack.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Feature",
        glue = {"src/test/com/stack/stepdef"},
        plugin = {"pretty","html:target/stackreport"},
        tags = "@E2ECheckout",
        monochrome = true

        )
public class StackRunner{

}
