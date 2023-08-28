package com.sitech.book.mangment.book.store.mapper;

public class CartDto {
    private Long id;

    public CartDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
