package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Cart;

import java.util.List;

public interface CartService {
        void deleteCart(Long id);
        Cart createCart();
        Cart addBookToCart(Long cartId, Long bookId);
        void removeBookFromCart(Long cartId, Long bookId);
        List<Cart> getAllCarts();
        Cart getCartById(Long id);
        int getTotalNumberOfBooksInCart(Long cartId);
        double getTotalPriceInCart(Long cartId);
}
