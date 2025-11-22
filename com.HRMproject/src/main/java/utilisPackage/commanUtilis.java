package utilisPackage;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commanUtilis {

	public static  Properties config;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static final String configFilePatha = "C:\\Users\\Swathi\\eclipse-workspace\\com.HRMproject\\src\\test\\resources\\config.properties";
	
	public static void readPropertyFiles()throws Exception {
		
		try {
			
			 fis = new FileInputStream("C:\\Users\\Swathi\\eclipse-workspace\\com.HRMproject\\src\\test\\resources\\config.properties");
			 
			 config = new Properties();
			 
			 config.load(fis);
			 
			
			
			
		}catch(Exception e) {
			
			testNgUtils.assertFail(e.getMessage());	
		}
		
	}

	public static void launchBrowserAndNavegatetoAPP() {
		
		try {
			
			String browsername = config.getProperty("browser");
			
			if(browsername.equals("chrome")) {
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			}else if(browsername.equalsIgnoreCase("FireFox")) {
				driver = new FirefoxDriver();
				 driver.manage().window().maximize();
			}else if(browsername.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver ();
				 driver.manage().window().maximize();
			}else {
				System.out.println("Unable to launch the browser");
			}
			
			driver.get(config.getProperty("url"));
			
			
		}catch(Exception e) {
			
			testNgUtils.assertFail(e.getMessage());	
		}	
	}

	
	public static WebElement findElement(By by) {
		WebElement  element = null;
		try {			
			element = driver.findElement(by);
		}catch(Exception e) {
			testNgUtils.assertFail(e.getMessage());	
		}
		return element;		
	}
	
	public static void clearwholdTextMethod(By by)throws Exception {
		try {
			driver.findElement(by).clear();
		}catch(Exception e) {
			testNgUtils.assertFail(e.getMessage());	
		}
	}
	
	public static void enterValue(By by, String value) {
		try {
			
			findElement(by).clear();
			findElement(by).sendKeys(value);
		}catch(Exception e) {
			testNgUtils.assertFail(e.getMessage());
		}
	}
	
}
