package list_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookController {
    List<Book> bookList= new ArrayList<Book>();
    public BookController() {
        bookList.add(new Book("느리게 나이드는 습관" , "정희원", "인문", 16200));
        bookList.add(new Book("코스모스" , "칼 세이건", "자연과학", 17910));
        bookList.add(new Book("나에게 들려주는 예쁜 말" , "김종원", "어린이", 15610));
        bookList.add(new Book("혼자 공부하는 자바" , "신용권", "기타", 25240));
    }
    public void insertBook(Book bk) {
        bookList.add(bk);
    }
    public List<Book> selectList(){
        return bookList;
    }

    public List<Book> searchBook(String keyword){
        List<Book> searchList = new ArrayList<Book>();

        for(int i = 0 ; i<bookList.size(); i++) {

            Book book =bookList.get(i);
            if(book.getTitle().contains(keyword)){
                searchList.add(bookList.get(i));
            }

        }
        return searchList;
    }
    public Book deleteBook(String title, String author) {
        //삭제된 도서를 담을 객체 선언
        Book removeBook = null;
        for(Book book : bookList){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
                bookList.remove(book);
                removeBook = book;
                break;
            }

        }return removeBook;

    }
    public int ascBook() {
        Collections.sort(bookList,new Comparator<Book>() {
            @Override
            public int compare(Book b1,Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });
     return 1;
    }

}
