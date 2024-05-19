package Tema2;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Login  {
	
	public WebDriver browser;
	
	@Test
	public void checkLogin() {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro");
		

	 WebElement	login = browser.findElement(By.className("menu_user_login"));
	 assertTrue(login.isDisplayed());
	 login.click();
	
	 
	 WebElement user = browser.findElement(By.id("log"));
	 assertTrue(user.isDisplayed());
	 //user.click();
	 
	 WebElement pass = browser.findElement(By.id("password"));
	 assertTrue(pass.isDisplayed());
	 //pass.click();
	 
	 
	 
	}


}