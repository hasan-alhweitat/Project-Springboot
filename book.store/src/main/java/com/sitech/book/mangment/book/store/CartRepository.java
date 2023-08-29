package com.sitech.book.mangment.book.store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    // You can add custom query methods if needed
}