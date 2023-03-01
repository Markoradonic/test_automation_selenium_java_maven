package automationtesting.co.uk;

import java.io.IOException;

import org.testng.annotations.Test;

import action.Action;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.TestStorePage;

public class TC_0001_Login_Functionality extends Hooks{
	
	public TC_0001_Login_Functionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void corectUsernameAndPassword () throws IOException {
		Homepage home = new Homepage();
		Action action = new Action();
		LoginPage loginPage = new LoginPage();
		TestStorePage testStorePage = new TestStorePage();
		
		action.scrollToElement(home.getTestStore());
		home.getTestStore().click();
		
		testStorePage.getSignNavbarButton().click();
		
		loginPage.getLoginField().sendKeys("test@test.com");
		loginPage.getPasswordField().sendKeys("test123");
		loginPage.getSignInButton().click();
		
		

	}
}
