import java.util.Scanner;

public class Beakjoon25206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//number of subjects;
		float i = 0;
		float score = 0;
		
		while(true) {
			String str = scanner.nextLine();
			if (str == "")
				break;
			String[] words = str.split(" ");
			
			float credit = Float.valueOf(words[1]);
			
			switch(words[2]) {
			case "P":
				break;
			case "A+":
				i += credit;
				score += credit * 4.5;
				break;
			case "A0":
				i += credit;
				score += credit * 4.0;
				break;
			case "B+":
				i += credit;
				score += credit * 3.5;
				break;
			case "B0":
				i += credit;
				score += credit * 3.0;
				break;
			case "C+":
				i += credit;
				score += credit * 2.5;
				break;
			case "C0":
				i += credit;
				score += credit * 2.0;
				break;
			case "D+":
				i += credit;
				score += credit * 1.5;
				break;
			case "D0":
				i += credit;
				score += credit * 1.0;
				break;
			default:
				i += credit;
				break;
			}
		}	
		System.out.printf("%.6f", score/i);
	}

}
