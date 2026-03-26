package UITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		for(int i = 0; i < 15; i++)
		{
			// Initial Login Process
			
			WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			WebElement submitButton1 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
			
			usernameField.click();
			usernameField.sendKeys("student");
			
			passwordField.click();
			passwordField.sendKeys("Password123");
			
			submitButton1.click();
			
			// Validation Process:
			
			String currentURL = driver.getCurrentUrl();
			
			if(currentURL.contains("logged-in-successfully"))
			{
				WebElement logOutButton = driver.findElement(By.partialLinkText("Log out"));
				
				logOutButton.click();
				
				String message = String.format("Login-Logout cycle complete: %d", i+1);
				
				System.out.println(message);
			}
		}
		
		
	}

}
