import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ChecktheCancelbuttoninContact extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='cancel']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
