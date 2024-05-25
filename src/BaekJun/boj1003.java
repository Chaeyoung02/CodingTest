package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1003 {
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 테스트케이스 갯수 입력
        int num = Integer.parseInt(st.nextToken());

        // 초기값 설정
        dp[0][0] = 1; // fibonacci(0) 호출 횟수
        dp[0][1] = 0; // fibonacci(1) 호출 횟수
        dp[1][0] = 0;
        dp[1][1] = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());//ex) 3을 넣는다
            int[] result = fibonacci(n);// fibonacci(3) 호출
            sb.append(result[0]).append(" ").append(result[1]).append("\n");
        }
        System.out.print(sb);
    }

    // 피보나치 수열의 호출 횟수를 저장하는 함수
    public static int[] fibonacci(int n) {//n = 3
        if (dp[n][0] == null || dp[n][1] == null) {//dp[3][0] or dp[3][1] == null
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];// 0의 개수를 확인하기 위한 피보나치 수열
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];// 1의 개수를 확인하기 위한 피보나치 수열
        }
        return new int[]{dp[n][0], dp[n][1]};
    }



}
