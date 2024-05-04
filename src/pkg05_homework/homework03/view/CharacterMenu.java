package pkg05_homework.homework03.view;

import pkg05_homework.homework03.controller.CharacterController;
import pkg05_homework.homework03.exception.CharCheckException;

import java.util.Scanner;

public class CharacterMenu {
    public void menu(){

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.nextLine();

        try {
            CharacterController c = new CharacterController();
            c.countAlpha(str);
            System.out.println("'" +str + "' 에 포함된 영문자 개수 : " + c.countAlpha(str));
        }catch (CharCheckException e){

            System.out.println(e.getMessage());

        }


    }
}
