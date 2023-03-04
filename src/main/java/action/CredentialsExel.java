package action;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CredentialsExel {
	
	private XSSFSheet customSheet(int i) throws IOException {
		FileInputStream locationForCredentials = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\credentials.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(locationForCredentials);
		XSSFSheet sheet = workbook.getSheetAt(i);
		return sheet;

	}

	public Row getRowAndSheet(int i, int y) throws IOException {
		/*
		 * When calling the function, the first parameter is the row and the second
		 * parameter is the sheet.
		 */

		XSSFSheet sheet = customSheet(y);

		Row row1 = sheet.getRow(i);
		return row1;

	}
}
