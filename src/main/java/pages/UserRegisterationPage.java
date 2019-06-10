package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserRegisterationPage extends PageBase{

	public UserRegisterationPage (WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(name="firstname")
	WebElement fName;
	
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	

	@FindBy(name="email")
	WebElement emailAddress;


	
	

	@FindBy(name="phone")
	WebElement phoneNumber;



	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmpassword")
	WebElement confirmPassword;
	
	
	//@FindBy(xpath = "//html//body//section//div//div//div//div//div[3]//div//form//div[9]//button")
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement registerButton;
	
	
	@FindBy(className="RTL")
	public WebElement sucessMsg;
	
	@FindBy(xpath="/html/body/div[5]/section/div/div/div/div/div[3]/div/form/div[2]/div")
	public WebElement emailExists;
	
	
	public void UserRegisteration(String firstName, String lastName, String email, 
			String phoneNumber, String pass, String ConfirmPass) {
		
		fillTextBox(fName, firstName);

		fillTextBox(this.lastName, lastName);
		
		fillTextBox(emailAddress, email);

		
		fillTextBox(this.phoneNumber, phoneNumber);
		
		
		fillTextBox(password, pass);
		
		fillTextBox(confirmPassword, ConfirmPass);
		
		
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(registerButton));*/
		
		
		//clickButton(registerButton);

		
		
	}

}

