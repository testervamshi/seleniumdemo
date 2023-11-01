package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		
		//Declare fluent wait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ElementNotInteractableException.class);
		
		driver.findElement(By.id("btn1")).click();
		//implementation for 1st box
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//button[@id='btn1']/following::input[1]"))));
		driver.findElement(By.id("txt1")).sendKeys("vamshi");
		
		//implementation for 2nd box
		driver.findElement(By.id("btn2")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//button[@id='btn1']/following::input[2]"))));
		driver.findElement(By.id("txt2")).sendKeys("vamshi");

	}

}
