package travelsPages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtrasPage extends BasicPage {

	public TravelsCarsExtrasPage(WebDriver driver) {
		super(driver);
	}

	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By extras = By.cssSelector("#Cars > li:nth-child(2) > a");
	private By add = By.cssSelector(".xcrud-top-actions > a.xcrud-action");
	private By picture = By.name("xcrud-attach");
	private By name = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-view > div > div:nth-child(2) > div > input");
	private By status = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-view > div > div:nth-child(3) > div > select");
	private By price = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-view > div > div:nth-child(4) > div > input");
	private By savereturn = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-top-actions.btn-group > a.btn.btn-primary.xcrud-action");

	

	public WebElement getcars() {
		return this.driver.findElement(cars);
	}

	public WebElement getextras() {
		return this.driver.findElement(extras);
	}

	public WebElement getadd() {
		return this.driver.findElement(add);
	}

	public WebElement getpicture() {
		return this.driver.findElement(picture);
	}

	public WebElement getname() {
		return this.driver.findElement(name);
	}

	public WebElement getstatus() {
		return this.driver.findElement(status);
	}

	public WebElement getprice() {
		return this.driver.findElement(price);
	}

	public WebElement getsavereturn() {
		return this.driver.findElement(savereturn);
	}


	public void clickCars() {
		this.driver.findElement(cars).click();
	}

	public void clickExtras() {
		this.driver.findElement(extras).click();
	}

	public void clickAdd() {
		this.driver.findElement(add).click();
	}

	public void UploadImage(String path) {
		getpicture().sendKeys(new File(path).getAbsolutePath());
	}

	public void clickName() {
		WebElement sName = this.getname();
		sName.sendKeys("Citroen");
		sName.sendKeys(Keys.ENTER);
	}

	public void clickStatus() {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		sStatus.selectByVisibleText("No");

	}

	public void clickPrice() {
		WebElement sprice = this.getprice();
		sprice.sendKeys("2000");
		sprice.sendKeys(Keys.ENTER);
	}

	public void LettersInPrice() {
		WebElement sprice = this.getprice();
		sprice.sendKeys("Marina");
		sprice.sendKeys(Keys.ENTER);
	}

	public void clickSave() {
		this.getsavereturn().click();
	}

	public boolean iscarAdded(String nameInput) {
		return this.driver.findElement(By.xpath("//td[contains(text(),'"+ nameInput +"')]")) != null;
	}
	
	

}
