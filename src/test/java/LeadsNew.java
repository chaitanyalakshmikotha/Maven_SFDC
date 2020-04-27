import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LeadsNew extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
