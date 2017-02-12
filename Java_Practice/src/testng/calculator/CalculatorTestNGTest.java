package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestNGTest {
	
   @Test
   public void testAddPass() {
      // assertEquals(String message, long expected, long actual)
	  Assert.assertEquals(3, Calculator.add(1, 2), "error in add()");
	  Assert.assertEquals(-3, Calculator.add(-1, -2), "error in add()");
	  Assert.assertEquals(9, Calculator.add(9, 0), "error in add()");
   }
 
   @Test
   public void testAddFail() {
      // assertNotEquals(String message, long expected, long actual)
	   Assert.assertNotEquals(0, Calculator.add(1, 2), "error in add()");
   }
 
   @Test
   public void testSubPass() {
	   Assert.assertEquals(1, Calculator.sub(2, 1), "error in sub()");
	   Assert.assertEquals(-1, Calculator.sub(-2, -1), "error in sub()");
	   Assert.assertEquals(0, Calculator.sub(2, 2), "error in sub()");
   }
 
   @Test
   public void testSubFail() {
	   Assert.assertNotEquals(0, Calculator.sub(2, 1), "error in sub()");
   }
   
}