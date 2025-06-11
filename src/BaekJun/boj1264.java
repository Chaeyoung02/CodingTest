import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String S = br.readLine().toUpperCase();

			if(S.equals("#")) break;
			
			String result = S.replace("A", "")
					.replace("E", "")
					.replace("I", "")
					.replace("O", "")
					.replace("U", "");
			System.out.println(S.length() - result.length());
		}
	}
}
