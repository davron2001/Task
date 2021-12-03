package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ages.task.entity.Product;
import uz.ages.task.service.ProductService;

@RestController
@RequestMapping("/get")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("protuct")
    public ResponseEntity create(Product product){
        Product product1 = productService.save(product);
        return ResponseEntity.ok(product1);
    }
}
