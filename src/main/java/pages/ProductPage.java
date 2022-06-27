package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class ProductPage extends SeleniumWrappers{
	
	public ProductPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[class='woocommerce-product-gallery__trigger']") public WebElement bookGallery;
	@FindBy(css = "div[class='woocommerce-product-rating']") public WebElement bookRating;
	@FindBy(css = "h1[class='product_title entry-title']") public WebElement bookTitle;
	@FindBy(css = "p[class='price']") public WebElement bookPrice;
	@FindBy(css = "div[class='quantity']") public WebElement bookQuantity;
	@FindBy(css = "div[class='woocommerce-product-details__short-description']") public WebElement bookDescription;
	@FindBy(css = "button[name='add-to-cart']") public WebElement bookAddToCart;
	@FindBy(css = "div[class='product_meta']") public WebElement bookMeta;

}
