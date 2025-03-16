package testrunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\User\\eclipse-workspace\\Hackathon-Zigwheels-Project-2\\Features\\A_ZigWheels.feature",
				"C:\\Users\\User\\eclipse-workspace\\Hackathon-Zigwheels-Project-2\\Features\\B_UpcomingBikes.feature",
				"C:\\Users\\User\\eclipse-workspace\\Hackathon-Zigwheels-Project-2\\Features\\C_UsedCarModels.feature",
				"C:\\Users\\User\\eclipse-workspace\\Hackathon-Zigwheels-Project-2\\Features\\D_UserLogin.feature"
		},
		glue="stepdefinations" ,
		plugin= {"pretty", "html:c_reports/myreport.html", 
				  "rerun:target/rerun.txt",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		         }
//		plugin= {"pretty","html:reports//myreport.html",
//				"json:reports/myreport.json"		
//		},
//		dryRun=false,
//		monochrome=true,
		//tags="@Smoke"	
		)
public class TestRunner 
{

 
}
