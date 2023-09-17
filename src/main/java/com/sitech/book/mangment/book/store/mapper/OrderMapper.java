package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.dto.OrderRequest;
import com.sitech.book.mangment.book.store.dto.OrderResponse;
import com.sitech.book.mangment.book.store.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderResponse toOrderDTO(Order order);
    List<OrderResponse> toOrderDTOs(List<Order> orders);
    Order toOrder(OrderRequest orderRequest);
    @Mapping(target = "id", ignore = true)
    void updateOrderFromDTO(OrderRequest orderRequest, @MappingTarget Order order);
}