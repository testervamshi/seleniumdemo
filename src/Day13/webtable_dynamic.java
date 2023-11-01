package Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webtable_dynamic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.className("btn-primary")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//li[@id='menu-customer']//a[text()=' Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[text()='Customers']")).click();
		
		//finding no of pages
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);//Showing 1 to 10 of 15892 (1590 Pages)
		
		int totalpages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("total no of pages:"+totalpages);//1590
		
		for(int p=1;p<5;p++) {//for(int p=1;p<totalpages;p++)
			
			WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
			System.out.println("active page:"+activepage.getText());
			if(totalpages>1) {
				WebElement active_pages=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
				System.out.println("active page:"+active_pages.getText());
			}
			//no of rows in active page
			int noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("total no of rows:"+noOfrows);
			
			for(int r=1;r<=noOfrows;r++) {
				String c_name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				
				System.out.println(c_name);
			}
			
			
		}
		

	}

}
