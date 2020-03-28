package homePageUtilities;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import HomePageObjectRepo.HomePage;
import homePageTestcase.TestBase;

public class TestCase extends TestBase {
	
	// Test-0.
		@Test
		public void testPageObject() throws Exception {

			homePage = PageFactory.initElements(driver, HomePage.class);

			driver.get(baseUrl);

			chapterSecond = homePage.clickChapterSecond();
			chapterSecond.clickbut2();
			chapterSecond.clickRandom();
			String data = chapterSecond.getTest();
			homePage = chapterSecond.clickIndex();

			chapterFirstPage = homePage.clickChapterFirst();
			chapterFirstPage.clickSecondAjaxButton();
			chapterFirstPage.clickSecondAjaxButton1(data);
			chapterFirstPage.selectDropDown("Selenium Core");
			chapterFirstPage.verifyButton();
		}
	}

