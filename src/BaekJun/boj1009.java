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

       for (int i = 0; i < T; i++) {
           System.out.println(answer[i]);
       }
   }

}
