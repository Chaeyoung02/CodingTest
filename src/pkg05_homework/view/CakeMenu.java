package pkg05_homework.view;

import pkg05_homework.controller.ChocolateController;
import pkg05_homework.controller.GreenTeaController;

import java.util.Scanner;

public class CakeMenu {
    Scanner sc = new Scanner(System.in);

    ChocolateController c = new ChocolateController();

    GreenTeaController g = new GreenTeaController();
    public void mainMenu() {
        while(true){
            System.out.println("====어떤 케이크를 만드시겠습니까?====");
            System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개");
            System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브: 50개");
            System.out.println("9. 취소");
            System.out.print("메뉴 확인: ");
            int num = sc.nextInt();
            if(num != 1 && num != 2 && num != 9){
                System.out.println("잘못된 번호입니다.");
            }else if(num == 9){
                System.out.println("종료합니다.");
                break;
            }
            else if(num == 1) {
                chocolateMenu();
            }else{
                greenTeaMenu();
            }
        }
    }

    public void chocolateMenu() {

        System.out.print(" 밀가루(g) : ");
        double flour = sc.nextDouble();
        System.out.print(" 크림(g) : ");
        double cream = sc.nextDouble();
        System.out.print(" 체리(개) ");
        int cherry = sc.nextInt();
        System.out.print(" 초코릿 칩(개) : ");
        int chip = sc.nextInt();


        System.out.println(c.bakeChocolateCake(flour,cream, cherry, chip));
        System.out.println("초콜릿 케이크가 완성되었습니다.");




    }

    public void greenTeaMenu() {
        System.out.print(" 밀가루(g) : ");
        double flour = sc.nextDouble();
        System.out.print(" 크림(g) : ");
        double cream = sc.nextDouble();
        System.out.print(" 녹차파우더(g) : ");
        double powder = sc.nextDouble();
        System.out.print(" 치즈큐브(개) : ");
        int cheese = sc.nextInt();


        System.out.print(g.bakeGreenCake(flour,cream, powder, cheese));
        System.out.println("녹차 케이크가 완성되었습니다.");

    }
}
