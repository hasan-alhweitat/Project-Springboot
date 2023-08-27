package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Book;

public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id);
    // Other methods for updating, deleting, listing books
}
