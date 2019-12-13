package travelsTests;

import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsCustomer;
import travelsPages.TravelsLoginPage;

public class TravelsCustomerTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";
	
	
	@Test
	public void Login() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLoginPage tlp = new TravelsLoginPage(driver);
	    tlp.singIn("admin@phptravels.com", "demoadmin");
	    Thread.sleep(3000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Dashboard");
	}
	

	@Test(priority = 31)
	public void Customers() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsCustomer tc = new TravelsCustomer(driver);
		tc.clickaccounts();

		tc.clickCustomers();
		tc.clickEdit();
		Thread.sleep(2000);
		tc.FirstName();
		Thread.sleep(500);
		tc.LasttName();
		Thread.sleep(500);
		tc.Email();
		Thread.sleep(1000);
		tc.Mobile();
		Thread.sleep(500);
		tc.clickCountry();
		Thread.sleep(500);
		tc.Address();
		Thread.sleep(500);
		tc.clickStatus();
		Thread.sleep(500);
		tc.clickCheckbox();
		Thread.sleep(500);
		tc.clickSubmit();
		Thread.sleep(500);
		
		tc.clicksearch();
		tc.clickSearchField();
		tc.clickgo();
		Thread.sleep(500);
		
		Assert.assertFalse(tc.getcustomers().getText().contains("Mikica Mikic"));
	}

}
