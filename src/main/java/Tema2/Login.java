package Tema2;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Login  {
	
	public WebDriver browser;
	
	@Test
	public void checkLogin() throws InterruptedException {
	
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro");
		

	 WebElement	login = browser.findElement(By.cssSelector("a[href='#popup_login']"));
	 assertTrue(login.isDisplayed());
	
	 
	 WebElement user = browser.findElement(By.cssSelector("input[type='text']"));
	 WebElement pass = browser.findElement(By.cssSelector("input[type='password']"));
	 
	 assertFalse(user.isDisplayed());
	 assertFalse(pass.isDisplayed());
	 

		
	 login.click();
	 
	 Thread.sleep(5000);
	 
	 assertTrue(user.isDisplayed());
	 assertTrue(pass.isDisplayed());
	 

	}


}