package automationtesting.co.uk;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;

public class LoginTest extends BasePage{

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setup () throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}

	@AfterTest 
	public void tearDown () {
		driver.close();
		driver = null;
	}
	
	@Test
	public void loginTest () throws IOException {
		Homepage home = new Homepage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
		js.executeScript("arguments[0].scrollIntoView();", home.getTestStore());
		home.getTestStore().click();

	}
}
