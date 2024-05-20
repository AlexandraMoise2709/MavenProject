package Curs18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class CssSelectorExample extends BaseTest {
	
	
	
	/*
	 * tagname[atribut='valoareAtribut']
	 * <li class="menu_user_login">
	 * 
	 * li = tagname
	 * class = atribut
	 * menu_user_login = valoare atribut
	 * 
	 * li[class='menu_user_login'] =li.menu_user_login
	 * 
	 * 
	 * menu_user_login--> fara element este mai imprecis
	 * 
	 * 
	 */
	
	
	
//	@Test
//	//public void cssSelectorExample() {
//		
//		JavascriptExecutor jse = (JavascriptExecutor) browser;
//		
//		//. -->class
//		WebElement loginLink  = browser.findElement(By.cssSelector(".menu_user_login"));
//		
//		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", loginLink);
//		
//		loginLink.click();
//		
//		//# --id
//		
//		WebElement user = browser.findElement(By.cssSelector("input#log"));
//		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", user);
//		user.sendKeys("Yes");
//		
//		//# 
//		WebElement pass = browser.findElement(By.cssSelector("input[name='pwd'][placeholder='Password'][type='Password']"));
//		
//		pass.sendKeys("test");
//		
//		WebElement rememberMe = browser.findElement(By.cssSelector("input[id='rememberme'],[type='checkbox'],[value='forever']"));
//		
//		pass.sendKeys("pass");
//		
//		//directChild >
//		WebElement submitButton = browser.findElement(By.cssSelector("form[name='login_form']>div>input[class='submit_button']"));
//		
//		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", submitButton);
//		submitButton.click();
//
////	}

		@Test
		public void cssSelectorExample2() {
			JavascriptExecutor jse = (JavascriptExecutor) browser;
			
			
			//*
			WebElement book1 = browser.findElement(By.cssSelector("a[href*='deep-silence']"));
			
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", book1);
			
			
			//^
			
			WebElement book2Element = browser.findElement(By.cssSelector("a[href^='life']"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", book2Element);
			
			//$
			WebElement book3Element = browser.findElement(By.cssSelector("a[href$='story']"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", book3Element);
			
			//div[class~='wpb_content_element']
			WebElement book4Element = browser.findElement(By.cssSelector("div[class~='wpb_content_element']"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid green;')", book4Element);
			
		}
}
