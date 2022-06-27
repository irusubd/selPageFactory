package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class SortTest extends BaseTest{
	
	@Test
	public void shopPageSort() {
		app.navMenu.navigateTo(app.navMenu.shopLink);
		app.shopPage.sortBooks("price");
		assertTrue(app.shopPage.compareFirstLast());
	}
	
	

}
