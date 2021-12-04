package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ages.task.entity.Category;
import uz.ages.task.entity.Detail;
import uz.ages.task.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/get")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/category")
    public ResponseEntity create(@RequestBody Category category) {
        Category category1 = categoryService.save(category);
        return ResponseEntity.ok(category1);
    }

    @GetMapping("/categoryAll")
    public ResponseEntity getAll() {
        List<Category> categoryList = categoryService.findAll();
        return ResponseEntity.ok(categoryList);
    }
}
