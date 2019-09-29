package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenOrganizPage
{
	/*******************************Initialization of webElements*************************************/
	@FindBy(xpath="//a[text()='Organizations']/../../td[6]/a")
	private WebElement orgBtn;
	/******************************Business Logic******************************************/
	public void naviateToCreateOrgniz()
	{
		orgBtn.click();
	}
	
}
