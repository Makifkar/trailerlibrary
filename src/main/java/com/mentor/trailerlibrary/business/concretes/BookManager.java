package com.mentor.trailerlibrary.business.concretes;

import com.mentor.trailerlibrary.business.abstracts.BookService;
import com.mentor.trailerlibrary.dataAccess.BookRepository;
import com.mentor.trailerlibrary.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookManager implements BookService {
    //TODO:crud işlemleri yaz.
    private final BookRepository bookRepository;
    @Override
    public Book save(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public Book get(int id) {
        return null;
    }

    @Override
    public Page<Book> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public Book update(Book book) {
        this.get(book.getId());
        return this.bookRepository.save(book);
    }

    @Override
    public boolean delete(int id) {
        Book book = this.get(id);
        this.bookRepository.delete(book);
        return true;
    }
}
