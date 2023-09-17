package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.dto.CartDTO;
import com.sitech.book.mangment.book.store.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);
    CartDTO toCartDTO(Cart cart);
    List<CartDTO> toCartDTOs(List<Cart> carts);
    Cart toCart(CartDTO cartDTO);
    @Mapping(target = "id", ignore = true)
    Cart updateCartFromDTO(CartDTO cartDTO, @MappingTarget Cart cart);
}