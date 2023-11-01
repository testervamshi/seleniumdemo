package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='submit']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//create driver instance
		//js.executeScript("window.scrollBy(0,250)","");// scroll by pixel
		//js.executeScript("arguments[0].scrollIntoView();", ele);//scroll by element
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");// scroll to bottom
		
		


	}

}
