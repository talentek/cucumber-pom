package bdd.page.model;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	WebDriver driver;

	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}
}
