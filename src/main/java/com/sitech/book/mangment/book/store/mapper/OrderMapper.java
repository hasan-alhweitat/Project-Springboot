package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.dto.OrderDTO;
import com.sitech.book.mangment.book.store.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDTO toOrderDTO(Order order);
    List<OrderDTO> toOrderDTOs(List<Order> orders);
    Order toOrder(OrderDTO orderDTO);
    @Mapping(target = "id", ignore = true)
    Order updateOrderFromDTO(OrderDTO orderDTO, @MappingTarget Order order);
}