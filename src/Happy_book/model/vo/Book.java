package Happy_book.model.vo;

import java.time.LocalDateTime;

public class Book {
    private int bk_no;
    private String bk_name;
    private String bk_author;
    private String bk_publisher;
    private LocalDateTime bk_date;
    private String bk_price;
    private int bk_amount;

    public Book() {
    }

    public Book(int bk_no, String bk_name, String bk_author, String bk_publisher, LocalDateTime bk_date, String bk_price, int bk_amount) {
        this.bk_no = bk_no;
        this.bk_name = bk_name;
        this.bk_author = bk_author;
        this.bk_publisher = bk_publisher;
        this.bk_date = bk_date;
        this.bk_price = bk_price;
        this.bk_amount = bk_amount;
    }

    public int getBk_no() {
        return bk_no;
    }

    public void setBk_no(int bk_no) {
        this.bk_no = bk_no;
    }

    public String getBk_name() {
        return bk_name;
    }

    public void setBk_name(String bk_name) {
        this.bk_name = bk_name;
    }

    public String getBk_author() {
        return bk_author;
    }

    public void setBk_author(String bk_author) {
        this.bk_author = bk_author;
    }

    public String getBk_publisher() {
        return bk_publisher;
    }

    public void setBk_publisher(String bk_publisher) {
        this.bk_publisher = bk_publisher;
    }

    public LocalDateTime getBk_date() {
        return bk_date;
    }

    public void setBk_date(LocalDateTime bk_date) {
        this.bk_date = bk_date;
    }

    public String getBk_price() {
        return bk_price;
    }

    public void setBk_price(String bk_price) {
        this.bk_price = bk_price;
    }

    public int getBk_amount() {
        return bk_amount;
    }

    public void setBk_amount(int bk_amount) {
        this.bk_amount = bk_amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bk_no=" + bk_no +
                ", bk_name='" + bk_name + '\'' +
                ", bk_author='" + bk_author + '\'' +
                ", bk_publisher='" + bk_publisher + '\'' +
                ", bk_date=" + bk_date +
                ", bk_price='" + bk_price + '\'' +
                ", bk_amount=" + bk_amount +
                '}';
    }
}
