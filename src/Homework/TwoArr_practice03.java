package Homework;

import java.util.Scanner;

public class TwoArr_practice03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        while(true){

            System.out.print("행 : ");
            n = sc.nextInt();

            System.out.print("열 : ");
            m = sc.nextInt();

            if(n > 0 && n <= 10 && m > 0 && m <=10){
                break;
            }
            else {
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            }
        }

        char[][] c = new char[n][m];
         for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                 c[i][j] = (char)((Math.random() * 25) + 65);

             }
         }
        for(int i = 0; i< n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }

    }
}
