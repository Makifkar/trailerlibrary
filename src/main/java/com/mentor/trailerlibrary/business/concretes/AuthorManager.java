package com.mentor.trailerlibrary.business.concretes;

import com.mentor.trailerlibrary.business.abstracts.AuthorService;
import com.mentor.trailerlibrary.dataAccess.AuthorRepository;
import com.mentor.trailerlibrary.entity.Author;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorManager implements AuthorService{
    //TODO:eksik crud işlemleri yaz.
    private final AuthorRepository authorRepository;
    @Override
    public Author save(Author author) {

        return this.authorRepository.save(author);
    }

    @Override
    public Author get(int id) {
        Optional<Author> author = authorRepository.findById(id);
        return author.orElse(null);
    }

    @Override
    public Page<Author> cursor(int page, int pageSize) {

        return authorRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public Author update(Author author) {
        this.get(author.getId());
        return this.authorRepository.save(author);
    }

    @Override
    public boolean delete(int id) {
        Author author = this.get(id);
        this.authorRepository.delete(author);
        return true;
    }
}
