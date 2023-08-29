package com.sitech.book.mangment.book.store.controller;

import com.sitech.book.mangment.book.store.Cart;
import com.sitech.book.mangment.book.store.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {
    private final CartService cartService;
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public ResponseEntity<Cart> createCart() {
        Cart createdCart = cartService.createCart();
        return new ResponseEntity<>(createdCart, HttpStatus.CREATED);
    }

    @PostMapping("/{cartId}/addBook/{bookId}")
    public ResponseEntity<Void> addBookToCart(
            @PathVariable Long cartId,
            @PathVariable Long bookId) {
        cartService.addBookToCart(cartId, bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/{cartId}/removeBook/{bookId}")
    public ResponseEntity<Void> removeBookFromCart(
            @PathVariable Long cartId,
            @PathVariable Long bookId) {
        cartService.removeBookFromCart(cartId, bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // Additional methods can be added here for custom queries or operations
}