package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.dto.OrderRequest;
import com.sitech.book.mangment.book.store.dto.OrderResponse;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest orderRequest);
    OrderResponse getOrderById(Long id) throws ChangeSetPersister.NotFoundException;
    OrderResponse updateOrder(Long id, OrderRequest orderRequest);
    boolean deleteOrder(Long id);
    List<OrderResponse> getAllOrders();

    /*
    //void addBookToOrder(Long orderId, Long bookId);
    //void removeBookFromOrder(Long orderId, Long bookId);
    //int getTotalNumberOfBooksInOrder(Long orderId);
    //double getTotalPriceInOrder(Long orderId);
     */
}