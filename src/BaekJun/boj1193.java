package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int count = 0;
        // 자릿수가 서로 등차 수열관계
        if(num < 100){
            System.out.println(num);//두자릿수는 등차수열이므로 그냥 출력
        }else {
            count = 99;
            for(int i = 100; i <= num ; i++){
                //100이상 세자릿수를 반복문을 통해 자릿수마다 비교
                int a = i / 100;
                int b = i / 10 -(a*10);
                int c = i - (a*100) -(b*10);
                if(c - b == b - a){//자릿수끼리 차이 확인
                    count++;//등차이면 카운트하기
                }
            }

            System.out.println(count);
        }

    }
}
