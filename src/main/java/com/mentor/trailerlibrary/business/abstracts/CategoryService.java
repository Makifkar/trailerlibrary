package com.mentor.trailerlibrary.business.abstracts;

import com.mentor.trailerlibrary.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Category save(Category category);

    Category get(int id);

    Page<Category> cursor(int page, int pageSize);

    Category update(Category category);

    //TODO: dto response. şimdilik yoruma al.
    //CategoryResultResponse delete(int id);
}
