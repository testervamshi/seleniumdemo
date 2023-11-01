package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.name("mytext1")).sendKeys("smoke testing");
		
		driver.switchTo().defaultContent();//goto main window
		
		
		//frame2
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.name("mytext2")).sendKeys("sanity");
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.name("mytext3")).sendKeys("regression");
		
		//inside frame or nested frame iframe
		driver.switchTo().frame(0);//using index
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		driver.switchTo().defaultContent();
		
		//frame4
		WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.name("mytext4")).sendKeys("functional");
		

	}

}
