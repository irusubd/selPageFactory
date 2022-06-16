package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseTest;
import utils.SeleniumWrappers;

public class NavMenuPage extends SeleniumWrappers {

	public WebDriver driver;

	public NavMenuPage(WebDriver driver) {
//		this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// public By shopLink = By.linkText("BOOKS");
	// driver.findelement(shopLink);

	@FindBy(linkText = "BOOKS")
	public WebElement shopLink;
	@FindBy(linkText = "CONTACTS")
	public WebElement contactsLink;
	@FindBy(css = "li[class='menu_user_login']")
	public WebElement loginPopUp;

	public void navigateTo(WebElement element) {
		element.click();
	}
}
