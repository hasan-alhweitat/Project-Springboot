package com.sitech.book.mangment.book.store.service.impl;

import com.sitech.book.mangment.book.store.Book;
import com.sitech.book.mangment.book.store.BookRepository;
import com.sitech.book.mangment.book.store.service.BookService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        try {
            return bookRepository.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = getBookById(id);
        existingBook.setBookName(updatedBook.getBookName());
        existingBook.setYear(updatedBook.getYear());
        existingBook.setCategory(updatedBook.getCategory());
        return bookRepository.save(existingBook);
    }

    @Override
    public void deleteBook(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
    }
}
