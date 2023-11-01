package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(from, to).perform();

	}

}
