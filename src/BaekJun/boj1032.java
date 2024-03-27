package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1032 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());;

        String[] arr = new String[n];

        StringBuilder sb = new StringBuilder();

        for(int i  = 0; i < n; i++){
            arr[i] = br.readLine();
        }



        for(int i = 0; i < arr[0].length(); i++){
            char c = arr[0].charAt(i);
            boolean b = true;
            for(int j  = 1; j < n; j++){
               if(c != arr[j].charAt(i)) {
                   b = false;
               }
            }
            if(b){
                sb.append(c);
            }
            else {
                sb.append("?");
            }
        }
        System.out.print(sb);
    }
}
