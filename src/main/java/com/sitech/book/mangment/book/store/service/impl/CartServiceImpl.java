package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.Book;
import com.sitech.book.mangment.book.store.BookRepository;
import com.sitech.book.mangment.book.store.Cart;
import com.sitech.book.mangment.book.store.CartRepository;
import com.sitech.book.mangment.book.store.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final BookRepository bookRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, BookRepository bookRepository) {
        this.cartRepository = cartRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getCartById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart createCart() {
        Cart cart = new Cart();
        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart addBookToCart(Long cartId, Long bookId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Book book = bookRepository.findById(bookId).orElse(null);

        if (cart != null && book != null) {
            cart.addBook(book);
            cartRepository.save(cart);
        }
        return cart;
    }

    @Override
    public void removeBookFromCart(Long cartId, Long bookId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Book book = bookRepository.findById(bookId).orElse(null);

        if (cart != null && book != null) {
            cart.removeBook(book);
            cartRepository.save(cart);
        }
    }

    @Override
    public int getTotalNumberOfBooksInCart(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            return cart.getTotalNumberOfBooks();
        }
        return 0;
    }

    @Override
    public double getTotalPriceInCart(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            return cart.getTotalPrice();
        }
        return 0;
    }
}
