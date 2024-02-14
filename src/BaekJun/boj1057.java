package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1057 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int han = Integer.parseInt(st.nextToken());

        int count = 0;
        while(kim != han){
            kim = kim/2 + kim%2;
            han = han/2 + han%2;
            count++;
        }
        System.out.println(count);


    }
}
