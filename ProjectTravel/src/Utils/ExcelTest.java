package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsLoginPage;
import travelsTests.BasicTest;

public class ExcelTest extends BasicTest {
	
	
	private String baseUrl = "https://www.phptravels.net/admin";
	
	
	@Test (priority = 2)
	public void LoginExcell() throws InterruptedException, IOException {
		driver.get(baseUrl);
		Thread.sleep(2000);

	    File file = new File("Username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String Username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();

		TravelsLoginPage tlp = new TravelsLoginPage(driver);
		tlp.singIn(Username, password);
		Thread.sleep(2000);
		wb.close();

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));
	}

}
