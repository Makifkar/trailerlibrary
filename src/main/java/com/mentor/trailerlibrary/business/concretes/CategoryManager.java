package com.mentor.trailerlibrary.business.concretes;

import com.mentor.trailerlibrary.business.abstracts.CategoryService;
import com.mentor.trailerlibrary.entity.Category;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Category get(int id) {
        return null;
    }

    @Override
    public Page<Category> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }
}
