package com.sitech.book.mangment.book.store.dto;

import java.math.BigDecimal;

public class CartRequest {
    private Long id;
    private BigDecimal totalPrice;

    public CartRequest() {
    }

    public CartRequest(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
