import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LeadsSelectView extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();

		driver.findElement(By.id("fcf")).click();

		Thread.sleep(2000);
		driver.quit();
//		driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")).click();
		
	}

}
