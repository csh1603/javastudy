import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10799 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int result = 0;
		int pa = 0;
		
		for (int i=0 ; i<str.length(); i++) {
			if (str.charAt(i) == '(') {
				pa++;
				if (str.charAt(i+1) == ')') {
					i++;
					pa--;
					result += pa;
				} 
			}
			else if(str.charAt(i) == ')') {
				pa--;
				result++;
			}
		}
		System.out.println(result);
	}

}
