package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.className("btn-primary")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//li[@id='menu-customer']//a[text()=' Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//li//a[text()='Customers']")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println("total no of pages:"+text);
		
		//substring Showing 1 to 10 of 15092 (1510 Pages)
		int totalpages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println(totalpages);//1510
		
		for(int p=1;p<5;p++) {//for(int p=1;p<totalpages;p++)
			WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
			System.out.println(activepage.getText());
			if(totalpages>1) {
			WebElement activepages=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
			System.out.println(activepages.getText());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", activepages);
			//activepages.click();
			}
			int noofrows=driver.findElements(By.xpath("//table//tbody//tr")).size();
			System.out.println("num of rows in table:"+noofrows);
			for(int r=1;r<=noofrows;r++) {
				String email=driver.findElement(By.xpath("//table//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println(email);
			}
		}
	}
	}


