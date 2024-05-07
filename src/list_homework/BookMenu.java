package list_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();

    public void mainMenu() {
        System.out.println("== 가남 도서관에 오신걸 환영==");
        System.out.println("원하시는 업무의 번호를 선택하세요.");
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서 전체 조회");
        System.out.println("3. 도서 검색 조회");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 오름차순 정렬");
        System.out.println("9. 종료");
        while(true) {
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();
            if(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9 ) {
                if(num == 1) {
                    insertBook();
                }else if(num ==2) {
                    selectList();
                }else if(num == 3) {
                    searchBook();
                }else if(num ==4 ) {
                    deleteBook();
                }else if(num ==5) {
                    ascBook();
                }else {
                    break;
                }
            }else {
                System.out.println("잘못입력하셨습니다 다시 입력");
            }
        }



    }
    public void insertBook() {
        //입력받기
        System.out.print("도서명 입력: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.print("저자명 입력: ");
        String author = sc.nextLine();
        System.out.println();
        System.out.print("장르 입력: ");
        int category = sc.nextInt();
        System.out.println();
        System.out.print("가격 입력: ");
        int price = sc.nextInt();

        //book객체 생성후 넣기
        Book b = new Book();
        b.setTitle(name);
        b.setAuthor(author);
        if(category == 1) {
            b.setCategory("인문");
        }else if(category == 2) {
            b.setCategory("자연과학");
        }else if(category == 3) {
            b.setCategory("어린이");
        }else {
            b.setCategory("기타");
        }
        b.setPrice(price);

        //controller에 전달
        bc.insertBook(b);



    }
    public void selectList() {
        //메소드 호출

        List<Book> bookList =  bc.selectList();


        //조건식 이용
        if(bookList.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다");
        }else {
            for(int i = 0; i<bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
        }

    }
    public void searchBook() {

        //도서검색 키워드
        System.out.print("도서 입력 키워드 : ");
        String keyword = sc.nextLine();
        //키워드 전달
        List<Book> searchList = bc.searchBook(keyword);

        if(searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다");
        }else {
            for(int i = 0; i<searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        }

       }
    public void deleteBook() {

        //삭제 도서명
        System.out.print("삭제할 도서명 : ");
        String title = sc.nextLine();

        //삭제 저자명
        System.out.print("삭제할 저자명 : ");
        String author = sc.nextLine();

        Book remove = bc.deleteBook(title, author);

        if(remove != null) {
            System.out.println("성공적으로 삭제되었습니다");

        }else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }
    public void ascBook() {
        int num = bc.ascBook();
        if(num == 1){
            System.out.println("정렬에 성공하셨습니다.");

        }else {
            System.out.println("정렬에 실패하셨습니다.");
        }
    }

}
