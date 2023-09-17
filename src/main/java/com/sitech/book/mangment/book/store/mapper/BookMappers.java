package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.dto.BookRequest;
import com.sitech.book.mangment.book.store.dto.BookResponse;
import com.sitech.book.mangment.book.store.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper(componentModel = "spring")
public interface BookMappers {
    BookMappers INSTANCE = Mappers.getMapper(BookMappers.class);
    BookResponse toBookDTO(Book book);
    List<BookResponse> toBookDTOs(List<Book> books);
    Book toBook(BookRequest bookRequest);
    @Mapping(target = "id", ignore = true)
    void updateBookFromDTO(BookRequest bookRequest, @MappingTarget Book book);
}
