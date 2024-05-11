package set_homework;

import java.util.Iterator;
import java.util.Scanner;




public class LotteryMenu {
    Scanner sc = new Scanner(System.in);
    LotteryController lc = new LotteryController();

    public void mainMenu() {
        while(true) {
            System.out.println("=== 로또 번호 추첨 ===");
            System.out.println("원하시는 메뉴의 번호를 입력하세요");
            System.out.println("1. 추첨 대상 추가");
            System.out.println("2. 추첨 대상 삭제");
            System.out.println("3. 추첨 대상 목록 조회");
            System.out.println("4. 당첨 대상 구성");
            System.out.println("5. 정렬된 당첨 대상 확인");
            System.out.println("6. 당첨 대상 검색");
            System.out.println("9. 종료");
            System.out.print("메뉴번호 : ");
            int num = sc.nextInt();
            sc.nextLine();
            if(num == 1 || num ==2|| num == 3|| num == 4|| num == 5|| num ==6||
                    num ==9) {
                if(num == 1) {
                    insertObject();
                }else if(num == 2) {
                    deleteObject();
                }
                else if(num == 3) {
                    searchObject();;
                }
                else if(num == 4) {
                    winObject();
                }
                else if(num == 5) {
                    sortedWinObject();
                }
                else if(num == 6) {
                    searchWinner();
                }
                else if(num == 9) {
                    break;
                }
            }
            else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

            }
        }

    }
    public void insertObject() {
        //추가할 대상 수 입력
        System.out.print("추가할 추첨 대상 수: ");
        int num = sc.nextInt();
        sc.nextLine();




        //입력받은 수 만큼 추첨자 이름 핸드폰 번호 입력

        int i = 0;
        while(i < num) {
            //매개변수 생성 자 이용
            Lottery l = new Lottery();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            l.setName(name);
            System.out.print("휴대폰 번호(-빼고) : ");
            String phone = sc.nextLine();
            l.setPhone(phone);
            boolean check = lc.insertObject(l);
            if(check) {
                i++;

            }else {
                System.out.println("중복대상입니다. 다시 입력하세요");
                continue;
            }

        }
        System.out.println((i)+"명 추가 완료되었습니다");


    }
    public void deleteObject() {
        System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요");
        //삭제할 대상의 이름과 휴대폰 번호
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("휴대폰 번호(-빼고) : ");
        String phone = sc.nextLine();
        Lottery l = new Lottery(name, phone);
        boolean check = lc.deleteObject(l);

        if(check) {
            System.out.println("삭제 완료되었습니다.");

        }else {
            System.out.println("존재하지 않는 대상입니다.");
        }
    }
    public void searchObject() {
        System.out.print(lc.searchObject());
    }
    public void winObject() {
        if(lc.winObjecSet() ==  null){
            System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
        } else{
            System.out.println( lc.winObjecSet());
        }

    }
    public void sortedWinObject() {

        //Iterator을 이용하여 값 도출
        Iterator<Lottery> itr= lc.sortedWinObject().iterator() ;
        //lc.sortedWinObject()만 잘 건들이기

        while(itr.hasNext()) {
            Lottery l = itr.next();
            System.out.println(l);
        }


    }
    public void searchWinner() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("휴대폰 번호(-빼고) : ");
        String phone = sc.nextLine();
        Lottery l = new Lottery(name, phone);
        boolean check = lc.searchWinnder(l);
        if(check) {
            System.out.println("축하합니다. 당첨 목록에 존재합니다");
        }else {
            System.out.println("다음 기회에!");

        }
    }
}