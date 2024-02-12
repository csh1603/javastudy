import java.util.Scanner;

public class Baekjoon25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int k = scanner.nextInt();
		int[] score = new int[N];
		
		for (int i = 0 ; i<N ; i++) {
			score[i] = scanner.nextInt();
		}
		for (int i = N-1 ; i >= 0 ; i--) {
			for (int j = 0 ; j < i ; j++) {
				if (score[j] < score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		System.out.println(score[k-1]);
	}

}
