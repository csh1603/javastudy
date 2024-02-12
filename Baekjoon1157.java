import java.util.Scanner;

public class Baekjoon1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toUpperCase();
		
		int arr[] = new int[26];
		
		for (int i = 0; i<str.length(); i++) {
			arr[str.charAt(i) - 65] ++;
		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0 ; i < 26 ; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}
			else if (arr[i] == max)
				ch = '?';
		}
		
		System.out.println(ch);
		
		scanner.close();
		return;
	}
}
