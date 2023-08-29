package com.sitech.book.mangment.book.store.controller;

import com.sitech.book.mangment.book.store.Order;
import com.sitech.book.mangment.book.store.service.OrderService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder() {
        Order order = orderService.createOrder();
        return ResponseEntity.ok(order);
    }

    @PostMapping("/{orderId}/books/{bookId}")
    public ResponseEntity<Order> addToOrder(@PathVariable Long orderId, @PathVariable Long bookId) throws ChangeSetPersister.NotFoundException {
        Order order = orderService.addToOrder(orderId, bookId);
        return ResponseEntity.ok(order);
    }

    @DeleteMapping("/{orderId}/books/{bookId}")
    public ResponseEntity<Void> removeFromOrder(@PathVariable Long orderId, @PathVariable Long bookId) throws ChangeSetPersister.NotFoundException {
        orderService.removeFromOrder(orderId, bookId);
        return ResponseEntity.noContent().build();
    }
}
