package Curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import SeleniumUtils.BaseTest;

public class FindElements extends BaseTest {
	
	@Test
	public vWebElementementsExemple() {
		
		List<WebElement> manuTabs= browser.findElements(By.ByCssSelector("li[role='tab']"));
		
		System.out.println(manuTabs.size());
		
	}

}
