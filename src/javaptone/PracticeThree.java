package javaptone;

public class PracticeThree {
	
	public static long sumfrom(int start, int end){
		if(start>end){
			return 0;
		}
		long sum = 0;
		for(int i=start;i<=end;i++){
			sum +=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		long sum = 0;
		for(int i=1;i<=20161202;i++){
			sum +=i;
		}
		System.out.println(sum);
		
		System.out.println(sumfrom(1,20161202));
	}

}
