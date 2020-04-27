import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forgotpassword extends BrowserUtility{

	public static void main(String[] args) throws IOException, Exception {
		
		launchBrowser("ch");
//		loginToBrowser();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));

		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("chaitanya.k@salesforce.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='forgot_password_link']"))));

		
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
