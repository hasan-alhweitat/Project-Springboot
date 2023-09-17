package com.sitech.book.mangment.book.store.mapper;

import com.sitech.book.mangment.book.store.dto.BookDTO;
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
    BookDTO toBookDTO(Book book);
    List<BookDTO> toBookDTOs(List<Book> books);
    Book toBook(BookDTO bookDTO);
    @Mapping(target = "id", ignore = true)
    void updateBookFromDTO(BookDTO bookDTO, @MappingTarget Book book);
}
