package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Cart;
import com.sitech.book.mangment.book.store.mapper.CartDto;

public interface CartService {
        CartDto createCart();
        Cart addToCart(Long cartId, Long bookId) throws Throwable;
        void removeFromCart(Long cartId, Long bookId) throws Throwable;
}
