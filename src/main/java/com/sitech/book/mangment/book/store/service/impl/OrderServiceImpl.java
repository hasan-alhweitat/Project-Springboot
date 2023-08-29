package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.Book;
import com.sitech.book.mangment.book.store.BookRepository;
import com.sitech.book.mangment.book.store.Order;
import com.sitech.book.mangment.book.store.OrderRepository;
import com.sitech.book.mangment.book.store.service.OrderService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final BookRepository bookRepository;

    public OrderServiceImpl(OrderRepository orderRepository, BookRepository bookRepository) {
        this.orderRepository = orderRepository;
        this.bookRepository = bookRepository;
    }
    @Override
    public Order createOrder() {
        return orderRepository.save(new Order());
    }

    @Override
    public Order addToOrder(Long orderId, Long bookId) throws ChangeSetPersister.NotFoundException {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        Book book = bookRepository.findById(bookId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        book.setOrder(order);
        bookRepository.save(book);
        return order;
    }

    @Override
    public void removeFromOrder(Long orderId, Long bookId) throws ChangeSetPersister.NotFoundException {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        Book book = bookRepository.findById(bookId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        book.setOrder(null);
        bookRepository.save(book);
    }
}
