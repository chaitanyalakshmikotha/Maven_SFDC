import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifytheEditedLastname extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		
		driver.findElement(By.xpath("//h1[contains(@class,'currentStatusUserName')]//a[contains(text(),'chaitanya k')]")).click();
		driver.findElement(By.xpath("//a[@id='moderatorMutton']//b[contains(@class,'zen-selectArrow')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("aboutMeContentId"))); 

		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("abcd");
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		Thread.sleep(5000);
//		driver.quit();

	}

}
