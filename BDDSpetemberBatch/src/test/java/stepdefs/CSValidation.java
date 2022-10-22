package stepdefs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import driverManager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.CSActions;

public class CSValidation {
	
	CSActions cs= new CSActions(DriverManager.getdriver());

	@Given("I am on CS page")
	public void i_am_on_cs_page() {
		String actualtitle= DriverManager.getdriver().getTitle();
		Assert.assertTrue(actualtitle.equalsIgnoreCase("City of Brampton | Recreation | Customer Care"), actualtitle);
	    
	}

	@Then("I see {int} tiles")
	public void i_see_tiles(Integer tiles) {
		List<WebElement> tile =cs.csactivityTiles;
		int size =tile.size();
		Assert.assertEquals(size, tiles);
	   
	}

	@Then("I see {int} learn more buttons")
	public void i_see_learn_more_buttons(Integer learnmore) {
		List<WebElement> tile =cs.learnMorebutton;
		int size =tile.size();
		Assert.assertEquals(size, learnmore);
	}

	@Given("^I click on sign up button$")
	public void iClickOnSignUpButton() throws Throwable {
		cs.click(cs.Signupbutton);
		Thread.sleep(3000);
	}

	@Then("^I see \"([^\"]*)\" field$")
	public void iSeeField(String Email) throws Throwable {
		cs.Senkeysele(cs.email,Email);
		
	}

	@Then("^I see \"([^\"]*)\" field and enter the value$")
	public void iSeeFieldAndEnterTheValue(String Firstname) throws Throwable {
		cs.Senkeysele(cs.Firstname, Firstname);
	}

	@And("^I see \"([^\"]*)\" field to enter the value$")
	public void iSeeFieldToEnterTheValue(String Lastname) throws Throwable {
		cs.Senkeysele(cs.Lastname, Lastname);
	}

	@And("^I see \"([^\"]*)\" filed to enter the data$")
	public void iSeeFiledToEnterTheData(String ph) throws Throwable {
		cs.Senkeysele(cs.phonenumber, ph);
	}



}
