package testng;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import javaptone.PracticeFour;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PracticeFourTest {

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }


  @Test
  public void areYouPassExam() {
	  Assert.assertTrue(PracticeFour.areYouPassExam(60));
//    throw new RuntimeException("Test not implemented");
  }
  
  @Test
  public void areYouPassExamSoft() {
	  int score1 = 61;
	  int score2 = -1;
	  int score3 = 100;
	  int score4 = 99999;
	  int score5 = 44;
	  
	  // testNG 6.9.10 API
	  SoftAssert softAssert = new SoftAssert();
	  
	  softAssert.assertTrue(PracticeFour.areYouPassExam(score1));
	  softAssert.assertFalse(PracticeFour.areYouPassExam(score2));
	  softAssert.assertFalse(PracticeFour.areYouPassExam(score3));
	  softAssert.assertFalse(PracticeFour.areYouPassExam(score4));
	  softAssert.assertTrue(PracticeFour.areYouPassExam(score5));
	  softAssert.assertAll();
  }
  
  @Test
  public void areYouPassExamHard() {
	  int score1 = 61;
	  int score2 = -1;
	  int score3 = 100;
	  int score4 = 99999;
	  int score5 = 44;
	  
	  // testNG 6.9.10 API
//	  hardAssert hardAssert = new hardAssert();
	  Assertion hardAssert = new Assertion();
	  
	  hardAssert.assertTrue(PracticeFour.areYouPassExam(score1));
	  hardAssert.assertFalse(PracticeFour.areYouPassExam(score2));
	  hardAssert.assertFalse(PracticeFour.areYouPassExam(score3));
	  hardAssert.assertFalse(PracticeFour.areYouPassExam(score4));
	  hardAssert.assertTrue(PracticeFour.areYouPassExam(score5));
  }

}
