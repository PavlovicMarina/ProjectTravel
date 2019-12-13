package travelsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCustomer extends BasicPage {

	public TravelsCustomer(WebDriver driver) {
		super(driver);
	}

	private By accounts = By.cssSelector("a[href=\"#ACCOUNTS\"]");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By edit = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-list-container > table > tbody > tr:nth-child(6) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.btn.btn-default.btn-xcrud.btn.btn-warning");
	private By firstName = By.name("fname");
	private By lastName = By
			.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(2) > div > input");
	private By email = By.name("email");
	private By mobile = By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[5]/div/input");
	private By country = By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]");
	private By country1 = By.className("select2-input");
	private By address = By.name("address1");
	private By status = By.name("status");
	private By checkbox = By.cssSelector(
			"#content > form > div > div.panel-body > div > div:nth-child(13) > div > div > label > input");
	private By submit = By.xpath("//*[@id=\"content\"]/form/div/div[3]/button");
	private By search = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div.xcrud > div > div.xcrud-ajax > div.xcrud-nav > a");
	private By searchField = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > span.xcrud-search.form-inline > input");
	private By go = By.cssSelector("a.xcrud-action.btn.btn-primary");
	

	public WebElement getaccounts() {
		return this.driver.findElement(accounts);
	}

	public WebElement getcustomers() {
		return this.driver.findElement(customers);
	}

	public WebElement getedit() {
		return this.driver.findElement(edit);
	}

	public WebElement getfirstName() {
		return this.driver.findElement(firstName);
	}

	public WebElement getlastName() {
		return this.driver.findElement(lastName);
	}

	public WebElement getemail() {
		return this.driver.findElement(email);
	}

	public WebElement getmobile() {
		return this.driver.findElement(mobile);
	}

	public WebElement getcountry() {
		return this.driver.findElement(country);
	}

	public WebElement getcountry1() {
		return this.driver.findElement(country1);
	}

	public WebElement getaddress() {
		return this.driver.findElement(address);
	}

	public WebElement getstatus() {
		return this.driver.findElement(status);
	}

	public WebElement getsearch() {
		return this.driver.findElement(search);
	}

	public WebElement getsearchField() {
		return this.driver.findElement(searchField);
	}

	public WebElement getgo() {
		return this.driver.findElement(go);
	}

	public void clickaccounts() {
		this.driver.findElement(accounts).click();
	}

	public void clickCustomers() {
		this.driver.findElement(customers).click();
	}

	public void clickEdit() {
		this.driver.findElement(edit).click();
	}

	public void FirstName() {
		this.getfirstName().clear();
		this.getfirstName().sendKeys("Mikica");
	}

	public void LasttName() {
		this.getlastName().clear();
		this.getlastName().sendKeys("Mikic");
	}

	public void Email() {
		this.getemail().clear();
		this.getemail().sendKeys("felisif496@xmail365.net");
	}

	public void Mobile() {
		this.getmobile().clear();
		this.getmobile().sendKeys("023654789");
	}

	public void clickCountry() {
		this.driver.findElement(this.country).click();
		WebElement cont = driver.findElement(this.country1);
		cont.sendKeys("Madagascar");
		cont.sendKeys(Keys.ENTER);

	}

	public void Address() {
		this.getaddress().clear();
		this.getaddress().sendKeys("brrrrrrrr");
	}

	public void clickStatus() {
		WebElement selectstatus = driver.findElement(this.status);
		Select sstatus = new Select(selectstatus);
		sstatus.selectByVisibleText("Disabled");
	}

	public void clickCheckbox() {
		this.driver.findElement(this.checkbox).click();
	}

	public void clickSubmit() {
		this.driver.findElement(this.submit).click();
	}

	public void clicksearch() {
		this.driver.findElement(search).click();
	}
	public void clickSearchField() {
		this.getsearchField();
		this.getsearchField().sendKeys("Mikica Mikic");
	}
	
	public void clickgo() {
		this.driver.findElement(go).click();
	}
	

}
