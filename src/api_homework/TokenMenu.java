package api_homework;


import java.util.Scanner;

public class TokenMenu {
    Scanner sc = new Scanner(System.in);
    TokenController tc = new TokenController();
    public void mainMenu() {
        //번호 입력
        while(true) {
            System.out.println("1. 지정 문자열");
            System.out.println("2. 입력 문자열");
            System.out.println("9. 프로그램 끝내기");
            System.out.print("메뉴번호 : ");
            int num = sc.nextInt();
            sc.nextLine();

            if(num == 1 || num == 2 || num == 9) {
                if(num ==1) {
                    tokenMenu();
                }else if(num ==2) {
                    inputMenu();
                }else {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }
        }



    }
    public void tokenMenu() {
        String str = "J a v a P r o g r a m ";
        System.out.println("토큰 처리 전 글자 :"+str +
                "\n 토큰 처리 후 개수 : "+str.length());

        String s = tc.afterToken(str);

        System.out.println("토큰 처리 후 글자 : " + s
                + "\n 토큰 처리 후 개수 : "+s.length());

        System.out.println("모두 대문자로 변환 : " + s.toUpperCase());


    }
    public void inputMenu() {
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        System.out.println("첫 글자 대문자 : "+tc.firstCap(str));
        System.out.print("찾을 문자를 하나 입력하세요 : ");
        String c = sc.nextLine();
        char voca = c.charAt(0);

        System.out.println(c + " 문자가 들어간 개수 : "+tc.findChar(str, voca));

    }
}
