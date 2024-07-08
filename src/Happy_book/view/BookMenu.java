//package Happy_book.view;
//
//import Happy_book.controller.BookController;
//import Happy_book.controller.UserController;
//import Happy_book.model.vo.Book;
//import Happy_book.model.vo.User;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class BookMenu {
//    Scanner sc = new Scanner(System.in);
//
//    public void mainMenu() {
//        System.out.println("***회원로그인***");
//        System.out.print("아이디: ");
//        String id = sc.nextLine();
//        System.out.print("비밀번호: ");
//        String pwd = sc.nextLine();
//        new UserController().Login(id,pwd);
//    }
//    public void managerMenu() {
//        System.out.println("***관리자메뉴***");
//        System.out.println("1. 직원 계정 생성");
//        System.out.println("2. 직원 정보 수정");
//        System.out.println("3. 퇴사 처리");
//        System.out.print("번호입력 : ");
//        String num =  sc.nextLine();
//        if(num.equals("1")){
//            insertEmployee();
//        }else if(num.equals("2")){
//            updateEmployee();
//        }else if(num.equals("3")){
//            fireEmployee();
//        }else {
//            System.out.println("다시 입력해주세요.");
//            managerMenu();
//        }
//
//    }
//    //계정 생성
//    public void insertEmployee() {
//        System.out.println("***계정생성***");
//        System.out.print("아이디 : ");
//        String id = sc.nextLine();
//        System.out.print("비밀번호 : ");
//        String pwd = sc.nextLine();
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//
//        new UserController().insert(id, pwd, name);
//
//    }
//
//    //계정 수정
//    public void updateEmployee() {
//        System.out.println("***정보수정***");
//        System.out.print("아이디 : ");
//        String id = sc.nextLine();
//        System.out.println("--변경할 정보를 입력--");
//        System.out.print("비밀번호 : ");
//        String pwd = sc.nextLine();
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//        System.out.print("로그인 가능여부 : ");
//        String check = sc.nextLine();
//        new UserController().update(id, pwd,name, check);
//
//    }
//
//    //퇴사처리
//    public void fireEmployee() {
//        System.out.println("***퇴사처리***");
//        System.out.print("아이디 : ");
//        String id= sc.nextLine();
//        System.out.print("비밀번호 : ");
//        String pwd = sc.nextLine();
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//        new UserController().fireEmployee(id, pwd, name);
//    }
//
//    //직원 로그인
//    //직원 메뉴
//    public void employeeMenu() {
//        System.out.println("***직원메뉴***");
//        System.out.println("1. 도서 정보 등록");
//        System.out.println("2. 도서 정보 삭제");
//        System.out.println("3. 도서 판매");
//        System.out.println("4. 도서 입고");
//        System.out.print("번호 입력 :" );
//        String num = sc.nextLine();
//        if(num.equals("1")){
//            insertBook();
//        }else if(num.equals("2")){
//            deleteBook();
//        }else if(num.equals("3")){
//            new BookController().selectAll();
//            buy();
//        }else if(num.equals("4")){
//            new BookController().selectAll();
//            updateBook();
//        }else {
//            System.out.println("다시입력해주세요");
//            employeeMenu();
//        }
//    }
//    //도서정보등록
//    public void insertBook() {
//        System.out.println("***도서정보등록***");
//        System.out.print("도서이름 : ");
//        String name = sc.nextLine();
//        System.out.print("지은이 : ");
//        String author = sc.nextLine();
//        System.out.print("출판사 : ");
//        String publisher = sc.nextLine();
//        System.out.print("가격 : ");
//        String price = sc.nextLine();
//        new BookController().insert(name, author, publisher, price);
//
//    }
//
//    //도서정보삭제
//    public void deleteBook() {
//        System.out.println("***도서정보삭제***");
//        System.out.print("도서이름 : ");
//        String name = sc.nextLine();
//        System.out.print("지은이 : ");
//        String author = sc.nextLine();
//        System.out.print("출판사 : ");
//        String publisher = sc.nextLine();
//        new BookController().delete(name, author, publisher);
//    }
//    //도서입고
//    public void updateBook(){
//        System.out.println("***도서입고***");
//        System.out.println("도서이름 : ");
//        String name = sc.nextLine();
//        System.out.print("지은이 : ");
//        String author = sc.nextLine();
//        System.out.print("입고수량 : ");
//        int amount = sc.nextInt();
//        sc.nextLine();
//
//        new BookController().updateAmount(name, author, amount);
//
//    }
//
//    //도서 판매
//    public void buy(){
//        System.out.println("***도서판매***");
//        System.out.println("도서이름 : ");
//        String name = sc.nextLine();
//        System.out.print("지은이 : ");
//        String author = sc.nextLine();
//        System.out.print("판매수량 : ");
//        int amount = sc.nextInt();
//        sc.nextLine();
//
//        new BookController().buy(name, author, amount);
//    }
//}
