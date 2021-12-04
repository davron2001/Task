package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Order;
import uz.ages.task.entity.Product;
import uz.ages.task.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
