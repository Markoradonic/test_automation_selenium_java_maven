package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
public WebDriver driver;

By testStore = By.cssSelector("a[href='http://teststore.automationtesting.co.uk/']");

public Homepage(WebDriver driver) {
	this.driver = driver;
}

public WebElement getTestStore() {
	return driver.findElement(testStore);
}

}
