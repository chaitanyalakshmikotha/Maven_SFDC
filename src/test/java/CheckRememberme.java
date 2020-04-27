import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckRememberme extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@id='rememberUn']"))));

		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		driver.findElement(By.id("Login")).click();

		Thread.sleep(3000);
		
		driver.quit();


		

	}

}
