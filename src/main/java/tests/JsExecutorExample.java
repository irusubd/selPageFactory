package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsExecutorExample extends BaseTest{
	
//	@Test
	public void testJs() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//		jse.executeScript("arguments[0].click()", app.navMenu.searchIcon);
//		jse.executeScript("arguments[0].value='cooking'", app.navMenu.searchInput);
//		jse.executeScript("arguments[0].click()", app.navMenu.searchIcon);
		
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");

		Thread.sleep(2000);

		String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerHTML").toString();
		System.out.println(bookTitle);
		
		Thread.sleep(2000);
		
		String pageTitle = jse.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		
		Thread.sleep(2000);
		
		String pageUrl = jse.executeScript("return document.URL").toString();
		System.out.println(pageUrl);
		
		jse.executeScript("window.schimbTitlu = function(){document.title= 'Title changed';};"
				+"window.schimbTitlu.call();");
		
		String pageTitleSchimbat = jse.executeScript("return document.title").toString();
		System.out.println(pageTitleSchimbat);

	}
	
//	@Test
	public void testJs2() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.navigate().to("https://keyfood.ro");
		Thread.sleep(2000);
		
		jse.executeScript("window.location = 'https://emag.ro'");
		Thread.sleep(2000);
		
		jse.executeScript("window.history.go(-1)");
		Thread.sleep(2000);
		
		jse.executeScript("window.history.forward(-1)");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
		
	}

//	@Test
	public void testJs3() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0, 2500);");
		Thread.sleep(2000);
//		jse.executeScript("document.getElementsByClassName('sc_emailer_button')[0].scrollIntoView()");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.cssSelector("input[value='Sign up']"));
		jse.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void testJs4() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		long startTime = System.currentTimeMillis();
		System.out.println("start: " + startTime);
		
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
		
		long endTime = System.currentTimeMillis();
		System.out.println("stop: " + endTime);
		System.out.println("diff: " + (endTime-startTime));
		
		
	}
}
