package travelsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsLoginPage extends BasicPage {

	public TravelsLoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By email = By.name("email");
	private By password = By.name("password");
	private By checkbox = By.cssSelector("body > div:nth-child(5) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div:nth-child(1) > div > div:nth-child(1) > label > div > ins");
	private By forget = By.cssSelector("#link-forgot > strong");
	private By logIn = By.cssSelector("body > div:nth-child(5) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button");
	
	
	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}

	
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	
	
	public void clickCheckbox() {
		this.driver.findElement(this.checkbox).click();
	}
	
	public void clickForget() {
		this.driver.findElement(this.forget).click();
	}
	
	public void clickLogin() {
		this.driver.findElement(this.logIn).click();
	}
	
	
	public void singIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password); 
		this.clickCheckbox();
		this.clickLogin();
		}

	


	

}
