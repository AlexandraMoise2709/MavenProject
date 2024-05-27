package Curs20;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class JsAlertExample extends BaseTest {

	
	
	@Test(priority=2)
	
	public void jsAlertExample() throws InterruptedException{
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='simpleBtn']>button")).click();
		
		browser.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		assertEquals(resultText.getText(),"You did it.....!");
	}
	@Test(priority=1)
	public void confirm() throws InterruptedException{
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='confirmBtn']>button")).click();
		
		browser.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		assertEquals(resultText.getText(),"You pressed Cancel!");
	}
	
	
	@Test(priority=3)
	public void promptJsAlert() throws InterruptedException{
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='promptBtn']>button")).click();
		
		browser.switchTo().alert().sendKeys("Harry Potter");
		Thread.sleep(5000);

		browser.switchTo().alert().accept();
		Thread.sleep(5000);
		
		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		assertEquals(resultText.getText(),"Hello Harry Potter! How are you today?");
	}
}
