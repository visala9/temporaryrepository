package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {
		
			 public static void main(String[] args) {	
				 
				 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
				 
				 WebDriver driver = new ChromeDriver();
				 
				 ChromeOptions options =new ChromeOptions();
				 
					options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
					
					driver.get("https://www.flipkart.com");
					
					driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("visalapenumuchu@gmail.com");
					
					driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Flipkart@123");
					
					driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
					
					driver.close();
				 
				 
				 
				 
				 
				 
				 
				 
				 
			 }
	}
		