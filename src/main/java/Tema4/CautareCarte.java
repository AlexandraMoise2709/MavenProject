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
		
//		System.out.println(successMessage.getText());
		
		String expectedMessage = "VIEW CART\n"
				+ "“The story about me” has been added to your cart.";
		assertEquals(successMessage.getText(), expectedMessage);
		
		
		WebElement viewCart = browser.findElement(By.cssSelector("div>a[class='button wc-forward']"));
		viewCart.click();
		
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/cart/");
		
	}  
		
		@Test
		public void verificaCart() throws InterruptedException {
			
			WebElement addQuanity = browser.findElement(By.cssSelector("[class=q_inc]"));
			addQuanity.click();
			WebElement updateCart = browser.findElement(By.cssSelector("button[type='submit'][name='update_cart']"));
			updateCart.click();
			Thread.sleep(5000);
			
			WebElement successMessage2 = browser.findElement(By.cssSelector("div[class='woocommerce-message']"));
			
			String cartUpdated = "Cart updated.";
			assertEquals(successMessage2.getText(), cartUpdated);
			
			WebElement processdToCheckout = browser.findElement(By.cssSelector("[class='checkout-button button alt wc-forward']"));
			processdToCheckout.click();
			assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/checkout/");
			
	//div[class="woocommerce-billing-fields"]>h3	
			
			WebElement billingCustomer = browser.findElement(By.cssSelector("div[class=\"woocommerce-billing-fields\"]>h3"));
			
			String expectedText1 = "Billing details";
			
			assertEquals(billingCustomer.getText(), expectedText1);
			
			
			WebElement additionalInfo = browser.findElement(By.cssSelector("div[class='woocommerce-additional-fields']>h3"));
			
			String expectedText2 = "Additional information";
			
			assertEquals(additionalInfo.getText(), expectedText2);


		//
		
		
	}
}
