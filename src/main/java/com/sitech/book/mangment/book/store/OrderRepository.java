package com.sitech.book.mangment.book.store;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query methods

    List<Order> findByTotalPriceGreaterThan(double price);

    List<Order> findByBooks(Book book);

    // You can add more custom query methods based on your needs
}
