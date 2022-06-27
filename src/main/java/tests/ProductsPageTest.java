package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class ProductsPageTest extends BaseTest{
	
	@Test
	public void checkProductPageElements() {
		app.navMenu.navigateTo(app.navMenu.shopLink);
		app.shopPage.openRandomBook();
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(app.productPage.bookGallery.isDisplayed());
		sa.assertTrue(app.productPage.bookRating.isDisplayed());
		sa.assertTrue(app.productPage.bookTitle.isDisplayed());
		sa.assertTrue(app.productPage.bookPrice.isDisplayed());
		sa.assertTrue(app.productPage.bookQuantity.isDisplayed());
		sa.assertTrue(app.productPage.bookDescription.isDisplayed());
		sa.assertTrue(app.productPage.bookAddToCart.isDisplayed());
		sa.assertTrue(app.productPage.bookMeta.isDisplayed());
		sa.assertAll();
	}

}
