package VtigerProject;

import org.openqa.selenium.By;
import commonLibraries.ListenerImp;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import commonLibraries.BaseClass;
import commonLibraries.FileUtils;
import pageObjectRepository.CreateLead;
import pageObjectRepository.HomePage;
import pageObjectRepository.OpenLeadpage;

@Listeners
public class CreateLeadRecord extends BaseClass
{
 
 @Test
 public void createLead() throws Exception 
 {
 FileUtils flib= new FileUtils();

	 //click on lead
 
 HomePage hp=PageFactory.initElements(driver, HomePage.class);
 
 hp.navigateToOpenLead();
 OpenLeadpage ol= PageFactory.initElements(driver, OpenLeadpage.class);
 ol.navigateToCreateLeadPage();
 CreateLead cl= PageFactory.initElements(driver, CreateLead.class);
 cl.createAlead(flib.getExcelData("sheet1", 1, 0), flib.getExcelData("sheet1", 1, 1), flib.getExcelData("sheet1", 1, 2), flib.getExcelData("sheet1", 1, 3), flib.getExcelData("sheet1", 1, 4));
  
 
 }
 
}