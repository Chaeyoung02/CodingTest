package Happy_book.view;

import Happy_book.controller.UserController;

import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("***회원로그인***");
        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("비밀번호: ");
        String pwd = sc.nextLine();
        new UserController().Login(id,pwd);
    }
    public void managerMenu() {
        System.out.println("***관리자메뉴***");
        System.out.println("1. 직원 계정 생성");
        System.out.println("2. 직원 정보 수정");
        System.out.println("3. 퇴사 처리");
        System.out.print("번호입력 : ");
        String num =  sc.nextLine();
        if(num.equals("1")){
            insertEmployee();
        }else if(num.equals("2")){
            //updateEmployee();
        }else if(num.equals("3")){
            //deleteEmployee();
        }

    }
    //계정 생성
    public void insertEmployee() {
        System.out.println("***계정생성***");
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pwd = sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();

        new UserController().insert(id, pwd, name);

    }
}
