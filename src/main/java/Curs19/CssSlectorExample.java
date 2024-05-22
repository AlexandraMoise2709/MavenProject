package Curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class CssSlectorExample extends BaseTest {
	

	
		//@Test
		public void cssSlectorExample1() {
	
		
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		
	//	browser.findElement(By.xpath("//img[@src='https://keybooks.ro/wp-content/uploads/2016/04/book2.jpg']");
		
	
		
		
		//not();
		
		WebElement tesst = browser.findElement(By.cssSelector("ul input:not([type='hidden'],[type='text'],[type='password'],[type='submit'])"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:14px solid green;')", tesst);
		
		
}
		@Test
		public void cssExample2() {
			JavascriptExecutor jse = (JavascriptExecutor) browser;
			browser.findElement(By.cssSelector("div[class='menu_main_wrap'] a[href='https://keybooks.ro/shop/']")).click();
			
			Actions action = new Actions(browser);
			action.scrollByAmount(0, 1200).perform();
			//action.click().doubleClick().dragAndDrop(null, null).wait().action.perform();
			WebElement category1 = browser.findElement(By.cssSelector("ul[class='product-categories']>li:first-child"));
			jse.executeScript("arguments[0].setAttribute"
					+ "('style', 'background:yellow; border:14px solid green;')", category1);
			
			//last chlld
			
			WebElement category11 = browser.findElement(By.cssSelector("ul[class='product-categories']>li:last-child"));
			jse.executeScript("arguments[0].setAttribute"
					+ "('style', 'background:yellow; border:14px solid green;')", category11);
			
			WebElement category5 = browser.findElement(By.cssSelector("ul[class='product-categories']>li:nth-child(5)"));
			jse.executeScript("arguments[0].setAttribute"
					+ "('style', 'background:yellow; border:14px solid green;')", category5);
			
			
			//selectez din n in n9n este ce nrvreau ue 
			//ul[class='product-categories']>li:nth-child(5n)
			//selectez din n in n pornind de la un anuit numar
			//ul[class='product-categories']>li:nth-child(2n+4)
			//ul[class='product-categories']>li:nth-child(2n+4)
			
			
			
			
		}
		}

			
		

