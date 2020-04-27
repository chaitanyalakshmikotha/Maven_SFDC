import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateLoginErrorMessage extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		WebElement username = driver.findElement(By.id("username"));
		
				username.sendKeys("123");
				
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		
		password.sendKeys("22131");
				
		driver.findElement(By.id("Login")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
