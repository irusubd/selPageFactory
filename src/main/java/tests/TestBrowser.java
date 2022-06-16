package tests;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import utils.BaseTest;

public class TestBrowser extends BaseTest {
	
	@Test
	public void testSetup() {
		System.out.println(driver.getTitle());
		
//		NavMenuPage navMenu = new NavMenuPage(driver);
//		navMenu.navigateTo(navMenu.contactsLink);
		
		app.navMenu.navigateTo(app.navMenu.contactsLink);
//		app.loginPage.loginInApp();
		
	}

}
