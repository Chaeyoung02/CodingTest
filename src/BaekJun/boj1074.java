package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//재귀사용
public class boj1074 {
    static int r,c,n;
    static int x = 0, y = 0;
    static int count = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = (int)Math.pow(2, N);
        //입력받은 N의 값을 2의 N제곱으로 만들 수 있도록 pow()사용

        Search(n, r, c);
        System.out.println(count);
    }
    public static int Search(int n, int r, int c){
        n /= 2;
        //4등분 하기 위해 제곱된 N의 값인 n을 절반으로 만든다
        if(r < n+y && c < n+x){ // 첫번째 구간
            count += 0; // 배열로 계산하므로 0
        } else if( r < n + y && c >= n + x){// 두번째 구간
            count += (n * n * 1);
            x += n;
        } else if(r >= n + y && c < n + x){//세번째 구간
            count += (n * n * 2);
            y += n;
        } else{// 네번째 구간
            count += (n * n * 3);
            x += n;
            y += n;
        }
        if(n == 1){ // 재귀를 통해 n값이 1이 되면 return
            return count;
        }

        return Search(n,r,c); // 값을 넣어 다시 호출
    }// 다시 호출을 반복하면서 x와 y에 n의 값을 더해준다.
}
