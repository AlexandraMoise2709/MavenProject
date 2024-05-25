package Tema4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;


public class CautareCarte extends BaseTest{

	@Test
	public void cautaCarte() throws InterruptedException {
		
		
		WebElement search = browser.findElement(By.cssSelector("button[type='submit'][title='Open search']"));
		search.sendKeys("The story about me");
		search.submit();
		
		WebElement loadMore = browser.findElement(By.cssSelector("a[class*='viewmore_button']"));
		
		loadMore.click();
		Thread.sleep(5000);
		loadMore.click();
		
		Thread.sleep(5000);
		
		WebElement bookPrefered = browser.findElement(By.cssSelector("a[class='hover_icon hover_icon_link'][href*='the-story-about-me']"));
		bookPrefered.click();
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/the-story-about-me/");
		
		
		WebElement addToCart = browser.findElement(By.cssSelector("button[name='add-to-cart']"));
		addToCart.click();
		
		WebElement successMessage = browser.findElement(By.cssSelector("div[class='woocommerce-message']"));
		
		System.out.println(successMessage.getText());
		
		String expectedMessage = "[VIEW CART\r\n"
				+ "“The story about me” has been added to your cart.";
		assertEquals(successMessage.getText(), expectedMessage);
	}  
}
