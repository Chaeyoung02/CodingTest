package api_homework;
import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수점이 있는 숫자 : ");
        double num = sc.nextDouble();
        sc.nextLine();
        System.out.print("10의 제곱수 : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        double result = Math.round(num * Math.pow(10, num2))/Math.pow(10, num2);
        System.out.println("반올림 결과 : "+result);
    }

}
