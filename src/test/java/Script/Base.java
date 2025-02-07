package Script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/");
		click_link();
		contact_info();
		user_info();
		sign_in();
		click_on_flights();
	}
	
	
	
	static void click_link() {
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		link.click();
	}
	
	static void contact_info() {
		WebElement First_name = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		First_name.sendKeys("FIRST");
		
		WebElement Last_name = driver.findElement(By.xpath("//input[@name='lastName']"));
		Last_name.sendKeys("LAST");
		
		WebElement Phone_no = driver.findElement(By.xpath("//input[@name='phone']"));
		Phone_no.sendKeys("0123456789");
		
		WebElement Email_id = driver.findElement(By.xpath("//input[@id='userName']"));
		Email_id.sendKeys("firstlast@gmail.com");
	}
	
	static void mailing_info() {
		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("abc street, def destrict, ghi state, jkl, 012345");
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("def");
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("ghi");
		WebElement postal_code = driver.findElement(By.xpath("//input[@name='postalCode']"));
		postal_code.sendKeys("012345");
		
		List<WebElement> country = driver.findElements(By.xpath("//select[@name='country']//option"));
		boolean country_found = false;
		for(WebElement c:country) {
			if(c.getText().equalsIgnoreCase("india")) {
				c.click();
				country_found = true;
				break;
			}
		}
		
		if(!country_found) {
			System.out.println("Country not found");
		}
	}
	
	static void user_info() {
		WebElement user_name = driver.findElement(By.xpath("//input[@id='email']"));
		user_name.sendKeys("PRASANTH");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Pras@034");
		
		WebElement conf_pass = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		conf_pass.sendKeys("Pras@034");
		
		WebElement submit_btn = driver.findElement(By.xpath("//input[@name='submit']"));
		submit_btn.click();
	}
	
	static void sign_in() {
		WebElement sign_in_btn = driver.findElement(By.xpath("//a[normalize-space()='sign-in']"));
		sign_in_btn.click();
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='userName']"));
		user_name.sendKeys("PRASANTH");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Pras@034");
		
		WebElement submit_btn = driver.findElement(By.xpath("//input[@name='submit']"));
		submit_btn.click();
	}
	
	static void click_on_flights() {
		WebElement option = driver.findElement(By.xpath("//a[normalize-space()='Flights']"));
		option.click();
		
		String trip_type = "one way";
		
		if(trip_type.equalsIgnoreCase("Round trip")) {
			WebElement r_1 = driver.findElement(By.xpath("//b//input[1]"));
			r_1.click();
		}else {
			WebElement r_2 = driver.findElement(By.xpath("//b//input[2]"));
			r_2.click();
		}
		
		String passenger_count = "4";
		List<WebElement> passenger_count_t = driver.findElements(By.xpath("//select[@name='passCount']//option"));
		boolean count = false;
		for(WebElement c: passenger_count_t) {
			if(c.getText().contains(passenger_count)) {
				c.click();
				count = true;
				break;
			}
		}
		
		if(!count) {
			System.out.println("Count not found");
		}
		
		List<WebElement> departing_palces = driver.findElements(By.xpath("//select[@name='fromPort']//option"));
		String country = "London";
		boolean country_select = false;
		
		for(WebElement a:departing_palces) {
			if(a.getText().equalsIgnoreCase(country)) {
				a.click();
				country_select = true;
				break;
			}
		}
		
		if(!country_select) {
			System.out.println("There is no country");
		}
		
		List<WebElement> month = driver.findElements(By.xpath("//select[@name='fromMonth']//option"));
		String r_month = "February";
		boolean s_month = false;
		
		for(WebElement d:month) {
			if(d.getText().equalsIgnoreCase(r_month)) {
				d.click();
				s_month = true;
				break;
			}
		}
		
		if(!s_month) {
			System.out.println("Required month is not present");
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//select[@name='fromDay']//option"));
		String r_date = "22";
		boolean s_date = false;
		
		for(WebElement e:dates) {
			if(e.getText().equalsIgnoreCase(r_date)) {
				e.click();
				s_date = true;
				break;
			}
		}
		
		if(!s_date) {
			System.out.println("Date is not selected");
		}
		
		List<WebElement> arriving_place = driver.findElements(By.xpath("//select[@name='toPort']//option"));
		String arriving_country = "paris";
		boolean a_country = false;
		
		for(WebElement f:arriving_place) {
			if(f.getText().equalsIgnoreCase(arriving_country)) {
				f.click();
				a_country = true;
				break;
			}
		}
		
		if(!a_country) {
			System.out.println("Selected arriving country not found");
		}
		
		List<WebElement>returning_month = driver.findElements(By.xpath("//select[@name='toMonth']//option"));
		String ret_month = "april";
		boolean a_month = false;
		
		for(WebElement g:returning_month) {
			if(g.getText().equalsIgnoreCase(ret_month)) {
				g.click();
				a_month = true;
				break;
			}
		}
		
		if(!a_month) {
			System.out.println("Returning month is not selected");
		}
		
		List<WebElement>ret_date = driver.findElements(By.xpath("//select[@name='toDay']//option"));
		String sel_date = "22";
		boolean sele_date = false;
		
		for(WebElement h:ret_date) {
			if(h.getText().equalsIgnoreCase(sel_date)) {
				h.click();
				sele_date = true;
				break;
			}
		}
		
		if(!sele_date) {
			System.out.println("Required date is not selected");
		}
		
		String Service_class = "business class";
		boolean Class = false;
		
		if(Service_class.equalsIgnoreCase("Economy class ")) {
			WebElement radio_btn_1 = driver.findElement(By.xpath("//input[@value='Coach']"));
			radio_btn_1.click();
			Class = true;
		}else if(Service_class.equalsIgnoreCase("Business class")) {
			WebElement radio_btn_2 = driver.findElement(By.xpath("//input[@value='Business']"));
			radio_btn_2.click();
			Class = true;
		}else if(Service_class.equalsIgnoreCase("First class")){
			WebElement radio_btn_3 = driver.findElement(By.xpath("//input[@value='First']"));
			radio_btn_3.click();
			Class = true;
		}
		
		if(!Class) {
			System.out.println("By default Business class is selected");
		}
		
		List<WebElement> airline = driver.findElements(By.xpath("//select[@name='airline']//option"));
		//String req_airline = "Indian airlines";
		String req_airline = "Blue Skies Airlines";
		boolean r_airline = false;
		
		for(WebElement i:airline) {
			if(i.getText().equalsIgnoreCase(req_airline)) {
				i.click();
				r_airline = true;
				break;
			}
		}
		
		if(!r_airline) {
			System.out.println("Airlines not found");
		}
		
		
		WebElement continue_nex = driver.findElement(By.xpath("//input[@name='findFlights']"));
		continue_nex.click();
	}
	
}