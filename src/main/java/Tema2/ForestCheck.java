package Tema2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ForestCheck {
	public WebDriver browser;
	
	@Test
	public void verificaCartea() {
		
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro");
		
		

		List<WebElement> menuCategorii = browser.findElements(By.className("sc_tabs_title"));
		WebElement bookForest = browser.findElement(By.xpath("//img[@src='https://keybooks.ro/wp-content/uploads/2016/04/book2.jpg']"));
			
		for (int i = 0; i < menuCategorii.size(); i++) {
            WebElement element = menuCategorii.get(i);			
			element.click();			
			assertTrue(bookForest.isDisplayed());
			
			if(i == menuCategorii.size()-1) {
				WebElement clickPeCarte = browser.findElement(By.partialLinkText("forest"));
				clickPeCarte.click();
				assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/the-forest/");
			}
			
		
		}
		
	}

}
