package javapttwo;

/**
 * Practice 2: 
 * We have a String
 * String happy = "Merry Christmas and Happy New Year! ";
 * please print below result:
 * 	1) trim the string
 * 	2) check if the string contains "Happy"
 * 	3) get the substring start with index 20
 * 	4) tell me the length of the happy string
 * 	5) replace the "and" with "and all"
 * If you have time, try below also:
 * 	6) ignore the case, is the happy string equals to the  "merry christmas AND happy new year! "
 * 	7) split the happy string to happy array by space, print first split string
 * @author ryang
 *
 */
public class PracticeTwo {

	public static void main(String[] args) {
		String happy = "Merry Christmas and Happy New Year! ";
		
		System.out.println(happy.trim());
		System.out.println(happy.contains("Happy"));
		System.out.println(happy.substring(20));
		System.out.println(happy.length());
		
		String happyReplace = happy.replace("and", "and all");
		System.out.println(happyReplace);
		
		String happySame = "merry christmas AND happy new year! ";
		System.out.println(happy.equalsIgnoreCase(happySame));
		
		String[] happySplit = happy.split(" ");
		System.out.println(happySplit[0]);
	}

}
