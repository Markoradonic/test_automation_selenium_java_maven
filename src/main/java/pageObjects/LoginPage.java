package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class LoginPage extends BasePage{
	public WebDriver driver;

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	By loginField = By.cssSelector("input[class='form-control']");
	By passwrodField = By.cssSelector("input[title='At least 5 characters long']");
	By signInButton = By.cssSelector("#submit-login");
	By signOutButton = By.cssSelector(".hidden-sm-down.logout");
	By alertMessage = By.cssSelector(".alert.alert-danger");
	
	
	public WebElement getLoginField () {
		this.driver = getDriver();
		return driver.findElement(loginField);
	}

	public WebElement getPasswordField() {
		this.driver = getDriver();
		return driver.findElement(passwrodField);
	}

	public WebElement getSignInButton () {
		this.driver = getDriver();
		return driver.findElement(signInButton);
	}
	
	public WebElement getSignOutButton () {
		this.driver = getDriver();
		return driver.findElement(signOutButton);
	}

	public WebElement getAlertMessage () {
		this.driver = getDriver();
		return driver.findElement(alertMessage);
	}
}
