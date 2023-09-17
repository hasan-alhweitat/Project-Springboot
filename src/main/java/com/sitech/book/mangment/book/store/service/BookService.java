package com.sitech.book.mangment.book.store.service;

import com.sitech.book.mangment.book.store.dto.BookDTO;
import com.sitech.book.mangment.book.store.entity.Book;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    BookDTO getBookById(Long id)throws ChangeSetPersister.NotFoundException;
    BookDTO updateBook(Long id, BookDTO bookDTO);
    boolean deleteBook(Long id);
    List<BookDTO> getAllBooks();
    List<Book> findBooksByCategory(String category);
    List<Book> findBooksByYearGreaterThan(int year);
    List<Book> findBooksByCategoryAndYearGreaterThan(String category, int year);
}