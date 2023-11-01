package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='userName']"));
		fname.click();
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.SHIFT);//press shift key
		act.sendKeys("testuser");//enter the data
		act.keyUp(Keys.SHIFT);// release the shift key
		act.perform();
		
		//select the data
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");// crl+A
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//copy the data
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//move to next field
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//paste the data
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		

	}

}
