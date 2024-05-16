package com.mentor.trailerlibrary.business.abstracts;

import com.mentor.trailerlibrary.entity.BookBorrowing;
import org.springframework.data.domain.Page;

public interface BookBorrowingService {

    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing get(int id);
    Page<BookBorrowing> cursor(int page, int pageSize); //page data domain
    BookBorrowing update(BookBorrowing bookBorrowing);
    boolean delete(int id);
}
