import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MySettingsDropdown extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		
		WebElement mysettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		
		mysettings.click();
		/*driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")).click();
		driver.findElement(By.id("LoginHistory_font")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();*/
		Thread.sleep(3000);
		driver.findElement(By.id("DisplayAndLayout_font")).click();
		driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
		driver.findElement(By.id("p4")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")).click();
		Thread.sleep(2000);
		
//		WebElement ele = driver.findElement(By.id("duel_select_0"));
		
		
		
		WebElement ele = driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", ele); 
		
		 driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();;


		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='EmailSetup']//a[contains(@class,'header setupFolder')]")).click();
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='save']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("CalendarAndReminders_font")).click();
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		driver.findElement(By.id("testbtn")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
