package com.sitech.book.mangment.book.store.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "orders")
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name="nameOrder")
    private String nameOrder;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

/*    @OneToMany
//    @JoinColumn(name = "book_id")
//    private List<Book> books = new ArrayList<>();
//    public Order(Long id, List<Book> books) {
//        this.id = id;
//        this.books = books;
//    public List<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(List<Book> books) {
//        this.books = books;
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void removeBook(Book book) {
//        books.remove(book);
//    }
//
//    public int getTotalNumberOfBooks() {
//        return books.size();
//    }
//
//    public double getTotalPrice() {
//        double totalPrice = 0;
//        for (Book book : books) {
//            totalPrice += book.getPrice();
//        }
//        return totalPrice;
//    }
*/
}