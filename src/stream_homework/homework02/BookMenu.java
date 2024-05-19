package stream_homework.homework02;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();
    List<Book> list = new ArrayList<>();
    Book[] bArr;
    public BookMenu(){
        bc.makeFile();//파일을 만들어 주기 위한 호출
        bArr=bc.fileRead();




    }

    public void mainMenu(){
        while(true) {
            System.out.println("1. 도서 추가 저장");
            System.out.println("2. 저장 도서 출력");
            System.out.println("9. 프로그램 끝내기");
            System.out.print("메뉴 번호 :");
            String num = sc.next();
            sc.nextLine();

            if (num.equals("1")) {
                fileSave();
            } else if (num.equals("2")) {
                fileRead();
            } else if (num.equals("9")){
                System.out.println("종료");
                break;
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
    public void fileSave() {

            //입력받기
            System.out.print("도서 명 :");
            String title = sc.nextLine();
            System.out.print("저자 명 : ");
            String author = sc.nextLine();
            System.out.print("도서 가격 : ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("출판 날짜(yyyy-mm-dd) :");
            String calenders = sc.nextLine();
            System.out.print("할인율 : ");
            double discount = sc.nextDouble();


            //배열에 '-'로 나눈 값 저장
            String[] arr = calenders.split("-");
            Calendar c = Calendar.getInstance();
            //캘린더에 그 값들을 저장
            c.set(Integer.parseInt(arr[0]),
                    Integer.parseInt(arr[1]) - 1,
                    Integer.parseInt(arr[2]));
            //book에 넣어주기 위한 localDate로 변환
            LocalDate ld = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
                    c.get(Calendar.DAY_OF_MONTH));


            //book 객체에 요소 담기
            Book book = new Book(title, author, price, ld, discount);

            //bc.fileSave(bArr);
            bc.fileSave(new Book[]{book});
    }
    public void fileRead() {
        Book[] books = bc.fileRead();//배열에다가 객체를 넣기
         for (Book b : books) {
             //for -each 반복문을 통해 객체 값을 하나하나 빼기
             if(b == null){
                 break;
             }
             //객체 값을 프린트하기 위해 그냥 하게 되면 객체 주소값? 같은 것이 나오기때문에 override 된 toString 사용

             System.out.println(b.toString());
        }
    }
}
