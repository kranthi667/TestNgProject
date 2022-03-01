package TestNgFeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	
	SoftAssert softassert = new SoftAssert();
	
	@Test(priority=1,groups="testing")
	public void test() {
		System.out.println("First test");
		
		softassert.assertEquals(true, false);
		softassert.assertAll();
	}
	@Test(priority=2,groups="test")
	public void test2() {
		System.out.println("Second test");
	}
	@Test(priority=3,groups="test")
	public void test3() {
		System.out.println("third test");
		
	}
	

}
