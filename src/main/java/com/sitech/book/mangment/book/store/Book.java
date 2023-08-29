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

    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Book() {
    }

    public Book(Long id, String bookName, int year, String category, double price) {
        this.id = id;
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

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void assignToOrder(Order order) {
        this.order = order;
        order.getBooks().add(this);
    }
    public void removeFromOrder() {
        if (order != null) {
            order.getBooks().remove(this);
            this.order = null;
        }
    }

    public void addToCart(Cart cart) {
        this.cart = cart;
        cart.getBooks().add(this);
    }
    public void removeFromCart() {
        if (cart != null) {
            cart.getBooks().remove(this);
            this.cart = null;
        }
    }

    @Override
    public String toString() {
        return "User [ID: " + id +", Name Book: " + bookName + ", Year: " + year +", Category: " + category +"]";
    }
}
