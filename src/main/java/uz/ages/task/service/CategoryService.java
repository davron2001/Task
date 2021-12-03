package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Category;
import uz.ages.task.entity.Order;
import uz.ages.task.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
