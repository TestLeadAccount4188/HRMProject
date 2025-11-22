package basePackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utilisPackage.commanUtilis;

public class base_page {

	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		commanUtilis.readPropertyFiles();
		commanUtilis.launchBrowserAndNavegatetoAPP();
		
		
	}
	
	
	@AfterTest
	public void close() throws Exception {
		
		
		
	}
	
}
