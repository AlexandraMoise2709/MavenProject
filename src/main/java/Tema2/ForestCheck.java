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
	public void verificaCartea() throws InterruptedException {
		
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro");
		
		

		List<WebElement> menuCategorii = browser.findElements(By.className("sc_tabs_title"));
		
			
		for (int i = 0; i < menuCategorii.size(); i++) {
            WebElement element = menuCategorii.get(i);
            
            Thread.sleep(1000);
					
		
			
			WebElement bookForest = browser.findElement(By.cssSelector("div[aria-hidden='false'] a[href='the-forest']"));
			assertTrue(bookForest.isDisplayed());
			
			element.click();	
			
            if(i == menuCategorii.size()-1) {

                WebElement clickPeCarte = browser.findElement(By.cssSelector("div[aria-hidden='false'] a[href='the-forest']"));
                Thread.sleep(3000);

                clickPeCarte.click();
                
                Thread.sleep(3000);

                assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/the-forest/");

                }

           }
			
		
		}
		
	}


