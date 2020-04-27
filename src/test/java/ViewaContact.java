import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ViewaContact extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.id("fcf")).click();
		driver.findElement(By.xpath("//option[contains(text(),'My Contacts')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'abcd')]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
