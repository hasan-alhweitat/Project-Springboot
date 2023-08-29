package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.Book;
import com.sitech.book.mangment.book.store.BookRepository;
import com.sitech.book.mangment.book.store.Cart;
import com.sitech.book.mangment.book.store.CartRepository;
import com.sitech.book.mangment.book.store.mapper.CartMappers;
import com.sitech.book.mangment.book.store.service.CartService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final BookRepository bookRepository;
    private final CartMappers cartMappers;
    protected Cart save;

    public CartServiceImpl(CartRepository cartRepository, BookRepository bookRepository, CartMappers cartMappers) {
        this.cartRepository = cartRepository;
        this.bookRepository = bookRepository;
        this.cartMappers = cartMappers;
    }

    public Cart createCart() {
        Cart cart = cartRepository.save(new Cart());
        return cartMappers.cart(cart);
    }

    @Override
    public  Cart addToCart(Long cartId, Long bookId) throws Throwable {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        Book book = bookRepository.findById(bookId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        book.setCart(cart);
        bookRepository.save(book);
        return cart;
    }

    @Override
    public void removeFromCart(Long cartId, Long bookId) throws Throwable {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        Book book = bookRepository.findById(bookId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        book.setCart(null);
        bookRepository.save(book);
    }

}
