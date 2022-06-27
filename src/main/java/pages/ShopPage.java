package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{

	public ShopPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "span[style='left: 0%;']") public WebElement sliderInitialPosition;
	@FindBy(css = "span[style='left: 100%;']") public WebElement sliderFinalPosition;
	@FindBy(name = "orderby") public WebElement sortDropdown;

	@FindBy(xpath = "//span[@class='woocommerce-Price-amount amount'][not(ancestor::del)]") public List<WebElement> booksPriceList;
	@FindBy(xpath = "//h2[@class='woocommerce-loop-product__title']") public List<WebElement> booksTitleList;

	
	public void sortBooks(String criteria) {
		Select dropdown = new Select(sortDropdown);
		dropdown.selectByValue(criteria);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://keybooks.ro/shop/?orderby=" + criteria));
	}
	
	public boolean compareFirstLast() {
		
		double firstPrice = Double.parseDouble(booksPriceList.get(0).getText().replace("$", ""));
		double lastPrice = Double.parseDouble(booksPriceList.get(booksPriceList.size()-1).getText().replace("$", ""));
		return firstPrice < lastPrice;
	}
	
	public void openRandomBook() {
		Random rand = new Random();
		booksTitleList.get(rand.nextInt(booksTitleList.size())).click();
	}
	

}
