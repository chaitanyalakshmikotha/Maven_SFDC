import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfiledropdown extends BrowserUtility {

	public static void main(String[] args) throws Exception {

		launchBrowser("ch");
		loginToBrowser();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();

		WebElement myprofile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));

		myprofile.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("laboutMeContentId")));

		WebElement lname = driver.findElement(By.id("lastName"));
		lname.clear();
		lname.sendKeys("abcd");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		WebElement body = driver.findElement(By.id("cke_publisherRichTextEditor"));
		body.click();
		Thread.sleep(2000);
//		driver.switchTo().frame(body);
		WebElement text = driver.findElement(By.cssSelector("body"));
		text.sendKeys("abcd123");
		Thread.sleep(2000);
		driver.findElement(By.id("publishersharebutton")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'File')]")).click();
		driver.findElement(By.id("chatterUploadFileAction")).click();
		driver.findElement(By.id("chatterFile")).sendKeys("/Users/chaitu/Desktop/class screenshots/agile1.png");
		driver.findElement(By.id("publishersharebutton")).click();
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath(
				"//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));

		Actions action = new Actions(driver);

		action.moveToElement(account).build().perform();
		account.click();
		Thread.sleep(3000);
		driver.findElement(By.id("uploadLink")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		Thread.sleep(2000);

		WebElement uploadpic = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		uploadpic.sendKeys("/Users/chaitu/Downloads/salesforce.png");

		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'imgCrop_handle imgCrop_handleNW')]")).click();
		driver.findElement(By.id("j_id0:j_id7:save")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
