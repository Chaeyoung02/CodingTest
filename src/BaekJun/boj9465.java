package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj9465 {
    static int[][] dp;
    static int[][] score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());

            dp= new int[2][n+1];

            score= new int[2][n+1];
            StringTokenizer st;
            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 1; j <= n; j++) {
                    score[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = score[0][1];
            dp[1][1] = score[1][1];

            for (int i = 2; i <= n; i++) {
                dp[0][i] = Math.max(dp[1][i - 2], dp[1][i-1]) + score[0][i];
                dp[1][i] = Math.max(dp[0][i - 2], dp[0][i-1]) + score[1][i];
            }
            sb.append(Math.max(dp[0][n], dp[1][n])).append("\n");
        }
        System.out.println(sb);
    }
}
