package com.sitech.book.mangment.book.store;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface will provide you with basic CRUD operations for the Book entity.
public interface BookRepository extends JpaRepository<Book, Long> {
    /* You can add custom query methods if needed */
}
