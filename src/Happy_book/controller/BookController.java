package Happy_book.controller;

import Happy_book.model.dao.BookDao;
import Happy_book.model.vo.Book;
import Happy_book.view.BookMenu;

import java.util.ArrayList;
import java.util.List;

public class BookController {
    BookMenu bm = new BookMenu();
    public void selectAll(){
        List<Book> list = new ArrayList<>();
        list = new BookDao().selectAll();
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public void insert(String name, String author, String publisher, String price){
        Book b = new Book();
        b.setBk_name(name);
        b.setBk_author(author);
        b.setBk_publisher(publisher);
        b.setBk_price(price);

        int result = new BookDao().insert(b);
        if(result > 0) {
            System.out.println("추가 성공");
            bm.employeeMenu();
        }else {
            System.out.println("추가 실패");
            bm.employeeMenu();
        }
    }

    public void delete(String name, String author, String publisher){
        Book b = new Book();
        b.setBk_name(name);
        b.setBk_author(author);
        b.setBk_publisher(publisher);

        int result = new BookDao().delete(b);
        if(result > 0){
            System.out.println("삭제 완료");
            bm.employeeMenu();
        }else {
            System.out.println("삭제 실패");
            bm.employeeMenu();
        }
    }
}
