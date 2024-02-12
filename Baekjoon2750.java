import java.util.Scanner;

public class Baekjoon2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] intArr = new int[t];
		
		for (int i = 0 ; i < t ; i++) {
			intArr[i] = scanner.nextInt();
		}
		
		for (int i = t-1 ; i >= 0 ; i--) {
			for (int j = 0 ; j < i ; j++) {
				if (intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0 ; i < intArr.length ; i++)
			System.out.println(intArr[i]);
		scanner.close();
	}

}
