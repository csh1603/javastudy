//피보나치 수열
public class Recursive {

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) 
			return 1;
		else {
			return fibonacci(number-1) + fibonacci(number-2);
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("피보나치 수열의 10번째 원소는 "+fibonacci(10)+"입니다.");
		
	}

}
