package SeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver browser;
	
	@BeforeClass
	public void setup() {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro");
		
		
	}
	
//	@AfterClass
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);//bad practice		
		browser.quit();
	}
	
	@Test
	public void login() {

		browser.findElement(By.linkText("My account")).click();
	}
	
}
