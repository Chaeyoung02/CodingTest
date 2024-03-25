package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1009 {

   public static void main(String args[]) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       int T = Integer.parseInt(st.nextToken());

       int[] answer = new int[T];

       for (int i = 0; i < T; i++) {
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());

           int data = 1;
           for (int j = 0; j < b; j++) {
               data *= a;
               data %=10;
           }
           if(data == 0){
               data = 10;
           }
          answer[i] = data;


       }
        //1의 자리 수만 궁금하기 때문에 원하는 수만큼 거듭제곱할 동안 같이 10으로 나누어 나머지값에 더한다.
       // 같이 나누지 않고 다 계산후 나누게 되면, 부정한 값을 얻게 된다.

       for (int i = 0; i < T; i++) {
           System.out.println(answer[i]);
       }
   }

}
