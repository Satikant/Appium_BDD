package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= //"/Users/vt060/eclipse-workspace/InstallTracker_BDD/src/main/java/features/itracker.feature",
				//"/Users/vt060/eclipse-workspace/InstallTracker_BDD/src/main/java/features/SitePhotos.feature",
		       "/Users/vt060/eclipse-workspace/InstallTracker_BDD/src/main/java/features/AllPhotoFields.feature",
	
		glue={"stepDefinitions"}
		
		)
public class TestRunner {
	
}
