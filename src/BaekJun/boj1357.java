package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1357 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int dx = rev(x);
        int dy = rev(y);

        int answer = rev(dx + dy);

        System.out.println(answer);

    }
    public static int rev(int n){
        int b = 0;
        while(n > 0){
            int a = n % 10;
            n = n / 10;
            b = b *10 + a;
        }
        return b;
    }
}
