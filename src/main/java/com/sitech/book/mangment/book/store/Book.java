package com.sitech.book.mangment.book.store;

import jakarta.persistence.*;

@Entity(name = "book")
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "year")
    private int year;

    @Column(name = "category")
    private String category;

    public Book() {

    }
    public Book(long id, String bookName, int year, String category) {
        super();
        this.id= id;
        this.bookName = bookName;
        this.year = year;
        this.category= category;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User [ID: " + id +", Name Book: " + bookName + ", Year: " + year +", Category: " + category +"]";
    }


    public <cart> void setCart(cart cart) {
    }

    public void setOrder(Order order) {
    }
}
