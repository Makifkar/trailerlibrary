package com.mentor.trailerlibrary.business.abstracts;

import com.mentor.trailerlibrary.entity.Author;
import org.springframework.data.domain.Page;

public interface AuthorService {
    Author save(Author author);

    Author get(int id);

    Page<Author> cursor(int page, int pageSize);

    Author update(Author author);

    boolean delete(int id);
}
