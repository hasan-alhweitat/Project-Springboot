package com.sitech.book.mangment.book.store.dto;

public class BookDTO {
    private Long id;
    private String bookName;
    private int year;
    private String category;
    private double price;

    public BookDTO(){
    }

    public BookDTO( String bookName, int year, String category, double price) {
        this.bookName = bookName;
        this.year = year;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", year=" + year +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}