package stream_homework.homework3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileMenu {
    Scanner sc = new Scanner(System.in);

    File dir = new File("\\storage\\practice02");

    FileController fc = new FileController();
    public void mainMenu() {
        while(true) {
            //입력받기
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호: ");
            String num = sc.nextLine();

            if(num.equals("1")) {
                fileSave();
            }else if(num.equals("2")){
                fileOpen();
            }else if(num.equals("3")) {
                fileEdit();
            }else if(num.equals("9")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
    public void fileSave(){
        StringBuilder sb = new StringBuilder();


        while(true) {

            System.out.println("파일에 저장할 내용을 입력하세요");
            System.out.println("ex끝it 이라고 입력하면 종료됩니다");
            System.out.print("내용 : ");
            String text = sc.nextLine();

            if(text.equals("ex끝it")) {
                break;
            }
            sb.append(text).append("\n");
            System.out.println(sb);
        }
        while(true) {
            System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
            String fileName = sc.nextLine();
            File file = new File(dir, fileName);

            try {
                boolean result = fc.checkName(fileName);
                if(result == false) {
                    fc.fileSave(fileName, sb);
                    break;
                }else {
                    System.out.print("이미 존재하는 파일입니다. 덮어쓰겠습니까?(y/n)");
                    String answer = sc.nextLine();
                    if(answer.equals("y")) {
                        fc.fileSave(fileName, sb);
                        break;
                    }else if(answer.equals("n")) {
                        continue;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }



    }
    public void fileOpen() {
        System.out.print("열 파일 명 : ");
        String name = sc.nextLine();

        if(fc.checkName(name)) {
            System.out.println(fc.fileOpen(name));
        }else {
            System.out.println("없는 파일 입니다.");
            mainMenu();
        }
    }
    public void fileEdit() {
        System.out.print("수정할 파일 명 : ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        if(fc.checkName(name)) {
            while(true) {
                System.out.println("파일에 저장할 내용을 입력하세요");
                System.out.println("ex끝it 이라고 입력하면 종료됩니다");
                System.out.print("내용 : ");
                String text = sc.nextLine();

                if(text.equals("ex끝it")) {
                    fc.fileEdit(name, sb);
                    break;
                }
                sb.append(text).append("\n");
            }


        }else {
            System.out.println("없는 파일 입니다.");
            mainMenu();
        }
    }
}
