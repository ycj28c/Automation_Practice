package testng;

import org.testng.annotations.Test;

public class ExceptionAnotation {
	
	@Test(expectedExceptions = java.lang.ArithmeticException.class)
	public void throwException() throws java.lang.ArithmeticException {
		System.out.println(1/0);
	}

	public static void main(String[] args) {
		System.out.println(1/0);
	}

}
