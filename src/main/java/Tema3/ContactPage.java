package Tema3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class ContactPage extends HomeWorkBaseTest {
	
	
	public void contactPage() throws InterruptedException {
	
		WebElement nameContact = browser.findElement(By.cssSelector("span input[type='text']"));
			nameContact.sendKeys("Alexandra Moise");	
			
			
			
			
		WebElement email = browser.findElement(By.cssSelector("p input[type='email']"));	
		email.sendKeys("cernea.alexandra279@gmail.com");
		WebElement subject = browser.findElement(By.cssSelector("input[type='text'][name='your-s']"));
		subject.sendKeys("contract subject");
		WebElement message = browser.findElement(By.cssSelector("textarea[name='your-message']"));
		message.sendKeys("text text text text text bla bla");
		
		Thread.sleep(5000);//stiu ca e bad practice
		WebElement sendMessage = browser.findElement(By.cssSelector("p input[type='submit']"));
		sendMessage.click();
		
		WebElement actualText = browser.findElement(By.cssSelector("[class=wpcf7-response-output]"));
		browser.navigate().wait(3000);
		//Thread.sleep(5000);//stiu ca e bad practice

		String expectedText = "Thank you for your message. It has been sent.";
		assertEquals(actualText.getText(), expectedText);
		
		
		
}
}