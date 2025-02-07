package Test_cases;

import org.testng.annotations.Test;

import TestScript.Base_TestNG;
import pages.Flight_Pages;

public class Flight_info_TC extends Base_TestNG{
	@Test
	public void Flight_TC() {
		Flight_Pages Flight_option = new Flight_Pages(driver);
		
		Flight_option.getClick("round trip");
		Flight_option.getPassenger_Count("2");
		Flight_option.getDeparting_place("London");
		Flight_option.getMonth("February");
		Flight_option.getDates("22");
		Flight_option.getArriving_place("paris");
		Flight_option.getReturning_month("April");
		Flight_option.getReturning_date("22");
		
	}

}
