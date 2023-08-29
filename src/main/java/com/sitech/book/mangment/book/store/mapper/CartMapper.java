package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto cartToCartDto(Cart cart);

    Cart cart(Cart cart);
}
