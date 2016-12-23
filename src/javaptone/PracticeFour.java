package javaptone;

public class PracticeFour {

	public static boolean areYouPassExam(int score){
		if(score<60){
			return false;
		} else if(score<=100){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 61;
		int score2 = -1;
		int score3 = 100;
		int score4 = 99999;
		int score5 = 44;
		System.out.println(areYouPassExam(score1));
		System.out.println(areYouPassExam(score2));
		System.out.println(areYouPassExam(score3));
		System.out.println(areYouPassExam(score4));
		System.out.println(areYouPassExam(score5));

	}

}
