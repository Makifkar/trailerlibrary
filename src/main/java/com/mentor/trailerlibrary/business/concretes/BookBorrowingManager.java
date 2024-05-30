package com.mentor.trailerlibrary.business.concretes;

import com.mentor.trailerlibrary.business.abstracts.BookBorrowingService;
import com.mentor.trailerlibrary.entity.BookBorrowing;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookBorrowingManager implements BookBorrowingService {
    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return null;
    }

    @Override
    public BookBorrowing get(int id) {
        return null;
    }

    @Override
    public Page<BookBorrowing> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
