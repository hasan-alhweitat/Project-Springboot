package com.sitech.book.mangment.book.store.service.impl;


import com.sitech.book.mangment.book.store.dto.BookDTO;
import com.sitech.book.mangment.book.store.entity.Book;
import com.sitech.book.mangment.book.store.mapper.BookMappers;
import com.sitech.book.mangment.book.store.repository.BookRepository;
import com.sitech.book.mangment.book.store.service.BookService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMappers bookMappers;

    // Method to retrieve all books
    @Override
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return bookMappers.toBookDTOs(books);
    }

    @Override
    public BookDTO getBookById(Long id)throws ChangeSetPersister.NotFoundException{
        Book book = bookRepository.findById(id).orElse(null);
        if (book != null) {
            return bookMappers.toBookDTO(book);
        }
        return null;
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = bookMappers.toBook(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMappers.toBookDTO(savedBook);
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) {
            bookMappers.updateBookFromDTO(bookDTO, existingBook);
            Book updatedBook = bookRepository.save(existingBook);
            return bookMappers.toBookDTO(updatedBook);
        }
        return null;
    }

    @Override
    public boolean deleteBook(Long id) {
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) {
            bookRepository.delete(existingBook);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> findBooksByCategory(String category) {
        return bookRepository.findByCategory(category);
    }

    @Override
    public List<Book> findBooksByYearGreaterThan(int year) {
        return bookRepository.findByYearGreaterThan(year);
    }

    @Override
    public List<Book> findBooksByCategoryAndYearGreaterThan(String category, int year) {
        return bookRepository.findByCategoryAndYearGreaterThan(category, year);
    }

}