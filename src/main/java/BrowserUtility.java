

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.sfdc.ReadConfigproperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	public static WebDriver driver = null;
	
	static void launchBrowser(String sBrowser){
		
		if(sBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanuma\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else {
			System.out.println("You have not given browser type correctly");
		}
		
		driver.manage().window().maximize(); 
		driver.get("https://login.salesforce.com/"); 
		
	}

	static void quitBrowser(){
		driver.quit();
	}
	static void loginToBrowser() throws IOException {
		
		ReadConfigproperties rcp = new ReadConfigproperties("config.properties");
		String input_username = rcp.getPropValue("username");
		String input_password = rcp.getPropValue("password");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		WebElement username = driver.findElement(By.id("username"));
		
				username.sendKeys(input_username);
				
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		
				password.sendKeys(input_password);
				
		driver.findElement(By.id("Login")).click();
		
	}


	static void waitForPageElementToVisible(WebElement eleToWait) {
		
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
		

	}

}

