package automationtesting.co.uk;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
		
		FileInputStream locationForCredentials = new FileInputStream(System.getProperty("user.dir") + 
				"\\src\\main\\java\\resources\\credentials.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(locationForCredentials);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row1 = sheet.getRow(1);
		Cell cellR1C0 = row1.getCell(0);
		Cell cellR1C1 = row1.getCell(1);
		
		String userNameRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();
				
		loginPage.getLoginField().sendKeys(userNameRow1);
		loginPage.getPasswordField().sendKeys(passwordRow1);
		loginPage.getSignInButton().click();
		
		

	}
}
