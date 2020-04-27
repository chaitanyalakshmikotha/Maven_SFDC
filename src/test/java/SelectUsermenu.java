import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectUsermenu extends BrowserUtility {

	public static void main(String[] args) throws IOException, Exception {
		
		
		launchBrowser("ch");
		loginToBrowser();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[@id='userNavLabel']"))));
		
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
