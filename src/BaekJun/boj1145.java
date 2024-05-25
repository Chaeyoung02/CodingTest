package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1145 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i< 5; i++) {//배열에 답을 입력 받기

            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = 0;
        int count = 0;
        while(true) {
            //1부터 무한으로 배수 확인

            n++;
            for(int i = 0; i < 5 ; i++) {
                if( n % arr[i] == 0 && arr[i] <= n) {// 배수인지 확인하고,
                    //비교할 값이 5개의 자연수보다 크기 커야 나눌수 있음
                    count++;
                }
            }
            //갯수가 3개이상이 나오면 반복문 탈출
            if(count > 2) {
                break;
            }
            count = 0;
        }
        System.out.println(n);
    }

}
