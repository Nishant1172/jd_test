import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources",strict = true, plugin = {"json:target/cucumber.json"})
@RunWith(Cucumber.class)
public class runnerCukes{

}
