package com.sitech.book.mangment.book.store;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    // Custom query methods

    List<Cart> findByTotalPriceGreaterThan(double price);

    List<Cart> findByBooks(Book book);

    // You can add more custom query methods based on your needs
}