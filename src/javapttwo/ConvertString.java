package javapttwo;

public class ConvertString {

	public static void main(String[] args) {
		String s = "Hello, How are you";
		System.out.println(s);
		
		StringBuilder sbd = new StringBuilder(s);
		System.out.println(sbd);
		
		String s2 = sbd.toString();
		System.out.println(s2);
		
		StringBuffer sbf = new StringBuffer(s);
		System.out.println(sbf);
		
		String s3 = sbd.toString();
		System.out.println(s3);
	}

}
