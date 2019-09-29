package pageObjectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonLibraries.BaseClass;

public class CreateOrganizRecordPage
{
	
	@FindBy(name="website")
	private WebElement websiteEdt;
	@FindBy(xpath="//img[@align='absmiddle' and @alt='Select']")
	private WebElement memberOfBtn;
	@FindBy(xpath="//input[@name='button']/../../../../tr[22]/td/div/input[1]")
	private WebElement saveBtn;
	@FindBy(name="accountname")
	private WebElement OrgNameEdt;
	@FindBy(xpath="//a[text()='Wipro']/../../td[1]/a")
	public WebElement childBtn;
	public WebElement getchildBtn()
	{
		return childBtn;
	}
	
	public WebElement getWebsite()
	{
		return websiteEdt;
	}
	
	public WebElement getMemberOfBtn() {
		return memberOfBtn;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createOrgRecord(String orgName, String website)
	{
		OrgNameEdt.sendKeys(orgName);
		websiteEdt.sendKeys(website);
		WebElement wb=memberOfBtn;
		wb.click();
	}
	
	public void passDriverControl()
	{
		Set<String> set= BaseClass.driver.getWindowHandles();
		Iterator<String> it= set.iterator();
		String pWin= it.next();
		String cWin=it.next();
		BaseClass.driver.switchTo().window(cWin);
		childBtn.click();
		Alert al= BaseClass.driver.switchTo().alert();
		al.accept();
		BaseClass.driver.switchTo().window(pWin);
	}
	
	

	public void clikOnSave()
	{
		
		saveBtn.click();
	}
	


}
