package TestNgFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import UtilsMethods.Methods;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(Customlistener.class)
public class ScreenShot extends Base{

	
	WebDriver driver;
	
	@Test
	public void setup() {
		
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.manage().window().maximize();
		

		driver.findElement(By.name("q")).sendKeys("Amazon");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			//Thread.sleep(1000);
		
	    driver.findElement(By.name("btnK")).click();
		

	
	driver.quit();
}
	
	
	
	
	
	
	
}
