package com.sitech.book.mangment.book.store.dto;

import java.time.LocalDateTime;

public class OrderDTO {
    private Long id;
    private String nameOrder;
    private LocalDateTime orderDate;

    public OrderDTO() {
    }

    public OrderDTO(String nameOrder) {
        this.nameOrder = nameOrder;
        this.orderDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", nameOrder='" + nameOrder + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}