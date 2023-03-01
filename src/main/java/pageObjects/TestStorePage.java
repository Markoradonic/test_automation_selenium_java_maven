package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class TestStorePage extends BasePage{
	public WebDriver driver;
	
	public TestStorePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	By signNavbarButton = By.cssSelector("a[title='Log in to your customer account'] span[class='hidden-sm-down']");
	
	public WebElement getSignNavbarButton () {
		this.driver = getDriver();
		return driver.findElement(signNavbarButton);
	}
	

}
