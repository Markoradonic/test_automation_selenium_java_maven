package automationtesting.co.uk;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import action.Action;
import action.CredentialsExel;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.TestStorePage;

public class TC_0001_Login_Functionality extends Hooks {

	public TC_0001_Login_Functionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=1)
	public void correctUsernameAndPassword() throws IOException {
		Homepage home = new Homepage();
		Action action = new Action();
		LoginPage loginPage = new LoginPage();
		TestStorePage testStorePage = new TestStorePage();
		CredentialsExel exelCred = new CredentialsExel();

		action.scrollToElement(home.getTestStore());
		home.getTestStore().click();

		testStorePage.getSignNavbarButton().click();

//		getSheetAndGetRow(Row, Sheet);
//		String userNameRow1 = exelCred.getRowAndSheet(1, 0).getCell(0).toString();
		String passwordRow1 = exelCred.getRowAndSheet(1, 0).getCell(1).toString();

		loginPage.getLoginField().sendKeys(userNameRow1);
		loginPage.getPasswordField().sendKeys(passwordRow1);
		loginPage.getSignInButton().click();

		String originalTitle = getDriver().getTitle();
		String expectedTitle = "My account";

		Assert.assertEquals(originalTitle, expectedTitle);
		Reporter.log("Test pass, user can login with correct Username and Password", true);
		loginPage.getSignOutButton().click();

	}

	@Test(priority=2)
	public void incorrectUsernameAndPassword() throws IOException {
		Homepage home = new Homepage();
		Action action = new Action();
		LoginPage loginPage = new LoginPage();
		TestStorePage testStorePage = new TestStorePage();
		CredentialsExel exelCred = new CredentialsExel();

		action.scrollToElement(home.getTestStore());
		home.getTestStore().click();

		testStorePage.getSignNavbarButton().click();

//		getSheetAndGetRow(Row, Sheet);
		String userNameRow2 = exelCred.getRowAndSheet(2, 0).getCell(0).toString();
		String passwordRow2 = exelCred.getRowAndSheet(2, 0).getCell(1).toString();

		loginPage.getLoginField().sendKeys(userNameRow2);
		loginPage.getPasswordField().sendKeys(passwordRow2);
		loginPage.getSignInButton().click();
		
		String alertMessage = loginPage.getAlertMessage().getText();
		String expectedAlertMessage = "Authentication failed.";
		
		assertEquals(alertMessage, expectedAlertMessage);
		
		Reporter.log("Test pass, user cannot login with incorrect Username and Password", true);

	}
}
