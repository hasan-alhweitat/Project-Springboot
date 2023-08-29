package com.sitech.book.mangment.book.store.controller;

import com.sitech.book.mangment.book.store.Cart;
import com.sitech.book.mangment.book.store.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public ResponseEntity<Cart> createCart() {
        Cart cart = cartService.createCart();
        return ResponseEntity.ok(cart);
    }

    @PostMapping("/{cartId}/books/{bookId}")
    public ResponseEntity<Cart> addToCart(@PathVariable Long cartId, @PathVariable Long bookId) throws Throwable {
        Cart cart = cartService.addToCart(cartId, bookId);
        return ResponseEntity.ok(cart);
    }

    @DeleteMapping("/{cartId}/books/{bookId}")
    public ResponseEntity<Void> removeFromCart(@PathVariable Long cartId, @PathVariable Long bookId) throws Throwable {
        cartService.removeFromCart(cartId, bookId);
        return ResponseEntity.noContent().build();
    }
}
