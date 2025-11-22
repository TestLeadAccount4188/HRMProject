package pagesPackage;

import org.openqa.selenium.By;

import utilisPackage.commanUtilis;
import utilisPackage.testNgUtils;

public class loginPage {
	
	private final By by_username = By.xpath("//input[@name='txtUserName']");
	private final By by_password = By.xpath("//input[@name='txtPassword']");
	private final By by_login = By.xpath("//input[@name='Submit']");
	private final By by_clear = By.xpath("//input[@name='clear']");
	private final By by_welcome = By.xpath("//li[text()='Welcome selenium']");

	public By getUsername() {return by_username;}
	public By getpassword() {return by_password;}
	public By getlogin() {return by_login;}	
	public By by_clear() {return by_clear;}	
	public By by_welcome() {return by_welcome;}	

public void login() {
	try {
	
		commanUtilis.enterValue(getUsername(),"Selenium");
		commanUtilis.enterValue(getpassword(),"Selenium");
		
		
	}catch(Exception e) {
		testNgUtils.assertFail(e.getMessage());
	}
}



}
