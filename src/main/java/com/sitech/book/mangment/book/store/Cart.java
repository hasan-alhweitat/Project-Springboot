package com.sitech.book.mangment.book.store;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "cart")
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "cart")
    private List<Book> books = new ArrayList<>();

    public Cart() {
    }

    public Cart(Long id, List<Book> books) {
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
        book.setCart(this);
    }

    public void removeBook(Book book) {
        books.remove(book);
        book.setCart(null);
    }

    public int getTotalNumberOfBooks() {
        return books.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice(); // Assuming you have a price attribute in the Book class
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "Id: " + id + '}';
    }
}

