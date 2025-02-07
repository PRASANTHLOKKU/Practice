package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_Pages {
	WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Flights']")
	WebElement Click_Flight_option;
	
	public WebElement getClick(String trip_type) {
		Click_Flight_option.click();
	
		if(trip_type.equalsIgnoreCase(trip_type)) {
			WebElement r_1 = driver.findElement(By.xpath("//b//input[1]"));
			r_1.click();
		}else {
			WebElement r_2 = driver.findElement(By.xpath("//b//input[2]"));
			r_2.click();
		}
		return Click_Flight_option;
	}
	
	@FindBy(xpath = "//select[@name='passCount']//option")
	List<WebElement> passenger_count;
	
	public List<WebElement> getPassenger_Count(String Req_pass_count) {
		boolean count = false;
		for(WebElement c:passenger_count) {
			if(c.getText().contains(Req_pass_count)) {
				c.click();
				count = true;
				break;
			}
		}
		if(!count) {
			System.out.println("Count for found");
		}
		return passenger_count;
		
	}
	
	@FindBy(xpath = "//select[@name='fromPort']//option")
	List<WebElement> Departing_place;
	
	public List<WebElement> getDeparting_place(String country){
		boolean Country_Select = false;
		
		for(WebElement a:Departing_place) {
			if(a.getText().equalsIgnoreCase(country)) {
				a.click();
				Country_Select = true;
				break;
			}
		}
		if(!Country_Select) {
			System.out.println("Country name is not present in the dropdown");
		}
		return Departing_place;
	}
	
	@FindBy(xpath = "//select[@name='fromMonth']//option")
	List<WebElement> months;
	
	public List<WebElement>getMonth(String Month){
		boolean Sele_Month = false;
		
		for(WebElement a:months) {
			if(a.getText().equalsIgnoreCase(Month)) {
				a.click();
				Sele_Month = true;
				break;
			}
		}
		if(!Sele_Month) {
			System.out.println("Required month is not present");
		}
		return months;
	}
	
	@FindBy(xpath = "//select[@name='fromDay']//option")
	List<WebElement> dates;
	
	public List<WebElement> getDates(String Date){
		boolean Sele_date = false;
		
		for(WebElement a:dates) {
			if(a.getText().equalsIgnoreCase(Date)) {
				a.click();
				Sele_date = true;
				break;
			}
		}
		
		if(!Sele_date) {
			System.out.println("Required date is not selected");
		}
		
		return dates;
	}
	
	@FindBy(xpath = "//select[@name='toPort']//option")
	List<WebElement> Arriving_place;
	
	public List<WebElement>getArriving_place(String arriving_country){
		boolean A_Country = true;
		
		for(WebElement a:Arriving_place) {
			if(a.getText().equalsIgnoreCase(arriving_country)) {
				a.click();
				A_Country = true;
				break;
			}
		}
		if(!A_Country) {
			System.out.println("Required country is not present or selected");
		}
		return Arriving_place;
	}
	
	@FindBy(xpath = "//select[@name='toMonth']//option")
	List<WebElement> Returning_month;
	
	public List<WebElement> getReturning_month(String return_month){
		boolean a_month = false;
		
		for(WebElement a:Returning_month) {
			if(a.getText().equalsIgnoreCase(return_month)) {
				a.click();
				a_month = true;
				break;
			}
		}
		if(!a_month) {
			System.out.println("Returning month is not selected");
		}
		return Returning_month;
	}
	
	@FindBy(xpath = "//select[@name='toDay']//option")
	List<WebElement> Returning_date;
	
	public List<WebElement> getReturning_date(String Req_Returning_date){
		boolean Tog_date = false;
		
		for(WebElement a:Returning_date) {
			if(a.getText().equalsIgnoreCase(Req_Returning_date)) {
				a.click();
				Tog_date = true;
				break;
			}
		}
		if(!Tog_date) {
			System.out.println("Required date is not selected");
		}
		
		return Returning_date;
	}
	
	@FindBy(xpath = "//input[@value='Coach']")
	WebElement Service_class_1;
	
	@FindBy(xpath = "//input[@value='Business']")
	WebElement Service_class_2;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement Service_class_3;
	
	@FindBy(xpath = "//select[@name='airline']//option")
	List<WebElement> airlines;
	
	public List<WebElement>getAirline(){
		String req_airline = "Blue Skies Airlines";
		boolean r_airline = false;
		
		for(WebElement a:airlines) {
			if(a.getText().equalsIgnoreCase(req_airline)) {
				a.click();
				r_airline = true;
				break;
			}
		}
		
		if(!r_airline) {
			System.out.println("Airlines not found");
		}
		return airlines;
	}
	
	public Flight_Pages(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
}
