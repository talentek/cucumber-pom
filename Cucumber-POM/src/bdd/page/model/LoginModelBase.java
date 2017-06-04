package bdd.page.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModelBase extends BaseClass {

	WebElement login = null;
	WebElement username = null;
	WebElement password = null;
	WebElement subbtn = null;

	public LoginModelBase(WebDriver driver) {
		super(driver);
	}

	public WebElement login() {
		login = driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[1]/a"));
		return login;
	}

	public WebElement userName() {
		username = driver.findElement(By.xpath(".//*[@id='email']"));
		return username;
	}

	public WebElement passWord() {
		password = driver.findElement(By.xpath(".//*[@id='pwd']"));
		return password;
	}

	public WebElement submit() {
		subbtn = driver.findElement(By.xpath(".//*[@id='submitBtn']"));
		return subbtn;
	}
}