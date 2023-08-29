package com.sitech.book.mangment.book.store.controller;

import com.sitech.book.mangment.book.store.Order;
import com.sitech.book.mangment.book.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = orderService.getOrderById(id);
        if (order != null) {
            return new ResponseEntity<>(order, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Order> createOrder() {
        Order createdOrder = orderService.createOrder();
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @PostMapping("/{orderId}/addBook/{bookId}")
    public ResponseEntity<Void> addBookToOrder(
            @PathVariable Long orderId,
            @PathVariable Long bookId) {
        orderService.addBookToOrder(orderId, bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/{orderId}/removeBook/{bookId}")
    public ResponseEntity<Void> removeBookFromOrder(
            @PathVariable Long orderId,
            @PathVariable Long bookId) {
        orderService.removeBookFromOrder(orderId, bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // Additional methods can be added here for custom queries or operations
}