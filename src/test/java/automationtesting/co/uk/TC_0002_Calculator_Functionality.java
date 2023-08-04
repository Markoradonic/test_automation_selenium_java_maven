package automationtesting.co.uk;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.CalculatorJs;
import pageObjects.Homepage;

public class TC_0002_Calculator_Functionality extends Hooks {

	public TC_0002_Calculator_Functionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void plusFunctionality () throws IOException, InterruptedException {
		Homepage home = new Homepage();
		CalculatorJs calculatorPage = new CalculatorJs();
		
		home.getCalculatorJs().click();
		calculatorPage.getvalueThree().click();
		calculatorPage.getplusButton().click();
		calculatorPage.getvalueSix().click();
//		Thread.sleep(3000);
		calculatorPage.getequallyButton().click();
//		Thread.sleep(3000);
		String result = calculatorPage.getResult().getAttribute("value");
		
		if(result.equals("9")){
			Assert.assertEquals("9", result);
			System.out.println("result is " + result);
		}else {
			System.out.println("wrong result");
			Assert.assertFalse(true);
			
			
		}
//		Assert.assertEquals("8", result);
		
	}

}
