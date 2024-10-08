package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.dto.CartRequest;
import com.sitech.book.mangment.book.store.dto.CartResponse;
import com.sitech.book.mangment.book.store.entity.Cart;
import com.sitech.book.mangment.book.store.mapper.CartMapper;
import com.sitech.book.mangment.book.store.repository.CartRepository;
import com.sitech.book.mangment.book.store.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<CartResponse> getAllCarts() {
        List<Cart> cartDTOS = cartRepository.findAll();
        return cartMapper.toCartDTOs(cartDTOS);
    }

    @Override
    public CartResponse getCartById(Long id) throws ChangeSetPersister.NotFoundException{
        Cart cart = cartRepository.findById(id).orElse(null);
        if (cart != null) {
            return cartMapper.toCartDTO(cart);
        }
        return null;
    }

    @Override
    public CartResponse createCart(CartRequest cartRequest) {
        Cart cart = cartMapper.toCart(cartRequest);
        Cart savedCart = cartRepository.save(cart);
        return cartMapper.toCartDTO(savedCart);
    }

    @Override
    public CartResponse updateCart(Long id, CartRequest cartRequest) {
        Cart existingCart = cartRepository.findById(id).orElse(null);
        if (existingCart != null) {
            cartMapper.updateCartFromDTO(cartRequest, existingCart);
            Cart updatedCart = cartRepository.save(existingCart);
            return cartMapper.toCartDTO(updatedCart);
        }
        return null;
    }

    @Override
    public boolean deleteCart(Long id) {
        Cart existingCart = cartRepository.findById(id).orElse(null);
        if (existingCart != null) {
            cartRepository.delete(existingCart);
            return true;
        }
        return false;
    }

    /*
    @Override
    public void addBookToCart(Long cartId, Long bookId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Book book = bookRepository.findById(bookId).orElse(null);

        if (cart != null && book != null) {
            cart.addBook(book);
            cartRepository.save(cart);
        }
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
    }*/
}