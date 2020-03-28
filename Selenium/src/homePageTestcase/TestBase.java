package homePageTestcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import HomePageObjectRepo.ChapterFirstpage;
import HomePageObjectRepo.ChapterSecondPage;
import HomePageObjectRepo.HomePage;

public class TestBase {
	protected WebDriver driver;
	protected String baseUrl;
	protected HomePage homePage;
	protected ChapterSecondPage chapterSecond;
	protected ChapterFirstpage chapterFirstPage;

	// Method-1.
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		baseUrl = "http://book.theautomatedtester.co.uk/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// Method-2.
	@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();

	}
}


