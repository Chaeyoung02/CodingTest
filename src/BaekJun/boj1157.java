package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		String str2 = str.toUpperCase();
		
		int max = -1;
		int[] count = new int[26];
		for(int i = 0; i < str2.length(); i++) {
			int num = str2.charAt(i) - 'A';
			count[num]++;
		}
		char answer = '?';
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				answer = (char)(i + 'A');
			}
			else if(max == count[i]) {
				answer = '?';
			}
			
		}
		System.out.println(answer);
		
	

	}

}
