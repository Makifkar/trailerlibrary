package com.mentor.trailerlibrary.api.controllers;

import com.mentor.trailerlibrary.business.abstracts.BookBorrowingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bookborrowing")
public class BookBorrowingController {
private final BookBorrowingService bookBorrowingService;

    public BookBorrowingController(BookBorrowingService bookBorrowingService) {
        this.bookBorrowingService = bookBorrowingService;
    }
}
