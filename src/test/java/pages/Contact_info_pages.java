package pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Contact_info_pages {
	WebDriver driver;
	 private static final Logger logger = LogManager.getLogger(Contact_info_pages.class);
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement register_Click;
	
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement Enter_First_Name;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement Enter_Last_Name;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement Enter_Phone_no;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement Enter_Email;
	
	@FindBy(xpath = "//input[@name='address1']")
	WebElement Enter_Address;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement Enter_City;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement Enter_State;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement Enter_Postal_code;
	
	@FindBy(xpath = "//select[@name='country']//option")
	List<WebElement> Select_Country;
	
//	public void link() throws InterruptedException {
//		Thread.sleep(3000);
//		register.click();
//	}
	
	public WebElement getRegister() {
		logger.info("Click on register page");
		return register_Click;
	}
	
	public WebElement getFirst_name(String FirstName) {
		Enter_First_Name.sendKeys(FirstName);
		return Enter_First_Name;
	}
	
	public WebElement getLast_Name(String LastName) {
		 Enter_Last_Name.sendKeys(LastName);
		 return Enter_Last_Name;
	}
	
	public WebElement getphone_no(String PhoneNumber) {
		Enter_Phone_no.sendKeys(PhoneNumber);
		return Enter_Phone_no;
	}
	
	public WebElement getemail(String Email) {
		Enter_Email.sendKeys(Email);
		return Enter_Email;
	}
	
	public WebElement getAddress(String Address) {
		Enter_Address.sendKeys(Address);
		return Enter_Address;
	}
	
	public WebElement getCity(String City) {
		Enter_City.sendKeys(City);
		return Enter_City;
	}
	
	public WebElement getState(String State) {
		Enter_State.sendKeys(State);
		return Enter_State;
	}
	
	public WebElement getPostal_code(String PostalCode) {
		Enter_Postal_code.sendKeys(PostalCode);
		return Enter_Postal_code;
	}
	
	public List<WebElement> getCountry(String country_name) {
		boolean country_found = false;
		for(WebElement c:Select_Country) {
			if(c.getText().equalsIgnoreCase(country_name)) {
				c.click();
				country_found = true;
				break;
			}
		}
		
		if(!country_found) {
			System.out.println("Country not found");
		}
		return Select_Country;
	}
	
	public Contact_info_pages(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
}
