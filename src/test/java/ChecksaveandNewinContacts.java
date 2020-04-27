import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ChecksaveandNewinContacts extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		

		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();

		driver.findElement(By.xpath("//input[@name='new']")).click();
		driver.findElement(By.id("name_lastcon2")).sendKeys("indian");
		driver.findElement(By.id("con4")).sendKeys("Global Media");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save_new')]")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
