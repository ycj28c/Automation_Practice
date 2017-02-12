package javapttwo;

public class PracticeFour {

	public static String StringReverse(String s){
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String s = "Where is my santa gift?";
		System.out.println(StringReverse(s));
	}

}
