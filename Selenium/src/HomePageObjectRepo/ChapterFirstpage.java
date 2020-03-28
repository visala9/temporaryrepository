package HomePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChapterFirstpage {
	
	private WebDriver driver;

	@FindBy(id = "secondajaxbutton")
	WebElement secondajax;

	@FindBy(xpath = "//select[@id='selecttype']")
	WebElement dropdown;

	@FindBy(id = "verifybutton")
	WebElement verifybutton;

	public ChapterFirstpage(WebDriver driver) {
		this.driver = driver;
	}

	// Method-1.
	public ChapterFirstpage clickSecondAjaxButton() {
		secondajax.click();
		return PageFactory.initElements(driver, ChapterFirstpage.class);
	}


	// Method-2.
	public ChapterFirstpage clickSecondAjaxButton1(String data1) {
		System.out.println(data1);
		return PageFactory.initElements(driver, ChapterFirstpage.class);
	}


	// Method-3.
	public ChapterFirstpage selectDropDown(String value) {
		new Select(dropdown).selectByVisibleText(value);
		return PageFactory.initElements(driver, ChapterFirstpage.class);
	}


	// Method-4.
	public ChapterFirstpage verifyButton() {
		verifybutton.click();
		return PageFactory.initElements(driver, ChapterFirstpage.class);
	}
}

