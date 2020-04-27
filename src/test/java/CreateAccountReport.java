import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountReport extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		

		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen191")).click();
	/*WebElement dropdown = driver.findElement(By.id("ext-gen148"));
	Select se = new Select(dropdown);
	se.selectByVisibleText("Created Date");*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='ext-gen148']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen152")).click();
		driver.findElement(By.id("ext-gen287")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen154")).click();
		driver.findElement(By.id("ext-gen302")).click();
		driver.findElement(By.id("ext-gen49")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("Test Report");
		driver.findElement(By.id("saveReportDlg_DeveloperName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen319")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
