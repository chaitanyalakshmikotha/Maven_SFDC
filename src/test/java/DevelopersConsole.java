import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class DevelopersConsole extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'debugLogLink menuButtonMenuLink')]")).click();
		Thread.sleep(3000);
		
		ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());
		System.out.println(windowTabs.size()); 
		driver.switchTo().window(windowTabs.get(1));
		driver.get("https://na172.salesforce.com/_ui/common/apex/debug/ApexCSIPage");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
