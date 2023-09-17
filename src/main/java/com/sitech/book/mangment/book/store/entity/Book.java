package com.sitech.book.mangment.book.store.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "books")
@Table(name = "books")
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

    @Column(name = "price")
    private BigDecimal price;

//    public void assignToOrder(Order order) {
//        this.order = order;
//        order.getBooks().add(this);
//    }
//    public void removeFromOrder() {
//        if (order != null) {
//            order.getBooks().remove(this);
//            this.order = null;
////        }
//    }
//
//    public void addToCart(Cart cart) {
//        this.cart = cart;
//        cart.getBooks().add(this);
//    }
//    public void removeFromCart() {
//        if (cart != null) {
//            cart.getBooks().remove(this);
//            this.cart = null;
//        }
//    }
}