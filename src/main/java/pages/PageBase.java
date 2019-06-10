package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	
	protected WebDriver driver;
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	protected static void clickButton(WebElement element) {
		
		element.click();
	}
	
	protected static void fillTextBox(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}
}
