package travelsTests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsCarsExtrasPage;
import travelsPages.TravelsCarsPage;
import travelsPages.TravelsCustomer;
import travelsPages.TravelsLoginPage;
import travelsPages.TravelsMenuPage;

public class MainTest extends BasicTest {

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

	@Test(priority = 20)
	public void CarList() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickCars();
		tmp.clickCars2();
		Thread.sleep(2000);
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Cars Management"));
		
	}

	@Test(priority = 21)
	public void CarList10() throws InterruptedException {

		TravelsCarsPage tcp = new TravelsCarsPage(driver);

		tcp.Cars10();
		Thread.sleep(2000);

		Assert.assertEquals(tcp.Cars10(), false);

	}

	@Test(priority = 25)
	public void CarList50() throws InterruptedException {

		TravelsCarsPage tcp = new TravelsCarsPage(driver);

		tcp.OrderMore50();
		Thread.sleep(2000);

		Assert.assertEquals(tcp.OrderMore50(), false);
	}

	@Test(priority = 30)
	public void AddingCar() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsCarsExtrasPage tcep = new TravelsCarsExtrasPage(driver);
		tcep.clickCars();
		tcep.clickExtras();
		tcep.clickAdd();
		Thread.sleep(2000);

		tcep.UploadImage("Images\\Car.png");
		Thread.sleep(2000);

		tcep.clickName();
		tcep.clickStatus();
		Thread.sleep(2000);

		tcep.clickPrice();
		tcep.clickSave();
		Thread.sleep(1000);
		
		Assert.assertTrue(tcep.iscarAdded("Citroen"));
	}

	@Test(priority = 31)
	public void Customers() throws InterruptedException, IOException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsCustomer tc = new TravelsCustomer(driver);
		tc.clickaccounts();
		Thread.sleep(100);
		
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
