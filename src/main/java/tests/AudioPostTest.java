package tests;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import utils.BaseTest;

public class AudioPostTest extends BaseTest{
	
	@Test
	public void moveSomeSliders() throws InterruptedException {
		app.navMenu.hoverElement(app.navMenu.blogLink);
		app.navMenu.navigateTo(app.navMenu.postFormatsLink);
		app.navMenu.navigateTo(app.postFormatsPage.audioPost);
		
		app.audioPostPage.adjustPlayerSettings();
		
		assertFalse(app.audioPostPage.currentPosition.getAttribute("aria-valuetext").equals("00:00"));
		assertFalse(app.audioPostPage.currentVolume.getAttribute("aria-valuetext").equals("80%"));
		
	}

}
