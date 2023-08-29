package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.Book;
import com.sitech.book.mangment.book.store.BookRepository;
import com.sitech.book.mangment.book.store.Order;
import com.sitech.book.mangment.book.store.OrderRepository;
import com.sitech.book.mangment.book.store.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final BookRepository bookRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, BookRepository bookRepository) {
        this.orderRepository = orderRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order createOrder() {
        Order order = new Order();
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void addBookToOrder(Long orderId, Long bookId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        Book book = bookRepository.findById(bookId).orElse(null);

        if (order != null && book != null) {
            order.addBook(book);
            orderRepository.save(order);
        }
    }

    @Override
    public void removeBookFromOrder(Long orderId, Long bookId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        Book book = bookRepository.findById(bookId).orElse(null);

        if (order != null && book != null) {
            order.removeBook(book);
            orderRepository.save(order);
        }
    }

    @Override
    public int getTotalNumberOfBooksInOrder(Long orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            return order.getTotalNumberOfBooks();
        }
        return 0;
    }

    @Override
    public double getTotalPriceInOrder(Long orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            return order.getTotalPrice();
        }
        return 0.0;
    }
}
