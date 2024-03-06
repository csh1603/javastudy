import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 다시 확인
public class Baekjoon2840 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 칸 수와 회전 수를 저장하는 변수 N, K
		String [] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		
		// 회전판에 있는 문자를 저장하는 배열, 뭔지 모르면 기본값은 ?이기 때문에 ?로 배열 채우기
		char[] wheel = new char[N];
		Arrays.fill(wheel, '?');
		
		// 회전판에 문자가 존재하는지 확인하기 위한 배열
		boolean t[] = new boolean[26];
		Arrays.fill(t, false);
		
		// 가르키는 칸의 번호를 나타내는 변수 arrow
		int arrow = 0;
		
		// 모순이 발생했는지 확인하는 변수 check
		int check = 0;
		
		// 사용자에게 입력 받기
		for (int i=0 ; i<K ; i++) {
			String [] str = br.readLine().split(" ");
			int S = N - Integer.parseInt(str[0]);
			char alpha = str[1].charAt(0);
			
			arrow = (arrow + S) % N;
			
			// 이미 문자가 들어가있고 그 문자가 입력받은 문자와 다르다면 모순 발생
			if (wheel[arrow] != '?' && wheel[arrow] != alpha) {
				check = 1;
				break;
			}
			// 이미 다른 곳에서 alpha의 문자가 쓰였다면 모순 발생
			else if (wheel[arrow] != alpha && t[alpha -'A'] == true) {
				check = 1;
				break;
			}
			// 중복도 없고 ?에 들어갈 문자라면 배열에 문자열 대입 후, 중복 체크용 배열 true로 변환
			else {
				wheel[arrow] = alpha;
				t[alpha - 'A'] = true;
			}
		}
		
		// 만약 모순이 있는 경우라면 ! 출력
		if (check == 1) {
			System.out.println("!");
		}
		//모순이 없다면 화살표가 끝난 곳부터 하나씩 출력
		else {
			StringBuilder sb = new StringBuilder();
			for (int i=arrow ; i<N ; i++) {
				sb.append(wheel[i]);
			}
			for (int i=0 ; i<arrow ; i++) {
				sb.append(wheel[i]);
			}
			System.out.println(sb);
		}
	}

}
