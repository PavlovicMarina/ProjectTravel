package travelsTests;

import org.junit.Assert;
import org.testng.annotations.Test;

import travelsPages.TitlePage;
import travelsPages.TravelsLoginPage;

public class TravelsLoginTest extends BasicTest {
	
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

	
}
