package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2576 {

    public static void main(String args[]) throws IOException {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr= new int[7];

        for(int i = 0; i < 7; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for(int i = 0; i < 7; i++){
           if(arr[i] % 2 == 1){
               list.add(arr[i]);
               sum += arr[i];
           }
        }
        if(sum > 0) {
            System.out.println(sum);
            System.out.println(list.peek());
        }else {
            System.out.println("-1");
        }



    }
}
