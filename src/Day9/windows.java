package Day9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class windows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//String parent=driver.getWindowHandle();
		//System.out.println("parent window id:"+parent);//01C51759C60FC29573A23392AFF96064
		
		/*driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		Set<String>windows=driver.getWindowHandles();
		//first methods-iterator()
		Iterator<String>ids=windows.iterator();
		String parent=ids.next();
		String child=ids.next();
		
		System.out.println("parent window id:"+parent);
		System.out.println("child window id:"+child);
		//to move from parent to child
		String childurl=driver.switchTo().window(child).getCurrentUrl();
		System.out.println("child window url:"+childurl);
		
		//to move from child to parent
		String parenturl=driver.switchTo().window(parent).getCurrentUrl();
		System.out.println("parent window url:"+parenturl);
		*/
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		//second method-List/ArayList
		Set<String>windows=driver.getWindowHandles();
		List<String> ids=new ArrayList(windows);
		String parent=ids.get(0);
		String child=ids.get(1);
		
		System.out.println("parent window id:"+parent);
		System.out.println("child window id:"+child);
		
		//switch from parent to child
		for(String id:windows) {
			String childurl=driver.switchTo().window(id).getCurrentUrl();
			System.out.println("child window url:"+childurl);
			
			if(childurl.equals("https://demoqa.com/sample")) {
				
				System.out.println(driver.getTitle());
				driver.close();
			}
		}

	}

}
