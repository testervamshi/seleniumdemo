package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		
		/*implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.id("btn1")).click();
		
		driver.findElement(By.id("txt1")).sendKeys("vamshi");*/
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));//declaration
		
		driver.findElement(By.id("btn1")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txt1"))));//implementation
		driver.findElement(By.id("txt1")).sendKeys("vamshi");

	}

}
