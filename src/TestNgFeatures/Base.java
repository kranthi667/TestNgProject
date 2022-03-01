package TestNgFeatures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	

	WebDriver driver ;
	public void initdriver() {
		System.setProperty("webdriver.chrome.driver","/TestNGProject/drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	
	}	
	public void Takescreenshot( ) {
		
		File srcfile =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			FileUtils.copyFile(srcfile, new File("/TestNGProject/FailedScreenshots/SS.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
