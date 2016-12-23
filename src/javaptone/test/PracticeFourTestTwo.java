package javaptone.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javaptone.PracticeFour;

public class PracticeFourTestTwo {

	public static void main(String[] args) {
//		PracticeFour fx = new PracticeFour();
//		fx.areYouPassExam(60);

		PracticeFour.areYouPassExam(50);
	}

	@Test
	public void areYouPassExamOne() {
		int score = 61;
		Assert.assertTrue(PracticeFour.areYouPassExam(score), "You didn't pass because you didn't get 60");
	}

	@Test
	public void areYouPassExamTwo() {
		int score = -1;
		Assert.assertTrue(PracticeFour.areYouPassExam(score), "You didn't pass because you didn't get 60");
	}

	@Test
	public void areYouPassExamThree() {
		int score = 100;
		Assert.assertTrue(PracticeFour.areYouPassExam(score), "You didn't pass because you didn't get 60");
	}

	@Test
	public void areYouPassExamFour() {
		int score = 99999;
		Assert.assertTrue(PracticeFour.areYouPassExam(score), "You didn't pass because you didn't get 60");
	}

	@Test
	public void areYouPassExamFive() {
		int score = 44;
		Assert.assertTrue(PracticeFour.areYouPassExam(score), "You didn't pass because you didn't get 60");
	}

}
