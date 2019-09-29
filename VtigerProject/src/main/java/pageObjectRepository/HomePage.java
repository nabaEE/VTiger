package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	/***************Initialization********************/
	@FindBy(xpath="//a[text()='Leads']/../../td[4]/a")
	private WebElement leadBtn;
	@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']/../../../tr[1]/td[2]/img")
	private WebElement adminDropDown;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutBtn;
	
	public WebElement getleadBtn()
	{
		return leadBtn;
	}
	public WebElement getadminDropDown()
	{
		return adminDropDown;
	}
	public WebElement getsignOutBtn()
	{
		return signOutBtn;
	}
	/***************Business Need********************/
	public void navigateToOpenLead()
	{
		leadBtn.click();
	}
	
	public void logout()
	{

	  adminDropDown.click();
	  signOutBtn.click();
	}
	
	
	
	

}
