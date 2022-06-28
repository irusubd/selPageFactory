package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers{
	
	public AudioPostPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "span[class='mejs-time-current']") public WebElement songSlider;
	@FindBy(css = "div[class='mejs-horizontal-volume-current']") public WebElement volumeSlider;
	@FindBy(css = "div[class='mejs-button mejs-playpause-button mejs-play']") public WebElement playButton;
	
	@FindBy(css = "span[class='mejs-time-total mejs-time-slider']") public WebElement currentPosition;
	@FindBy(css = "a[class='mejs-horizontal-volume-slider']") public WebElement currentVolume;
	
	public void adjustPlayerSettings() {
		Actions action = new Actions(driver);
		
		action.doubleClick(playButton) // sliderul nu se muta pana nu se face play
		.dragAndDropBy(songSlider, 200, 0)
		.dragAndDropBy(volumeSlider, 50, 0)
		.perform();
		
	}
	
}
