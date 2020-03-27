package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LoginForm {
    
  public void login()  { 
	 
		
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			ChromeOptions options =new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.lambdatest.com/");
			
			WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Free Signup')]"));
	        signUpButton.click(); 
	        
	        WebElement lambdaTestLogo = driver.findElement(By.xpath("//p[@class='signup-titel']"));
	    	lambdaTestLogo.isDisplayed();
	    	
	    	WebElement signUpTitle = driver.findElement(By.xpath("//p[@class='signup-titel']"));
	    	signUpTitle.isDisplayed();
	    	
	    	WebElement termsText = driver.findElement(By.xpath("//label[@class='woo']"));
	    	termsText.isDisplayed();
	    	
	    	WebElement loginLinkText = driver.findElement(By.xpath("//p[@class='login-in-link test-left']"));
	    	loginLinkText.isDisplayed();
	    	
	    	WebElement termsLink = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	    	termsLink.click();    	
	    	
	    	
	    	
  }
	    	
  }
  
  
  
  
  
  
  

