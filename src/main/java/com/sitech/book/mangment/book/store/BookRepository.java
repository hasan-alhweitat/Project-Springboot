package com.sitech.book.mangment.book.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// This interface will provide you with basic CRUD operations for the Book entity.
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Custom query methods

    List<Book> findByCategory(String category);

    List<Book> findByYearGreaterThan(int year);

    List<Book> findByCategoryAndYearGreaterThan(String category, int year);

    List<Book> findByCartIsNull();

    List<Book> findByOrderIsNull();

    // You can add more custom query methods based on your needs
}
