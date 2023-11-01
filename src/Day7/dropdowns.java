package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id='course']")));
		//drpdwn.selectByVisibleText("Java");
		//drpdwn.selectByValue("net");
		drpdwn.selectByIndex(4);
		List<WebElement> alloption=drpdwn.getOptions();
		for(int i=0;i<alloption.size();i++) {
			String option=alloption.get(i).getText();
			System.out.println(option);
		}
		

	}

}
