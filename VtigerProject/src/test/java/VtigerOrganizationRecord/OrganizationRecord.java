package VtigerOrganizationRecord;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonLibraries.BaseClass;
import pageObjectRepository.CreateOrganizPage;
import pageObjectRepository.CreateOrganizRecordPage;
import pageObjectRepository.HomePage;
import pageObjectRepository.OpenOrganizPage;
import commonLibraries.FileUtils;

@Listeners
public class OrganizationRecord extends BaseClass
{
	
	FileUtils flib= new FileUtils();
 @Test(priority=1, groups=("smoke test"))
 public void createRecord() throws Exception
 {
	 /*Open the home page then click on Organization button*/
	 HomePage hp= PageFactory.initElements(driver, HomePage.class);
	 OpenOrganizPage orP= PageFactory.initElements(driver, OpenOrganizPage.class);
	 orP.naviateToCreateOrgniz();
	 /*Click on create Organize*/
	 CreateOrganizPage coP=PageFactory.initElements(driver, CreateOrganizPage.class);
	 coP.navigateToCreateOrganizRecordPage();
	 //Fill the details in Organization record page then click on save.
	 CreateOrganizRecordPage corP= PageFactory.initElements(driver, CreateOrganizRecordPage.class);
	 corP.createOrgRecord(flib.getExcelData("sheet1", 1, 5), flib.getExcelData("sheet1", 1, 6));
	 corP.getMemberOfBtn();
	 corP.passDriverControl();
	 corP.clikOnSave();

	 
 }

}
