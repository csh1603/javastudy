import java.util.Scanner;

public class Baekjoon2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int intArr[] = new int[5];
		int total = 0;
		
		for (int a = 0 ; a < 5 ; a++) {
			intArr[a] = scanner.nextInt();
			total += intArr[a];
		}
		for (int i = 4 ; i >= 0 ; i--) {
			for (int j = 0 ; j < i ; j++) {
				if (intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
		
		System.out.println(total/5);
		System.out.println(intArr[2]);
	}

}
