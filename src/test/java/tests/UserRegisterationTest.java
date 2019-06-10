package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase{
	
	UserRegisterationPage userRegObject;
	
	@DataProvider(name = "TestData")
	public static Object[][] TestDataMethod()
	{
		return new Object[][] {{"Aya655ta", 
			"Ahme765da",
			"ayat.aba975433ghoush88@gmail.com",
			"01212345678",
			"Pas$word0",
			"Pas$word0"}
			};
	
	}
	
	
	@Test(dataProvider = "TestData")
	public void ValidateUserCanRegisterSuccessffully(String firstName, 
			String lastName, String email, String phoneNumber, String pass, 
			String ConfirmPass) {
	
		userRegObject = new UserRegisterationPage(driver);
		
		userRegObject.UserRegisteration(firstName, lastName, email,
				phoneNumber, pass, ConfirmPass);
		
		Assert.assertEquals(userRegObject.sucessMsg.getText(), "Hi, "+firstName +" " + lastName);
	}
	
	
	@Test(dataProvider = "TestData")
	public void ValidateAlreadyRegisteredEmail(String firstName, 
			String lastName, String email, String phoneNumber, String pass, 
			String ConfirmPass) {
	
		userRegObject = new UserRegisterationPage(driver);
		
		userRegObject.UserRegisteration(firstName, lastName, email,
				phoneNumber, pass, ConfirmPass);
		
		Assert.assertEquals(userRegObject.emailExists.getText(), "Email Already Exists.");
	}

}
