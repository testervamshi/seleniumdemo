package practice;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//Method 1 to take screenshot
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		File Destifile=new File("D:\\screenshots\\image.jpg");
		Files.copy(sourcefile,Destifile);
		
		//Method 2 to take screenshot
		//File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot,new File("C:\\V\\screenshots\\image.jpg"));
		//Files.copy(screenshot,new File("C:\\V\\screenshots\\image.jpg"));
		
		/*Method 3 to take screenshot
		
		//convert the webdriver object to take screenshot
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		//call getscreenshot method to take the screenshot
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		//Move the image to new location
		String destinfile=System.getProperty("user.dir") + "\\screenshots\\image" + ".png";
		//copy the screen shot to the new location
		Files.copy(sourcefile, new File(destinfile));*/
		

	}

}
