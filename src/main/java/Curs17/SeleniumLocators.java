package Curs17;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class SeleniumLocators extends BaseTest{
	
	/*
	 * tagname
	 * linktext
	 * partialLinkTest
	 * class
	 * id
	 * name
	 * css Selector
	 * Xpath
	 * 
	 
	 * 
	 */
	
	/*
	 * relative locators
	 * 
	 * toLeftOf()
	 * toRightOf()
	 * above();
	 * below();
	 * near();
	 * 
	 */
	@Test(priority = 1)
	public void tagNameLocator() {
		//<em>Discover</em>
		WebElement discoverText = browser.findElement(By.tagName("em"));
		String text = discoverText.getText();//returneaza textul dintre tagurile html
		System.out.println(text);
		assertEquals(text, "Discover");
		
	}
	
	@Test(priority=2)
	public void linkTextLocator() {
		
		//<a href="https://keybooks.ro/shop/">Books</a>
		
		WebElement shopLink= browser.findElement(By.linkText("BOOKS"));
		shopLink.click();
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/");
		
	}
	@Test(priority=3)
	public void partialLinkTextLocator() {
		//<a href="https://keybooks.ro/shop/a-banquet-of-mouse/">A banquet of  mouse</a>
		
		WebElement book = browser.findElement(By.partialLinkText("banquet"));
		book.click();
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/a-banquet-of-mouse/");
		
	}
	@Test(priority=3)
	public void classNameLocator() {
		
		WebElement price = browser.findElement(By.className("price"));
		
		System.out.println(price.getText());
		
		assertTrue(price.getText().contains("9.99"));
		
		
	}
	
	@Test(priority=5)
	public void idLocator() {
		
		WebElement reviewTab = browser.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
		
		WebElement commentBox= browser.findElement(By.id("comment"));
		
		assertTrue(commentBox.isDisplayed());
		
	}
	
	/*
	 * isDisplayed()-> un eleent este vizibil
	 * isEnabled () - >verifica daca un element este enbled
	 * isSlected() -->doar pt checkbox sau radio button
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test(priority=6)
	public void numeLocator() throws InterruptedException {
		
		WebElement commentBox = browser.findElement(By.name("comment"));
		commentBox.sendKeys("My super message");
		Thread.sleep(3000);
		commentBox.clear();
		Thread.sleep(3000);
		commentBox.sendKeys("Alt mesaj");
		
		
	}
	@Test(priority=7)
	public void cssSelectorLocator() {
		
		//input[name='author']
		
		browser.findElement(By.cssSelector("input[name='author']")).sendKeys("Test");
		
	}
	@Test(priority=8)
	public void xpathLocator() {
		
		browser.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com");
		
		
		
	}
	
	
}
