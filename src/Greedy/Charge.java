package Greedy;

import java.util.Scanner;

public class Charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("거스름돈 : ");
        n = sc.nextInt();
        int count = 0;

        while(n > 0) {
            if(n >= 500){
                count += n / 500;
                n = n % 500;
            }
            else if(n >= 100){
                count += n / 100;
                n = n % 100;
            }else if(n >= 50){
                count += n / 50;
                n = n % 50;
            }else{
                count += n / 10;
                n = n % 10;
            }

        }
        System.out.print(count);
    }
}


