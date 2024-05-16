package com.mentor.trailerlibrary.business.abstracts;

import com.mentor.trailerlibrary.entity.Book;
import org.springframework.data.domain.Page;

public interface BookService {
    Book save(Book book);

    Book get(int id);

    Page<Book> cursor(int page, int pageSize);

    Book update(Book book);

    boolean delete(int id);
}
