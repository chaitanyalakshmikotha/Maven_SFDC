import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.sfdc.ReadConfigproperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_SFDC {

	public static void main(String[] args) throws Exception {
		
		ReadConfigproperties rcp = new ReadConfigproperties("config.properties");
		String input_username = rcp.getPropValue("username");
		String input_password = rcp.getPropValue("password");

		

		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver =  new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		WebElement username = driver.findElement(By.id("username"));
		
				username.sendKeys(input_username);
				
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		
//				password.sendKeys(input_password);
				
		driver.findElement(By.id("Login")).click();

		Thread.sleep(2000);
		driver.quit();
		
		
	}


}
