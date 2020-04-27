import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CreateAnAccount extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		

		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("acc2")).sendKeys("chaitu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//option[contains(text(),'High')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		driver.quit();

	}

}
