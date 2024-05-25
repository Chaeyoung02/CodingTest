package BaekJun;

import java.io.IOException;
import java.util.Scanner;

public class boj1120 {

    public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        String str1 =sc.next();
        String str2 =  sc.next();



        int result = 50;//최솟값을 지정
        for(int i = 0; i < str2.length() - str1.length()+1 ; i++) {
            //str1의 길이를 str2의 요소만큼 한 요소만큼 조금 증가시키기
            int count = 0;
            for(int j = 0; j<str1.length(); j++) {

                if(str1.charAt(j) != str2.charAt(j+i)) {

                    count ++;
                }
            }
            result = Math.min(result, count);//최솟값 구하기

        }
        //(str1.length() - count++);

        System.out.println(result);
        sc.close();

    }

}
