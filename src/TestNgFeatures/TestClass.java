package TestNgFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromiumdriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Login_Amazon() {
		driver.findElement(By.name("q")).sendKeys("Amazon");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			//Thread.sleep(1000);
		
	    driver.findElement(By.name("btnK")).click();
		
}
	
@AfterTest
public void quitbrowser() {
	
	driver.quit();
}
	
	
	
	
	
	
}
