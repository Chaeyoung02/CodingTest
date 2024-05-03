package pkg05_homework.homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args){
        int num = (int)Math.random()*50 +1;
        System.out.print(num);
        int count = 0;
        while(true){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("1~50사이의 숫자 : ");
                int number = sc.nextInt();
                count++;
                if(number > 0 && number <= 50){
                    if(number == num){
                        System.out.println("축하합니다~ 정답이에요");
                        System.out.println("시도횟수 : " + count);
                        break;
                    }else if(number > num){
                        System.out.println("Down!");

                    } else {
                        System.out.println("Up!");
                    }

                }
                else {
                    System.out.println("범위에 맞는 숫자를 작성해주세요");
                }
            }catch (Exception e){
                System.out.println("잘못된 값입니다. 숫자를 입력해주세요");

            }
        }



    }
}
