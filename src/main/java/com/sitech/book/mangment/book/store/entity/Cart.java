package com.sitech.book.mangment.book.store.entity;

import jakarta.persistence.*;

@Entity(name = "carts")
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

/*    @OneToMany
//    @JoinColumn(name = "book_id")
//    private List<Book> books = new ArrayList<>();
//    public Cart(Long id, List<Book> books) {
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
//            totalPrice += book.getPrice(); // Assuming you have a price attribute in the Book class
//        }
//        return totalPrice;
//    }
*/
}