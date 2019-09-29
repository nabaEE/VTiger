package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	/***************Initialization********************/
   @FindBy(name="user_name")
   private WebElement userNameEdt;
   @FindBy(name="user_password")
   private WebElement passWordEdt;
   @FindBy(id="submitButton")
  private WebElement signInBtn;

   /*********Business Methods*****************/
   
   public void loginToApp(String username, String password)
   {
	   userNameEdt.sendKeys(username);
	   passWordEdt.sendKeys(password);
	   signInBtn.click();
	   
   }
   

}
