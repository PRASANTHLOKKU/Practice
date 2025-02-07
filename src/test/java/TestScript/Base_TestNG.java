package TestScript;

import java.io.File;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_TestNG {
	protected static WebDriver driver;
	FileReader file;
	Properties prop = new Properties();
	//Properties loc = new Properties();
	
	@BeforeSuite
	public void Test_Prac() throws Throwable   {
		file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config_files\\config.properties");
		prop.load(file);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@AfterSuite
	public void Tear_Down() {
		//driver.close();
	}
}
