package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.dto.CartRequest;
import com.sitech.book.mangment.book.store.dto.CartResponse;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface CartService {
        CartResponse createCart(CartRequest cartRequest);
        CartResponse getCartById(Long id)throws ChangeSetPersister.NotFoundException;
        CartResponse updateCart(Long id, CartRequest cartRequest);
        boolean deleteCart(Long id);
        List<CartResponse> getAllCarts();

        /*
        //void addBookToCart(Long cartId, Long bookId);
        //void removeBookFromCart(Long cartId, Long bookId);
        //int getTotalNumberOfBooksInCart(Long cartId);
        //double getTotalPriceInCart(Long cartId);
         */
}