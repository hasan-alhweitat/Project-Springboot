package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.dto.BookRequest;
import com.sitech.book.mangment.book.store.dto.BookResponse;
import com.sitech.book.mangment.book.store.entity.Book;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface BookService {
    BookResponse createBook(BookRequest bookRequest);
    BookResponse getBookById(Long id)throws ChangeSetPersister.NotFoundException;
    BookResponse updateBook(Long id, BookRequest bookRequest);
    boolean deleteBook(Long id);
    List<BookResponse> getAllBooks();
    List<Book> findBooksByCategory(String category);
    List<Book> findBooksByYearGreaterThan(int year);
    List<Book> findBooksByCategoryAndYearGreaterThan(String category, int year);
}