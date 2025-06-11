import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());

		N -= (N % 100);

		while(true) {
			if(N % F == 0) {
				break;
			}
			N++;
		}
		System.out.format("%02d", (N % 100));
	}
}
