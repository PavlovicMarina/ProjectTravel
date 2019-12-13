package travelsTests;

import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsCarsPage;
import travelsPages.TravelsLoginPage;
import travelsPages.TravelsMenuPage;

public class TravelsCarsTest extends BasicTest {
	
	private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test
	public void Login() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLoginPage tlp = new TravelsLoginPage(driver);
	    tlp.singIn("admin@phptravels.com", "demoadmin");
	    Thread.sleep(3000);
	    
		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));

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
}
