package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1546 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        double[] score = new double[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            score[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(score);

        double sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += ((score[i] / score[score.length-1]) *100);

        }

        System.out.print(sum/score.length);



    }
}
