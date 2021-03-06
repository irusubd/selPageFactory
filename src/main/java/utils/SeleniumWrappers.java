package utils;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestException;

public class SeleniumWrappers {

	public WebDriver driver;

	public SeleniumWrappers(WebDriver driver) {
		this.driver = driver;
	}
	
	public void dragAndDrop(WebElement element, int xOffset, int yOffset) {
		Actions action = new Actions(driver);
		action.moveToElement(element)
		.dragAndDropBy(element, xOffset, yOffset)
		.perform();
	}
	
	public void hoverElement(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Log.info("move to element");
		
	}
	
	public boolean checkCurrentUrl(String expectedUrl) {
		if(driver.getCurrentUrl().equals(expectedUrl)) {
			return true;
		}else {
			return false;
		}
	}

	public void sendKeys(WebElement element, String keysToSend) {

		try {
			waitForElementToBeDisplayed(element);
			element.clear();
			element.sendKeys(keysToSend);

		} catch (Exception e) {
			// Log
			throw new TestException("Error in sending keys!");
		}

	}

	public void waitForElementToBeDisplayed(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		} catch (NoSuchElementException e) {
			// log
			// retry
		}

	}
	
	public void click(WebElement element) {
		try {
			//Log.info("Called method click on <element>")
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		} catch (NoSuchElementException e) {
			Log.error("Click method failed");
			Log.error(e.fillInStackTrace());
		}
	}
}
