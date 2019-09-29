package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrganizPage 
{
	/*******************************Initialization of webElements*************************************/

	@FindBy(xpath="//img[@alt='Create Organization...']/../../a/img")
	private WebElement crtBtn;
	/******************************Business Logic******************************************/
	public void navigateToCreateOrganizRecordPage()
	{
		crtBtn.click();
	}
	


}
