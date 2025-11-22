package pagesPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PimPage {
	
	// employee locators
	
	public static final By by_pim = By.xpath("//li[@id='pim']");
	public static final By by_emplist = By.xpath("//*[@id='pim']/ul/li[2]/a");
	public static final By by_addemp = By.xpath("//input[@value='Add']");
	public static final By by_empcode = By.xpath("//input[@id='txtEmployeeId']");
	public static final By by_emplstname = By.xpath("//input[@id='txtEmpLastName']");
	
	public By by_pim(){return by_pim;}
	public By by_emplist(){return by_emplist;}
	public By by_addemp(){return by_addemp;}
	public By by_empcode(){return by_empcode;}
	public By by_emplstname(){return by_emplstname;}
	
	
	@Test(description = "verify the employee can be added sucessfully7")
	
	public void addEmployeeAndVerify() {		
		
	}
	

}
