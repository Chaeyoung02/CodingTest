package api_homework;
import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num2 = (int)Math.random() * 100;
        System.out.println(num2);

        int count = 0;

        while(true) {
            System.out.println("1~100 사이의 임의의 난수를 맞춰보세요 ");
            System.out.print("숫자를 입력 : ");
            int num = sc.nextInt();
            sc.nextLine();
            if(num > num2) {
                System.out.println("DOWN!");
                count++;
                continue;

            }else if(num < num2) {
                System.out.println("UP!");
                count++;
                continue;
            }
            else if(num == num2) {
                System.out.println("정답입니다.");
                count++;
                break;
            }
        }
        System.out.println(count+"회만에 맞추셨습니다.");
    }

}
