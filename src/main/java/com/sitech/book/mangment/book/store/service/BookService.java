package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Book;

public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
