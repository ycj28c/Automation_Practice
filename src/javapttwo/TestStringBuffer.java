package javapttwo;

public class TestStringBuffer {

	public static void main(String args[]) {
		StringBuffer sBuffer = new StringBuffer("Merry");
		sBuffer.append(" Christmas");
		sBuffer.append(" ");
		sBuffer.append("Happy");
		sBuffer.append(" ");
		sBuffer.append("New Year");
		System.out.println(sBuffer);
		
		String bBuffer = new String("Merry");
		bBuffer += " Christmas";
		bBuffer += " ";
		bBuffer += "Happy";
		bBuffer += " ";
		bBuffer += "New Year";
		System.out.println(bBuffer);
	}

}
