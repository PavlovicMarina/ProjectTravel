package travelsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenuPage extends BasicPage {

	public TravelsMenuPage(WebDriver driver) {
		super(driver);
	}

	private By dashboard = By.cssSelector("#social-sidebar-menu > li:nth-child(1) > a > strong");
	private By updates = By.cssSelector("#social-sidebar-menu > li:nth-child(2) > a > span:nth-child(2)");
	private By modules = By.cssSelector("#social-sidebar-menu > li:nth-child(3) > a");
	private By tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9) > a");
	private By addNew = By.cssSelector("a[href=\"https://www.phptravels.net/admin/tours/add\"]");
	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By cars2 = By.cssSelector("a[href=\"https://www.phptravels.net/admin/cars\"]");
	private By coupons = By.cssSelector("#social-sidebar-menu > li:nth-child(15) > a");
	private By newsletter = By.cssSelector("#social-sidebar-menu > li:nth-child(16) > a");
	private By bookings = By.cssSelector("#social-sidebar-menu > li:nth-child(17) > a");

	public WebElement getdashboard() {
		return this.driver.findElement(dashboard);
	}

	public WebElement getupdates() {
		return this.driver.findElement(updates);
	}

	public WebElement getmodules() {
		return this.driver.findElement(modules);
	}

	public WebElement gettours() {
		return this.driver.findElement(tours);
	}

	public WebElement getaddNew() {
		return this.driver.findElement(addNew);
	}

	public WebElement getcars() {
		return this.driver.findElement(cars);
	}

	public WebElement getcars2() {
		return this.driver.findElement(cars2);
	}

	public WebElement getcoupons() {
		return this.driver.findElement(coupons);
	}

	public WebElement getnewsletter() {
		return this.driver.findElement(newsletter);
	}

	public WebElement getbookings() {
		return this.driver.findElement(bookings);
	}

	public void clickDashboard() {
		this.driver.findElement(dashboard).click();
	}

	public void clickUpdates() {
		this.driver.findElement(updates).click();
	}

	public void clickModules() {
		this.driver.findElement(modules).click();
	}

	public void clickTours() {
		this.driver.findElement(tours).click();
	}

	public void clickaddNew() {
		this.driver.findElement(addNew).click();
	}

	public void clickCars() {
		this.driver.findElement(cars).click();
	}

	public void clickCars2() {
		this.driver.findElement(cars2).click();
	}

	public void clickCoupons() {
		this.driver.findElement(coupons).click();
	}

	public void clickNewsletter() {
		this.driver.findElement(newsletter).click();
	}

	public void clickBookings() {
		this.driver.findElement(bookings).click();
	}

}
