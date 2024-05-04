package pkg05_homework.homework04.view;

import pkg05_homework.homework04.controller.NumberController;
import pkg05_homework.homework04.exception.NumRangeException;

import java.util.Scanner;

public class NumberMenu {
    public void menu(){
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("정수1 : ");
            int num1 = sc.nextInt();
            System.out.print("정수2 : ");
            int num2 = sc.nextInt();
            NumberController nc = new NumberController();
            nc.checkDouble(num1, num2);
            System.out.println(num1+"은(는) "+ num2 + "의 배수인가 ? " + nc.checkDouble(num1, num2));
        }catch (NumRangeException e){
           System.out.println(e.getMessage()) ;
        }
    }
}
