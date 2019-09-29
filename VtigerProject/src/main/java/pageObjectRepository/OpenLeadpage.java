package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenLeadpage 
{
	/***************Initialization********************/

 @FindBy(xpath="//img[@title='Create Lead...']/../../../td[1]/a/img")
 private WebElement crtLeadBtn;
 public WebElement getcrtLeadBtn()
 {
	 return crtLeadBtn;
	 
 }
 
 /*****************************Business Need*************************/
 
 public void navigateToCreateLeadPage()
 {
	crtLeadBtn.click(); 
 }
 


}

