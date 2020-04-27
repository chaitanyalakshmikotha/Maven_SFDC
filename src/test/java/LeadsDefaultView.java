import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeadsDefaultView extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.id("fcf")).click();
		driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("chaitanya.k@salesforce.com");
		
		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("test@123");
		
		driver.findElement(By.id("Login")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
//		driver.findElement(By.id("tryLexDialogX")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		Thread.sleep(3000);

		driver.quit();
		
	}

}
