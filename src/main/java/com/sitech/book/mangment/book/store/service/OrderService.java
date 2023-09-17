package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.dto.OrderDTO;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(Long id) throws ChangeSetPersister.NotFoundException;
    OrderDTO updateOrder(Long id, OrderDTO orderDTO);
    boolean deleteOrder(Long id);
    List<OrderDTO> getAllOrders();

    /*
    //void addBookToOrder(Long orderId, Long bookId);
    //void removeBookFromOrder(Long orderId, Long bookId);
    //int getTotalNumberOfBooksInOrder(Long orderId);
    //double getTotalPriceInOrder(Long orderId);
     */
}