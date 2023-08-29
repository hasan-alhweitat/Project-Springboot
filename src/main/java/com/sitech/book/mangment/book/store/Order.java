package com.sitech.book.mangment.book.store;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToMany(mappedBy = "order")
    private List<Book> books = new ArrayList<>();

    public Order() {
    }

    public Order(Long id, List<Book> books) {
        this.id = id;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        books.add(book);
        book.setOrder(this);
    }

    public void removeBook(Book book) {
        books.remove(book);
        book.setOrder(null);
    }

    public int getTotalNumberOfBooks() {
        return books.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" + "Id:" + id + '}';
    }
}