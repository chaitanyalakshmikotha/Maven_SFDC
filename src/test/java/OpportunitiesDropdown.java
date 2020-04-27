import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class OpportunitiesDropdown extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		

		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("fcf")).click();
		driver.quit();
		
	}

}
