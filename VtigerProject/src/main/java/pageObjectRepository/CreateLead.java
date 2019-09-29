package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateLead 
{
	
/**********initialization************/
	@FindBy(name="salutationtype")
	private WebElement dropDown;
	public WebElement getdropDown()
	{
		return dropDown;
	}
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameEdit;
	public WebElement getfirstNameEdit()
	{
		return firstNameEdit;
	}
	 @FindBy(name="lastname")
	 private WebElement lastNameEdt;
	 public WebElement getlastNameEdt()
		{
			return lastNameEdt;
		}
	@FindBy(name="company")
	private WebElement companyEdt;
	public WebElement getcompanyEdt()
	{
		return companyEdt;
	}
	@FindBy(name="designation")
	private WebElement titleEdit;
	public WebElement getTitleEdit()
	{
		return titleEdit;
	}
	
	@FindBy(xpath="//input[@class='detailedViewTextBox' and @id='mobile']")
	private WebElement mobileEdt;
	public WebElement getmobileEdt()
	{
		return mobileEdt;
	}
	@FindBy(name="button")
	private WebElement saveBtn;
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
	@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']/../../../tr[1]/td[2]/img")
	private WebElement adminDropDown;
	public WebElement getadminDropDown()
	{
		return adminDropDown;
	}
	
	@FindBy(xpath="a[text()='Sign Out']")
	private WebElement signOutBtn;
	public WebElement getsignOutBtn()
	{
		return signOutBtn;
	}
	public void createAlead(String firstName, String lastName, String company, String title, String mobile)
	{
		 WebElement wb=dropDown;
		 Select sel= new Select(wb);
		 sel.selectByVisibleText("Mr.");
    	firstNameEdit.sendKeys(firstName);
		lastNameEdt.sendKeys(lastName);
		companyEdt.sendKeys(company);
		titleEdit.sendKeys(title);
		mobileEdt.sendKeys(mobile);
		saveBtn.click();
		
		}
	
	public void logout(String admin, String logoutBtn)
	{
		adminDropDown.click();
		signOutBtn.click();

}
}