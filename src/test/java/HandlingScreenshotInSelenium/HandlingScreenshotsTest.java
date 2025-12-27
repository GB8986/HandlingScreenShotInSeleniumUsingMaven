package HandlingScreenshotInSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class HandlingScreenshotsTest {
	public WebDriver driver;
	
	@Test
    public void TestDemoRadiobutton() throws Exception {
        driver = Helper.startBrowser("GC");
        driver.navigate().to("https://www.easemytrip.com/");
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshot/JavaScript Homepage.png"));
        System.out.println("Captured Screenshots");
        driver.quit();
	}
}