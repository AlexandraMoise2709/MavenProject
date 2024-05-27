package Curs20;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class ExplicitWaitExample extends BaseTest {
	
	@Test
	public void implicitWait() throws InterruptedException {
		
	browser.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//asteapta ca elementul sa fie prezent in dom
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.textToBePresentInElement(By.cssSelector("div[id='finish']>h4")), "Hello world");
		
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
		
	}

	}

