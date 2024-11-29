package BaekJun;

import java.util.Scanner;

public class boj1085 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int width = Math.min(x, w-x);
        int height = Math.min(y, h-y);

        int result = Math.min(width, height);

        System.out.println(result);
    }
}
