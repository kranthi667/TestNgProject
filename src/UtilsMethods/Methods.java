package UtilsMethods;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
	
	
	WebDriver driver ;
	public void initdriver() {
		System.setProperty("webdriver.chrome.driver","/TestNGProject/drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	
	}	
	public void Takescreenshot( ) {
		
		File srcfile =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			FileUtils.copyFile(srcfile, new File("/TestNGProject/FailedScreenshots"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
