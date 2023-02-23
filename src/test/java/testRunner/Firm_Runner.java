package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features =".//Features//HCR_FIRM.feature" , glue="stepDefinition", dryRun=false,monochrome=true,tags="@Sanity02",
plugin = {"pretty","html:Reports/report.html",
		"junit:Reports/report1.xml",
		"json:Reports/report2.json"}
		)

public class Firm_Runner {

}
