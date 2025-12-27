package library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {
	
	public static void capturedSceenShot(WebDriver driver, String screenShotName) {
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(source, new File("./Screenshot/"+ screenShotName + ".png"));
	        System.out.println("captured ScreenShot - By Selenium WebDriver");
	}
		catch(Exception e){
			System.out.println("Exception while capturing screen shot :"+ e.getMessage());
		}
			
		}
}
