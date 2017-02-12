package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloTestNG {

	@Test
	public void helloTestNG() {
//		Assert.fail("Sorry, you fail the hello testNG");
//		Assert.assertTrue(false, "Because it is not true");
		Assert.assertEquals(1+1, 2, "1+1!=2");
	}
}
