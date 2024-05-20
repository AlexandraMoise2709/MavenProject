package Curs18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class RelativeLocatorsExample extends BaseTest {
/*
 * toLeftOF
 * toRightOF
 * above
 * below
 * near
 * 
 * 
 */
	
	@Test
	public void relativeLocatorsExmple() {
		
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		//toLeftOf
		
		WebElement price = browser.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")). toLeftOf(By.cssSelector("a[href*='garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", price);
		
		WebElement price2 = browser.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")). toRightOf(By.cssSelector("a[href*='garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", price2);
		
		WebElement price3 = browser.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")). below(By.cssSelector("a[href*='garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", price3);
		
		//above
		
		WebElement author = browser.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']")). above(price));
		jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border:4px solid green;')", author);
		
	}
}

