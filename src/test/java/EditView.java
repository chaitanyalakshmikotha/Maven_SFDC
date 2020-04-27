import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class EditView extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		

		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("fname")).sendKeys("chaitanya kotha");
		driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")).click();
		driver.findElement(By.xpath("//select[@id='fop1']//option[contains(text(),'contains')]")).click();
		driver.findElement(By.id("fval1")).sendKeys("a");
		driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
