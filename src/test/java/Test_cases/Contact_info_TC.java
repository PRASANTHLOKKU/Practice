package Test_cases;

import org.testng.annotations.Test;

import TestScript.Base_TestNG;
import pages.Contact_info_pages;

public class Contact_info_TC extends Base_TestNG{
	
	@Test
	public void Contact_Info() {
		Contact_info_pages contact_info = new Contact_info_pages(driver);
		contact_info.getRegister().click();
		contact_info.getFirst_name("PRASANTH");
		contact_info.getLast_Name("LOKKU");
		contact_info.getphone_no("0123456789");
		contact_info.getemail("prasanthlokku88@gmail.com");
		contact_info.getAddress("ABC street, DEF city, GHI district, Andhra Pradesh");
		contact_info.getCity("DEF city");
		contact_info.getState("Andhra Pradesh");
		contact_info.getPostal_code("523357");
		contact_info.getCountry("Germany");
	}
}
