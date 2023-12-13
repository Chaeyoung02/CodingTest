package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1010 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());

        int[][] dp = new int[31][31];
        dp[0][0] = dp[1][0] = dp[1][1] = 1;
        for(int i = 1; i < 31; i++){

            dp[i][0] = 1;
            dp[i][1] = i;
            for(int j = 2; j < 31; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }


        }
        while(--T >= 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(dp[m][n]).append("\n");
        }
        System.out.print(sb);
    }
}
