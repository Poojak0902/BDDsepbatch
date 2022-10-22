package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;
import utils.Commonmethods;

public class CSActions {
	
	WebDriver driver;
	Commonmethods common = new Commonmethods(DriverManager.getdriver());
	
	
	public CSActions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@CacheLookup
	@FindBy(xpath="//*[@class='activityItem']")
	 public  List<WebElement> csactivityTiles;
	
	
	@CacheLookup
	@FindBy(xpath="//*[@class='activityLink']")
	 public  List<WebElement> learnMorebutton;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Sign Up Here')]")
	 public  WebElement Signupbutton;
	
	@CacheLookup
	@FindBy(id="email_address_1")
	 public  WebElement email;
	
	@CacheLookup
	@FindBy(id="first_name_1")
	 public  WebElement Firstname;
	@CacheLookup
	@FindBy(id="last_name_1")
	 public  WebElement Lastname;
	@CacheLookup
	@FindBy(id="postal_code_1")
	 public  WebElement phonenumber;
	
	
	public void click(WebElement ele) {
		common.higlightement(ele);
		ele.click();
	}
	
	public void Senkeysele(WebElement ele, String keys) {
		common.higlightement(ele);
		ele.sendKeys(keys);
		
	}
}
