package action;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Hooks;



public class Action extends Hooks{
	public Action() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public void scrollToElement (WebElement arg) throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", arg);
	}
	


}
