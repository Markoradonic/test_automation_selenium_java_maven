package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CalculatorJs extends BasePage{
	public CalculatorJs() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public WebDriver driver;

	// all numbers
	By valueOne = By.cssSelector("input[value='1']");
	By valueTwo = By.cssSelector("input[value='2']");
	By valueThree = By.cssSelector("input[value='3']");
	By valueFour = By.cssSelector("input[value='4']");
	By valueFive = By.cssSelector("input[value='5']");
	By valueSix = By.cssSelector("input[value='6']");
	By valueSeven = By.cssSelector("input[value='7']");
	By valueEight = By.cssSelector("input[value='8']");
	By valueNine = By.cssSelector("input[value='9']");
	By valueZero = By.cssSelector("input[value='0']");
	//others
	By plusButton = By.cssSelector("input[value='+']");
	By minusButton = By.cssSelector("input[value='-']");
	By multiplicationButton = By.cssSelector("input[value='*']");
	By sharingButton = By.cssSelector("input[value='/']");
	By equallyButton = By.cssSelector("input[value='=']");
	By restartButton = By.cssSelector("input[value='c']");
	By commaButton = By.cssSelector("input[value='.']");
	By result = By.xpath("//input[@id='result']");
	
	//numbers
	public WebElement getvalueOne () {
		this.driver = getDriver();
		return driver.findElement(valueOne);
	}
	
	public WebElement getvalueTwo () {
		this.driver = getDriver();
		return driver.findElement(valueTwo);
	}
	
	public WebElement getvalueThree () {
		this.driver = getDriver();
		return driver.findElement(valueThree);
	}
	
	public WebElement getvalueFour () {
		this.driver = getDriver();
		return driver.findElement(valueFour);
	}
	
	public WebElement getvalueFive () {
		this.driver = getDriver();
		return driver.findElement(valueFive);
	}
	
	public WebElement getvalueSix () {
		this.driver = getDriver();
		return driver.findElement(valueSix);
	}
	
	public WebElement getvalueSeven () {
		this.driver = getDriver();
		return driver.findElement(valueSeven);
	}
	
	public WebElement getvalueEight () {
		this.driver = getDriver();
		return driver.findElement(valueEight);
	}
	
	public WebElement getvalueNine () {
		this.driver = getDriver();
		return driver.findElement(valueNine);
	}
	
	public WebElement getvalueZero () {
		this.driver = getDriver();
		return driver.findElement(valueZero);
	}
	//others
	public WebElement getplusButton () {
		this.driver = getDriver();
		return driver.findElement(plusButton);
	}
	
	public WebElement getminusButton () {
		this.driver = getDriver();
		return driver.findElement(minusButton);
	}
	
	public WebElement getmultiplicationButton () {
		this.driver = getDriver();
		return driver.findElement(multiplicationButton);
	}
	
	public WebElement getsharingButton () {
		this.driver = getDriver();
		return driver.findElement(sharingButton);
	}
	
	public WebElement getequallyButton () {
		this.driver = getDriver();
		return driver.findElement(equallyButton);
	}
	
	public WebElement getrestartButton () {
		this.driver = getDriver();
		return driver.findElement(restartButton);
	}
	
	public WebElement getcommaButton () {
		this.driver = getDriver();
		return driver.findElement(commaButton);
	}
	
	public WebElement getResult () {
		this.driver = getDriver();
		return driver.findElement(result);
	}
	
}
