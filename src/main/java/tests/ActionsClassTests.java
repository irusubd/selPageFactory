package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ActionsClassTests extends BaseTest{
	
//	@Test
	public void hoverElement() throws InterruptedException {
		
		app.loginPage.hoverElement(app.loginPage.loginPopUp);
		Thread.sleep(3000);
		
		app.navMenu.hoverElement(app.navMenu.blogLink);
		Thread.sleep(3000);
		
		app.navMenu.navigateTo(app.navMenu.postFormatsLink);
		
		assertTrue(app.navMenu.checkCurrentUrl("https://keybooks.ro/category/post-formats/"));
	}
	
//	@Test(priority = 1)
	public void sendKeys() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		
		
		action.moveToElement(app.postFormatsPage.searchField)
			.keyDown(Keys.SHIFT)
			.sendKeys(app.postFormatsPage.searchField,"abracadabra")
			.perform();
		Thread.sleep(5000);
	}
	
//	@Test
	public void sendKeysExample2() throws InterruptedException {
		app.navMenu.navigateTo(app.navMenu.contactsLink);
		Actions action = new Actions(driver);
		
		action.moveToElement(app.contactsPage.nameInput)
		.sendKeys(app.contactsPage.nameInput, "Numele meu")
		.sendKeys(Keys.TAB, "abc@abc.com")
		.sendKeys(Keys.TAB, "Subiectul mesajului meu")
		.sendKeys(Keys.TAB, "Mesajul meu")
		.sendKeys(Keys.TAB, Keys.ENTER)
		.perform();
		
		Thread.sleep(5000);
	}
	
//	@Test
	public void dragAndDropTest() throws InterruptedException {
		
		app.navMenu.navigateTo(app.navMenu.shopLink);
		Thread.sleep(3000);
		app.shopPage.dragAndDrop(app.shopPage.sliderInitialPosition, 100, 0);
		Thread.sleep(3000);
		app.shopPage.dragAndDrop(app.shopPage.sliderFinalPosition, -100, 0);
		Thread.sleep(3000);
	}

	@Test
	public void moveByOffset() throws InterruptedException {
		
		app.navMenu.navigateTo(app.navMenu.contactsLink);
		
		int x = app.contactsPage.nameInput.getLocation().getX();
		System.out.println("X: "+x);
		
		int y = app.contactsPage.nameInput.getLocation().getY();
		System.out.println("Y: "+y);
		
		Actions action = new Actions(driver);
		action.moveByOffset(x, y)
		.click()
		.sendKeys("test ceva")
		.perform();
		
		Thread.sleep(3000);
				
	}
}
