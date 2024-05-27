package Curs20;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class ImplicitWaitExample extends BaseTest {
	
	@Test
	public void implicitWaits() throws InterruptedException {
		
		
		
		//asteapta ca elementul sa fie prezent in dom
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		
		/Thread.sleep(5000);//bad practice
		
		
		assertEquals(finishText.getText(), "Hello World!");
		
	}
	
	
}
