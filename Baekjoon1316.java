import java.util.Scanner;

public class Baekjoon1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int t = 0;
		
		for (int a = 0 ; a < k ; a++) {
			int check = 0;
			String str = scanner.next();
			
			if (str.length() == 1 | str.length() == 2) {
				t++;
			}
			
			else {
				for (int b = 1 ; b < str.length(); b++) {
					char ch1 = str.charAt(b-1);
					char ch2 = str.charAt(b);
					if (ch1 != ch2) {
						for (int j = b + 1 ; j < str.length(); j++) {
							//System.out.println(str.charAt(j));
							if (ch1 == str.charAt(j)) {
								check = 1;
							}
						}
					}
				}
				if (check == 0) {
					t++;
				}
			}
		}
		System.out.println(t);
		scanner.close();
	}

}
