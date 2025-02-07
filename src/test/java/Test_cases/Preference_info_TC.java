package Test_cases;

import org.testng.annotations.Test;

import TestScript.Base_TestNG;
import pages.Preferences_Pages;

public class Preference_info_TC extends Base_TestNG{
	@Test
	public void Preference_TC() {
		Preferences_Pages Pref_pages = new Preferences_Pages(driver);
		Pref_pages.getType_of_class("class");
		Pref_pages.getAirline_pref("Blue Skies Airlines");
		Pref_pages.getClick().click();
	}
}
