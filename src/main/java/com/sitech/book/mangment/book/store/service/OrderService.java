package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder();
    void deleteOrder(Long id);
    void addBookToOrder(Long orderId, Long bookId);
    void removeBookFromOrder(Long orderId, Long bookId);
    int getTotalNumberOfBooksInOrder(Long orderId);
    double getTotalPriceInOrder(Long orderId);
}
