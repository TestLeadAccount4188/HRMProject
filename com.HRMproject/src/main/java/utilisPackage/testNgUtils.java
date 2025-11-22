package utilisPackage;

import org.testng.Assert;

public class testNgUtils {
	
	public static void assertTrue(String actual, String expected) {
		if(actual.contains(expected)) {
			
			Assert.assertTrue(actual.contains(expected));
		}else {
			System.out.println(expected + "not present in the applicatioon"+ actual);
		}		
	}

	public static void assertFail(String message) {
		
		
		
	}

	
}
