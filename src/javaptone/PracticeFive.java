package javaptone;

public class PracticeFive {
	
	public static boolean isPrime(int a){
		for(int i=2;i*i<a;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=44444;i>33333;i--){
			if(isPrime(i)){
				System.out.println(i);
				break;
			}
		}
	}

}
