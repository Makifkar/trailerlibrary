package com.mentor.trailerlibrary.dataAccess;


import com.mentor.trailerlibrary.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Integer> {
}
