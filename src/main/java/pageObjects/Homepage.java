package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Homepage extends BasePage{
public WebDriver driver;
	
public Homepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
By testStore = By.cssSelector("a[href='http://teststore.automationtesting.co.uk/']");


public WebElement getTestStore() {
	this.driver = getDriver();
	return driver.findElement(testStore);
}




}
