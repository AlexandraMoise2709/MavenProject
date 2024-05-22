package Curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class IsEnabled extends BaseTest {
	
	@Test
	public void isEnabled() {
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		
		WebElement passField = browser.findElement(By.cssSelector("input[name='pwd']"));
		
		System.out.println(passField.isEnabled());
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('disabled', ' ')", passField);
		
		passField.sendKeys("Test");
		
		System.out.println(passField.isEnabled());
	}

}
