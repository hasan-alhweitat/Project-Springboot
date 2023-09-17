package com.sitech.book.mangment.book.store.controller;

import com.sitech.book.mangment.book.store.dto.CartRequest;
import com.sitech.book.mangment.book.store.dto.CartResponse;
import com.sitech.book.mangment.book.store.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public ResponseEntity<CartResponse> createCart(@RequestBody CartRequest cartDTO) {
        CartResponse createdCart = cartService.createCart(cartDTO);
        return new ResponseEntity<>(createdCart, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CartResponse>> getAllCarts() {
        List<CartResponse> cartsDtos = cartService.getAllCarts();
        return new ResponseEntity<>(cartsDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartResponse> getCartById(@PathVariable Long id)throws ChangeSetPersister.NotFoundException {
        CartResponse cartDTO = cartService.getCartById(id);
        if (cartDTO != null) {
            return new ResponseEntity<>(cartDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartResponse> updateCart(@PathVariable Long id, @RequestBody CartRequest cartDTO) {
        CartResponse updatedCart = cartService.updateCart(id, cartDTO);
        if (updatedCart != null) {
            return new ResponseEntity<>(updatedCart, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long id) {
        boolean deleted = cartService.deleteCart(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}