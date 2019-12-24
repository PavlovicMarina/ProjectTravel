package travelsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCarsPage extends BasicPage {

	public TravelsCarsPage(WebDriver driver) {
		super(driver);
	}
	
	private By cars = By.cssSelector(".xcrud-row");
	private By cars1 = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By cars2 = By.cssSelector("#Cars > li:nth-child(1) > a");
	private List<WebElement> listCars = driver.findElements(this.cars);
	private By orders = By.cssSelector(".form-control.input-sm");


	public WebElement getcars() {
		return this.driver.findElement(cars1);
	}

	public WebElement getCars2() {
		return this.driver.findElement(cars2);
	}

	public void ClickCars() {
		this.getcars().click();
	}

	public void ClickCars2() {
		this.getCars2().click();
	}

	public boolean Cars10() {
		boolean cars1 = false;
		if (listCars.size() == 10) {
			cars1 = true;
		}
		return cars1;
	}

	public boolean OrderMore50() {
		boolean orders = false;
		int sumOrder = 0;
		WebElement orderNumber = driver.findElement(this.orders);
		List<WebElement> cars = driver.findElements(this.orders);
		for (int i = 0; i < cars.size(); i++) {
			String str = cars.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sumOrder += number;
		}
		if (sumOrder > 50) {
			orders = true;
		}
		return orders;
	}

}
