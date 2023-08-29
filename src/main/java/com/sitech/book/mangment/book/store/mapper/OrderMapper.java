package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(target = "id", ignore = true)
    Order orderToOrder(Order order);
}

