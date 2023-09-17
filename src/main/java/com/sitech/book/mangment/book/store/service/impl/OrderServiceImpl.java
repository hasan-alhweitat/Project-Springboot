package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.dto.OrderRequest;
import com.sitech.book.mangment.book.store.dto.OrderResponse;
import com.sitech.book.mangment.book.store.entity.Order;
import com.sitech.book.mangment.book.store.mapper.OrderMapper;
import com.sitech.book.mangment.book.store.repository.OrderRepository;
import com.sitech.book.mangment.book.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.toOrderDTOs(orders);
    }

    @Override
    public OrderResponse getOrderById(Long id) throws ChangeSetPersister.NotFoundException{
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            return orderMapper.toOrderDTO(order);
        }
        return null;
    }

    @Override
    public OrderResponse createOrder(OrderRequest orderRequest){
        Order order = orderMapper.toOrder(orderRequest);
        Order savedOrder = orderRepository.save(order);
        return orderMapper.toOrderDTO(savedOrder);
    }

    @Override
    public OrderResponse updateOrder(Long id, OrderRequest orderRequest) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            orderMapper.updateOrderFromDTO(orderRequest, existingOrder);
            Order updatedOrder = orderRepository.save(existingOrder);
            return orderMapper.toOrderDTO(updatedOrder);
        }
        return null;
    }

    @Override
    public boolean deleteOrder(Long id) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            orderRepository.delete(existingOrder);
            return true;
        }
        return false;
    }

    /*
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
    }*/
}