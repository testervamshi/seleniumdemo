package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement dblclk=driver.findElement(By.id("doubleClickBtn"));
		
		Actions act=new Actions(driver);
		act.doubleClick(dblclk).perform();// doubleclick operation
		
		WebElement rytclk=driver.findElement(By.id("rightClickBtn"));
		
		act.contextClick(rytclk).perform();// right click operation
		

	}

}
