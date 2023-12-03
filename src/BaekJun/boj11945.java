package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11945 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        for(int i = 0; i < n; i++){
            String str = br.readLine();
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    }
}
