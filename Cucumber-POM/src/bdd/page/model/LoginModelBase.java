package bdd.page.model;




import org.openqa.selenium.WebDriver;

public class LoginModelBase {
	WebDriver driver;

	public LoginModelBase(WebDriver driver) {
		this.driver = driver;
	}
}
