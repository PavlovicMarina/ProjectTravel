package travelsTests;

import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsLoginPage;
import travelsPages.TravelsMenuPage;

public class TravelsMenuTest extends BasicTest {
	
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
	
	
	@Test(priority = 10)
	public void DashboardMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickDashboard();
		Thread.sleep(500);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));

	}

	@Test(priority = 11)
	public void UpdatesMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickUpdates();
		Thread.sleep(1000);
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Updates"));
	}

	@Test(priority = 12)
	public void ModulesMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickModules();
		Thread.sleep(1000);
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Modules"));
	}

	@Test(priority = 13)
	public void ToursMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickTours();
		tmp.clickaddNew();
		Thread.sleep(1000);
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Add Tour"));
	}

	@Test(priority = 14)
	public void CarsMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickCars();
		tmp.clickCars2();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Cars Management"));
	}

	@Test(priority = 15)
	public void CouponsMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickCoupons();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Coupon Codes Management");
	}

	@Test(priority = 16)
	public void NewsletterMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickNewsletter();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Newsletter Management"));
	}

	@Test(priority = 17)
	public void BookingsMenu() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickBookings();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Booking Management"));
	}

}
