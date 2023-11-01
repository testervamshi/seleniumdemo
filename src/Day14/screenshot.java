package Day14;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*
		//method 1 to take screenshot
		//convert the webdriver object to take screenshot
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		//call getscreenshot method to take screen shot
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		//move the image to new location
		File Destination=new File("D:\\screenshots\\image2.jpg");
		//copy from source to destination
		Files.copy(source, Destination);
		
		//method 2 to take screenshot
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("D:\\screenshots\\image3.jpg"));*/
		
		//method 3 to take screenshot
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\screenshots\\image2"+".png";
		Files.copy(source, new File(destination));

	}

}
