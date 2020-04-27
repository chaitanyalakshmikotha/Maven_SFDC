import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifytheTabCustomization extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Libraries')]")).click();
		driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("chaitanya.k@salesforce.com");
		
		driver.findElement(By.id("password")).sendKeys("test@123");
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);

		driver.quit();
	}

}
