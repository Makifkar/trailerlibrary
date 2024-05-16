package com.mentor.trailerlibrary.business.abstracts;

import com.mentor.trailerlibrary.entity.Publisher;
import org.springframework.data.domain.Page;

public interface PublisherService {
    Publisher save(Publisher publisher);
    Publisher get(int id);
    Page<Publisher> cursor(int page, int pageSize);
    Publisher update(Publisher publisher);
    boolean delete(int id);
}
