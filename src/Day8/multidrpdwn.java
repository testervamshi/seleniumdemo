package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multidrpdwn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		Select ide=new Select(driver.findElement(By.xpath("//select[@id='ide']")));
		
		if(ide.isMultiple()) {
			ide.selectByIndex(0);
			ide.selectByIndex(2);
		}

	}

}
