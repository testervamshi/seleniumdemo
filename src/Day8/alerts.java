package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBox")).click();
		
		//simple alert
		String message=driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
		
		//confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().dismiss();
		
		//prompt alert
		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().sendKeys("testing");
		driver.switchTo().alert().accept();

	}

}
