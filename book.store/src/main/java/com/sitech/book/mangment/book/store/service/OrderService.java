package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Order;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface OrderService {
    Order createOrder();
    Order addToOrder(Long orderId, Long bookId) throws ChangeSetPersister.NotFoundException;
    void removeFromOrder(Long orderId, Long bookId) throws ChangeSetPersister.NotFoundException;
}
