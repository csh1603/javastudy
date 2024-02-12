import java.util.Scanner;

public class Baekjoon2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		int a = 0;
		
		for (int i = 0 ; i<str.length(); i++) {
			switch (str.charAt(i)) {
			case 'c':
				if (str.charAt(i+1) == '-' | str.charAt(i+1) == '=')
					i++;
			break;
			case 'd':
				if (str.charAt(i+1) == 'z' && str.charAt(i+2) == '=')
					i = i+2;
				else if (str.charAt(i+1) == '-')
					i++;
			break;
			case 'l':
				if (str.charAt(i+1) == 'j')
					i++;
			break;
			case 'n':
				if (str.charAt(i+1) == 'j')
					i++;
			break;
			case 's':
				if (str.charAt(i+1) == '=')
					i++;
			break;
			case 'z':
				if (str.charAt(i+1) == '=')
					i++;
			}
			a++;
		}
		System.out.println(a);
	}

}
