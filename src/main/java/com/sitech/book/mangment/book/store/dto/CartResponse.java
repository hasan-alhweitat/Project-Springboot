package com.sitech.book.mangment.book.store.dto;

import java.math.BigDecimal;

public class CartResponse {
    private Long id;
    private BigDecimal totalPrice;

    public CartResponse() {
    }

    public CartResponse(BigDecimal totalPrice) {
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
