import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class QuatarlySummaryOpty extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("quarter_q")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Current and Next FQ')]")).click();
		driver.findElement(By.id("open")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Open Opportunities')]")).click();
		driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
