package travelsTests;

import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsCarsExtrasPage;
import travelsPages.TravelsLoginPage;

public class TravelsCarsExtrasTest extends BasicTest {
	
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
	
	
	
}
