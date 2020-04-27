import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.sfdc.ReadConfigproperties;

public class LoginwithPassword extends BrowserUtility {

	public static void main(String[] args) throws Exception {
				
		launchBrowser("ch");
//		loginToBrowser();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("username"))));
		
		WebElement username = driver.findElement(By.id("username"));
		
				username.sendKeys("chaitanya.k@salesforce.com");
				
		WebElement password = driver.findElement(By.id("password"));
		
		
		password.sendKeys("test@123");
				
		driver.findElement(By.id("Login")).click();

		Thread.sleep(3000);
		
		driver.quit();
	}

}
