package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.Book;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id) throws ChangeSetPersister.NotFoundException;
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);

    List<Book> getAllBooks();

    List<Book> findBooksByCategory(String category);

    List<Book> findBooksByYearGreaterThan(int year);

    List<Book> findBooksByCategoryAndYearGreaterThan(String category, int year);
}
