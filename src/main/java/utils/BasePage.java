package utils;

import pages.AudioPostPage;
import pages.ContactsPage;
import pages.EventsPage;
import pages.LoginPage;
import pages.NavMenuPage;
import pages.PageFormatsPage;
import pages.ProductPage;
import pages.ShopPage;
import pages.SingleEventPage;

public class BasePage extends BaseTest {

	public NavMenuPage navMenu = new NavMenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	public PageFormatsPage postFormatsPage = new PageFormatsPage(driver);
	public ContactsPage contactsPage = new ContactsPage(driver);
	public ShopPage shopPage = new ShopPage(driver);
	public ProductPage productPage = new ProductPage(driver);
	public AudioPostPage audioPostPage = new AudioPostPage(driver);
	public EventsPage eventsPage = new EventsPage(driver);
	public SingleEventPage singleEventPage = new SingleEventPage(driver);
	
	public SeleniumWrappers se = new SeleniumWrappers(driver);

}
