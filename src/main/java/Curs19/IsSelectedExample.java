package Curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class IsSelectedExample extends BaseTest {
	
	@Test
	public void isSelectestTest() {
		
		
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a"));
		
		WebElement passField = browser.findElement(By.cssSelector("input[type='password']"));
		
		System.out.println(passField.isSelected());
		
		passField.click();
		
		System.out.println("------------------------");
		System.out.println(passField.isSelected());
		
	}

}
