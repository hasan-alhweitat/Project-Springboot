package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.dto.CartDTO;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface CartService {
        CartDTO createCart(CartDTO cartDTO);
        CartDTO getCartById(Long id)throws ChangeSetPersister.NotFoundException;
        CartDTO updateCart(Long id, CartDTO cartDTO);
        boolean deleteCart(Long id);
        List<CartDTO> getAllCarts();

        /*
        //void addBookToCart(Long cartId, Long bookId);
        //void removeBookFromCart(Long cartId, Long bookId);
        //int getTotalNumberOfBooksInCart(Long cartId);
        //double getTotalPriceInCart(Long cartId);
         */
}