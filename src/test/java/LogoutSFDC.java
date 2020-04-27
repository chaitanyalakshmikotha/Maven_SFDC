import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.sfdc.ReadConfigproperties;

public class LogoutSFDC extends BrowserUtility {

	public static void main(String[] args) throws Exception {

		launchBrowser("ch");
		loginToBrowser();

		ReadConfigproperties rcp = new ReadConfigproperties("config.properties");
		String input_username = rcp.getPropValue("username");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='userNavLabel']"))));

		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(input_username);
		wait.until(ExpectedConditions
				.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@id='rememberUn']"))));

		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
