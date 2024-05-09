package Curs15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	public void openBrowser() {
		
		//FireFoxDriver();
		//EdgeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.emag.ro");
		
		
			}

}
