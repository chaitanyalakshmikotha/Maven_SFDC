import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CreateNewViewAccount extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.id("fname")).sendKeys("chaitu");
		driver.findElement(By.id("devname")).sendKeys("chaitu");
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
