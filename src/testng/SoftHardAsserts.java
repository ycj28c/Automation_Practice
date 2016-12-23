package testng;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class SoftHardAsserts {

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @Test
  public void softAssertExample() {
	  // testNG 6.9.10 API
	  SoftAssert softAssert = new SoftAssert();
	  
	  softAssert.assertTrue(true);
	  softAssert.assertFalse(false);
	  softAssert.assertFalse(true);
	  softAssert.assertFalse(false);
	  softAssert.assertTrue(false);
	  softAssert.assertAll();
  }
  
  @Test
  public void hardAssertExample() {
	  // testNG 6.9.10 API
	  Assertion hardAssert = new Assertion();
	  
	  hardAssert.assertTrue(true);
	  hardAssert.assertFalse(false);
	  hardAssert.assertFalse(true);
	  hardAssert.assertFalse(false);
	  hardAssert.assertTrue(false);
  }
  
}
