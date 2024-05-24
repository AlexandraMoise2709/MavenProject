package Tema3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HomeWorkBaseTest {

	
public WebDriver browser;
	
	@BeforeClass
	public void setup() {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro/contacts/");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException  {
		Thread.sleep(5000);//bad practice
		browser.quit();
	}

	
	
}
