import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateaNewOpty extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();

		driver.findElement(By.id("opp3")).sendKeys("cross sell");
		driver.findElement(By.id("opp4")).sendKeys("chaitu");;
		
		
		driver.findElement(By.id("opp5")).click();
		driver.findElement(By.xpath("//option[contains(text(),'New Customer')]")).click();
		driver.findElement(By.id("opp6")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Web')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		driver.findElement(By.id("opp11")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Qualification')]")).click();
		driver.findElement(By.id("opp12")).click();
		driver.findElement(By.id("opp17"));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
