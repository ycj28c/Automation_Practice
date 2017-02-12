package javapttwo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javapttwo.PracticeFour;

public class PracticeFourTest {

  @Test
  public void StringReverseEqual() {
		String s = "Where is my santa gift?";
		String actual = PracticeFour.StringReverse(s);
		String expect = "?tfig atnas ym si erehW";
		Assert.assertEquals(actual, expect, "Error, the reversed string is not as expect");
  }
  
  @Test
  public void StringReverseEmpty() {
		String s = " ";
		String actual = PracticeFour.StringReverse(s);
		String expect = " ";
		Assert.assertEquals(actual, expect, "Error, the reversed string is not as expect");
  }
  
  @Test(expectedExceptions = java.lang.NullPointerException.class)
  public void StringReverseNull() {
		String s = null;
		PracticeFour.StringReverse(s);
		Assert.fail("should already catch by null exception");
  }
}
