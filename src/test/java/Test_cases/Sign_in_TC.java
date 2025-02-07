package Test_cases;

import org.testng.annotations.Test;

import TestScript.Base_TestNG;
import pages.Sign_in_Pages;

public class Sign_in_TC extends Base_TestNG{
	@Test
	public void Sign_in_test() {
		Sign_in_Pages Sign_in = new Sign_in_Pages(driver);
		//Sign_in.getRegister().click();
		Sign_in.getuser_name("PRASANTH");
		Sign_in.getPassword("Pras@034");
		Sign_in.getconf_pass("Pras@034");
		Sign_in.click_submit_btn();
	}
	
}
