package com.sitech.book.mangment.book.store.mapper;


import com.sitech.book.mangment.book.store.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

@Mapper
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);

    @Mapping(target = "id", ignore = true)
    Cart cartToCart(Cart cart);
}
