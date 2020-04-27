import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class BlockinganEventWithweeklyRecurrance extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")).click();
		driver.findElement(By.id("evt5")).sendKeys("other");
		driver.findElement(By.id("EndDateTime_time")).click();
		driver.findElement(By.id("timePickerItem_38")).click();
		driver.findElement(By.id("IsRecurrence")).click();
		driver.findElement(By.id("rectypeftw")).click();
		driver.findElement(By.id("RecurrenceEndDateOnly")).click();
		driver.findElement(By.id("calMonthPicker")).getText();
		driver.findElement(By.xpath("//select[@id='calMonthPicker']//option[contains(text(),'May')]")).click();;
		driver.findElement(By.id("calYearPicker")).getText();
		driver.findElement(By.xpath("//tr[@id='calRow2']//td[contains(@class,'weekday')][contains(text(),'8')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
