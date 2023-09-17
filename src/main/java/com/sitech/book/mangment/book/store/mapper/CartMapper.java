package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.dto.CartRequest;
import com.sitech.book.mangment.book.store.dto.CartResponse;
import com.sitech.book.mangment.book.store.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);
    CartResponse toCartDTO(Cart cart);
    List<CartResponse> toCartDTOs(List<Cart> carts);
    Cart toCart(CartRequest cartRequest);
    @Mapping(target = "id", ignore = true)
    void updateCartFromDTO(CartRequest cartRequest, @MappingTarget Cart cart);
}