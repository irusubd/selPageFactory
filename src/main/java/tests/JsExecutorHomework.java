package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsExecutorHomework extends BaseTest{

	@Test
	public void executorHomework() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("var objObject = document.createEvent('MouseEvents');" +
				"objObject.initMouseEvent('mouseover',true);" +
				"document.getElementById('menu-item-76').dispatchEvent(objObject);");
		
		jse.executeScript("document.getElementById('menu-item-232').childNodes[0].click();");
		
		jse.executeScript("document.getElementsByClassName('post_title')[4].scrollIntoView();");

		jse.executeScript("document.getElementsByClassName('post_title')[4].childNodes[0].click();");
		
		jse.executeScript("document.getElementById('comment').scrollIntoView();");

		jse.executeScript("document.getElementById('comment').value='Salutare!';");
		jse.executeScript("document.getElementById('author').value='Alex Rusu';");
		jse.executeScript("document.getElementById('email').value='gmail@irusu.com';");
		jse.executeScript("document.getElementById('url').value='http://google.com';");

		jse.executeScript("document.getElementById('send_comment').click();");
		
		
		
		

	}
	
}
