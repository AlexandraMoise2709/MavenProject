package Curs20;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import SeleniumUtils.BaseTest;

public class FluentWaitExample extends BaseTest {

	public void fluentWaitExample() {
		
		
		//asteapta ca elementul sa fie prezent in dom
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(browser)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
		
		//wait.until(ExpectedCondition.text
			
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		
	
		
		
		assertEquals(finishText.getText(), "Hello World!");
		
		
	}
}
