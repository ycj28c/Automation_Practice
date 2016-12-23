package javapttwo;

/**
 * Practice 1: 
 * we have:
 * int a = 1;
 * double b = 2.0D;
 * char c = 'c';
 * float d = 0.1010101f;
 * String e = "hello";
 * try combine those variable with different order, see what will happened
 *
 */
public class PracticeOne {

	public static void main(String[] args) {
		int a = 1;
		double b = 2.0D;
		char c = 'c';
		float d = 0.1010101f;
		String e = "hello";
		
		System.out.println(a + b);
		System.out.println(a + b + c);
		System.out.println(a + b + c + d);
		System.out.println(a + b + c + d + e); //102.10101009905338hello
		
		System.out.println(e + d + c + b + a); //hello0.1010101c2.01
		
		System.out.println(e + b + a + c + d); //hello2.01c0.1010101
		
		System.out.println(a + b + c + e + d); //102.0hello0.1010101
		
		System.out.println(a + c + b + e + d); //102.0hello0.1010101
		
	}

}
