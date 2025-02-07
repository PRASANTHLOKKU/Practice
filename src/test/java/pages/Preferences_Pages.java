package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Preferences_Pages {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@value='Coach']")
	WebElement Economy_class;
	
	@FindBy(xpath = "//input[@value='Business']")
	WebElement Business_class;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement First_class;
	
	@FindBy(xpath ="//input[@name='findFlights']")
	WebElement click;
	
	@FindBy(xpath = "//select[@name='airline']//option")
	List<WebElement> Airline_pref;
	
	public void getType_of_class(String Service_class) {
		boolean Class = false;
		
		if(Service_class.equalsIgnoreCase("Economy class")) {
			Economy_class.click();
			Class = true;
		}else if (Service_class.equalsIgnoreCase("Business class")) {
			Business_class.click();
			Class = true;
		}else if(Service_class.equalsIgnoreCase("First class")){
			First_class.click();
			Class = true;
		}
		else {
			if(!Class) {
				System.out.println("By default Business class is selected");
			}
		}
	}

	public WebElement getClick() {
		return click;
	}
	
	public List<WebElement> getAirline_pref(String req_airline){
		
		boolean r_airline = false;
		for(WebElement i:Airline_pref) {
			if(i.getText().equalsIgnoreCase(req_airline)) {
				i.click();
				r_airline = true;
				break;
			}
		}
		
		if(!r_airline) {
			System.out.println("Airlines not found");
		}
		
		return Airline_pref;
	}
	
	public  Preferences_Pages(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
