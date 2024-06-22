package BaekJun;

import java.util.Scanner;

public class boj1788 {
    public static void main(String[] args) {
        final int MOD = 1000000000;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num > 0) {
            System.out.println("1");
        }else if(num < 0) {
            if((-num) % 2 == 0) {
                System.out.println("-1");
            }else {
                System.out.println("1");
            }

        }else {
            System.out.println("0");
        }

        num = Math.abs(num);
        long[] fibo = new long[num+2];
        fibo[0] = 0;
        fibo[1] =1;
        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = (fibo[i-1]  % MOD + fibo[i - 2] % MOD) % MOD;
        }
        System.out.println(fibo[num]);
    }
}
