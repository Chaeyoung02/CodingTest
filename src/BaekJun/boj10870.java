package BaekJun;

import java.util.Scanner;

public class boj10870 {
    static int f0 = 0;
    static int f1 = 1;
    static int sum = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int answer = fibo(num);
        System.out.println(answer);

    }
    public static int fibo(int n){
        if(n == f0){
            return f0;

        }else if(n == f1){
            return f1;
        }

        return fibo(n-1) + fibo(n-2);
    }
}

