package com.mentor.trailerlibrary.business.concretes;

import com.mentor.trailerlibrary.business.abstracts.PublisherService;
import com.mentor.trailerlibrary.dataAccess.PublisherRepository;
import com.mentor.trailerlibrary.entity.Publisher;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublisherManager implements PublisherService {

    private final PublisherRepository publisherRepository;
    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepository.save(publisher);
    }

    @Override
    public Publisher get(int id) {
        return null;
    }

    @Override
    public Page<Publisher> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public Publisher update(Publisher publisher) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
