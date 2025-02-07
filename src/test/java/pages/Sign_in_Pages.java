package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_in_Pages {
	WebDriver driver;
	WebDriverWait wait;
	
//	@FindBy(xpath = "//a[contains(text(),'Register')]")
//	WebElement register_Click;
//	public WebElement getRegister() {
//		return register_Click;
//	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement user_name_Field;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password_Field;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement conf_pass_field;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit_btn;
	
	public Sign_in_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getuser_name(String username) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(user_name_Field));
		user_name_Field.sendKeys(username);
		return user_name_Field;
	}
	
	public WebElement getPassword(String password) {
		password_Field.sendKeys(password);
		return password_Field;
	}
	
	public WebElement getconf_pass(String conf_pass) {
		conf_pass_field.sendKeys(conf_pass);
		return conf_pass_field;
	}
	
	public WebElement click_submit_btn() {
		submit_btn.click();
		return submit_btn;
	}
}
