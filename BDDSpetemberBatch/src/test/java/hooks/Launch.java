package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Launch {


	private DriverManager dm;
	private WebDriver driver;
	
	@Before(order=0)
	public void launch() {
		dm = new DriverManager();
		//String browsername=prop.getProperty("browser");
		dm.setup("chrome" );
		driver=DriverManager.getdriver();
		driver.get("https://www.brampton.ca/EN/residents/Recreation/Customer-Care/Pages/Welcome.aspx");
	}
	
	
	@After(order=0)
	public void teardown() {
		driver.quit();
	}
	
	
	@After(order=1)
	public void Screenshotatfailedscenario(Scenario scenario) {
		//if(scenario.isFailed()) {
		String scenarioName=	scenario.getName().replaceAll(" ", "_");
		byte[] sourcepath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", scenarioName);
		//}
	}




}
