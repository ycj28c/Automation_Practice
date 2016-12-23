package javapttwo;

public class PracticeThree {

	public static void main(String[] args) {
		 String fragment = "abcdefghijklmnopqrstuvwxyz";
		 
		 //String Method
		 long timeStart1 = System.currentTimeMillis();
		 
		 String str1 = new String();
		 for(int i=0;i<20000;i++){
			 str1 = str1 + fragment;
		 }
		 long timeEnd1 = System.currentTimeMillis();
		 System.out.println(String.format("The time spend for String method: %f seconds", (float)(timeEnd1-timeStart1)/1000));
		 
		 //StringBuilder Method
		 long timeStart2 = System.currentTimeMillis();
		 StringBuilder str2 = new StringBuilder();
		 for(int i=0;i<20000;i++){
			 str2 = str2.append(fragment);
		 }
		 long timeEnd2 = System.currentTimeMillis();
		 System.out.println(String.format("The time spend for String method: %f seconds", (float)(timeEnd2-timeStart2)/1000));
		 
		 //StringBuffer Method
		 long timeStart3 = System.currentTimeMillis();
		 StringBuffer str3 = new StringBuffer();
		 for(int i=0;i<20000;i++){
			 str3 = str3.append(fragment);
		 }
		 long timeEnd3 = System.currentTimeMillis();
		 System.out.println(String.format("The time spend for String method: %f seconds", (float)(timeEnd3-timeStart3)/1000));
	}

}
