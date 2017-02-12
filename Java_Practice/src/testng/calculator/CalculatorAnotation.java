package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//http://www.whiteboxtest.com/Unit-Testing-With-TestNG.php
public class CalculatorAnotation {
	/**
	    * @Test(expectedExceptions = ArithmeticException.class) if the method throws the named exception 
	    * and fails if the different exception thrown or test method does not throw an exception.
	    */
	   @Test(expectedExceptions = ArithmeticException.class)
	   public void exceptionTest() {
	      Calculator.divInt(1, 0);
	   }
	   
	   /**
	    * @Test(timeOut=100) Fails if the method takes longer than specified timeout 100 milliseconds.
	    */
	   @Test(timeOut=100)
	   public final void testAdd2() {
	      long result = Calculator.add(3, 4);
	      Assert.assertEquals(result, 7, "actual not matching with expected");
	   }
	   
	   /**
	    * @Test(enabled=false) if code changed and test are not ready to run this time.
	    */
	   @Test(enabled=false)
	   public final void testRational() {
	      long result = Calculator.add(10, 4);
	      Assert.assertEquals(result, 14, "actual not matching with expected");
	   }
	   
	   /**
	    * @Test(invocationCount = 10) will invoke test 10 times. This method is 
	    * typically useful for stress testing to test the SUT for number of request serially
	    */
	   @Test(invocationCount = 10)
	   public final void testAdd3() {
	      long result = Calculator.add(3, 4);
	      Assert.assertEquals(result, 7, "actual not matching with expected");
	   }
	   
	   /**
	    * @Test(threadPoolSize = 5, invocationCount = 10) to invoke test 10 times with 5 threads 
	    * in thread pool. As soon as test complete thread return to thread pool to invoke remaining tests. 
	    * This annotation useful to verify that SUT is multithread safe.
	    */

	   @Test(threadPoolSize = 5, invocationCount = 10)
	   public void concurrencyTest() {
		   System.out.print(" " + Thread.currentThread().getId());
	   }
	   
	   @BeforeMethod
	   public void setUpBeforeMethod(){
		   System.out.println("before method start");
	   }
	    
	   @AfterMethod
	   public void tearDownAfterMethod(){
		   System.out.println("after method end");
	   }
	   
	   /**
	    * The list of groups configured for fixture method will run this fixture method. Fixture setup 
	    * starting with annotation @BeforeGroups will be called before the first test method of the groups 
	    * configured for this fixture, and the fixture teardown starting with annotation @AfterGroups will be 
	    * called after all the test method of the groups configured for this fixture. Test groups setup and 
	    * teardown will be called one time before/after all the test method of the groups configured.
	    */
	   @BeforeGroups(groups = {"unit-test","functional-test"})
	   public void setUpBeforeFTandRT(){
		   
	   }
	   
	   @AfterGroups(groups = {"unit-test","functional-test"})
	   public void tearDownAfterFTandRT(){
		   
	   }
	   
	   /**
	    * Dependencies allows test method ordering and dependency on each other.
	    * Test method dependency could be on method or groups using dependsOnMethods or dependsOnGroups attribute of @annotation. 
	    * If at least one of the dependency method get failed dependent method will be skipped and reported as SKIP in reports
	    * Test method ordering can be done using “alwaysRun=true” along with dependsOnMethods or dependsOnGroups attribute of @annotation. 
	    * If any of the dependency method get failed dependent method will not be skipped. This is also known as soft dependency
	    */
	   @Test(groups = {"setup"})
	   public void setUpEnvironment() {}
	   @Test(dependsOnMethods = {"setUpEnvironment"})
	   public void method1() {}
	   @Test(groups = { "setup" })
	   public void resourceInit() {}
	   @Test(dependsOnMethods = { "setup*" })
	   public void method2() {}
}
