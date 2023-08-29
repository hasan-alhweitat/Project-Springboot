package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Cart;

public interface CartService {
        Cart createCart();
        Cart addToCart(Long cartId, Long bookId) throws Throwable;
        void removeFromCart(Long cartId, Long bookId) throws Throwable;
}
