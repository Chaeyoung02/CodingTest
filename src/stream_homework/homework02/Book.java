package stream_homework.homework02;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Book implements Serializable {
    private static final long serialVersionUID = -3992767589447459680L;
    private String title;
    private String author;
    private int price;
    private LocalDate date;
    private double discount;

    public Book(){}

    public Book(String title, String author, int price, LocalDate date, double discount){
        this.title =title;
        this.author = author;
        this.price =price;
        this.date = date;
        this.discount = discount;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String toString(){

        DateTimeFormatter dtf
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 ");
        return title + "\t"+ author + "\t"+ price +"\t"+dtf.format(date) + "\t"+discount;
    }
}
